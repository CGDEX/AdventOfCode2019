import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class day2 {


    private int[] array ;

    public day2() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
        try {
            array = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }
    public int run(int noun, int verb) {
         int fdz [] = new int[array.length];
         System.arraycopy(array,0,fdz,0,array.length);
         fdz[1] = noun;
         fdz[2] = verb;
        int i=0;
        while(fdz[i]!=99) {
            if (fdz[i]==1) fdz[fdz[i+3]] = fdz[fdz[i+1]] + fdz[fdz[i+2]];
            else fdz[fdz[i+3]] = fdz[fdz[i+1]] * fdz[fdz[i+2]];
            i+=4;
        }
        System.out.println("Noun = " + noun + "verb " + verb);
        System.out.println(fdz[0]);
        return fdz[0];
    }

    public int part1 () {
        return run(12,2);

    }


    public int part2( ) {
        int goal = 19690720;

        for (int i=0; i<100;i++) {
            for (int j=0;j<100;j++) {

                if (run(i,j)==goal) {
                    System.out.println("i = " + i + " j = " + j);
                    return 100*i+j;
                }
            }
        }
        return 0;
    }

}


