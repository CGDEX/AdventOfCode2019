import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day5 {




    private int[] array ;

    public Day5() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
        try {
            array = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }
    public int run(int input) {
        int fdz [] = new int[array.length];
        System.arraycopy(array,0,fdz,0,array.length);
        int i=0;
        int output=0;

        while(fdz[i]!=99) {

            // Opcode 1
            if (fdz[i]==1) {
                fdz[fdz[i+3]] = fdz[fdz[i+1]] + fdz[fdz[i+2]];
                i+=4;
            }

            // Opcode 2
            else if (fdz[i]==2){
                fdz[fdz[i+3]] = fdz[fdz[i+1]] * fdz[fdz[i+2]];
                i+=4;
            }

            //Opcode 3
            else if (fdz[i]==3) {
                fdz[fdz[i+1]] = input;
                i+=2;
            }
            else if (fdz[i]==4){
                output = fdz[fdz[i+1]];
                System.out.println(output);
                i+=2;
            }
            else if (fdz[i]==101) {
                fdz[fdz[i+3]] = fdz[i+1] + fdz[fdz[i+2]];
                i+=4;
            }
            else if (fdz[i]==1001) {
                fdz[fdz[i+3]] = fdz[fdz[i+1]] + fdz[i+2];
                i+=4;
            }
            else if (fdz[i]==1101) {
                fdz[fdz[i+3]] = fdz[i+1] + fdz[i+2];
                i+=4;
            }
            else if (fdz[i]==102) {
                fdz[fdz[i+3]] = fdz[i+1] * fdz[fdz[i+2]];
                i+=4;
            }
            else if (fdz[i]==1002) {
                fdz[fdz[i+3]] = fdz[fdz[i+1]] * fdz[i+2];
                i+=4;
            }

            else if(fdz[i]==1102) {
                fdz[fdz[i+3]] = fdz[i+1] * fdz[i+2];
                i+=4;
            }
            else if(fdz[i]==103) {
                fdz[i+1] = input;
                i+=2;
            }
            else {
                output = fdz[i+1];
                i+=2;
            }
        }

        System.out.println(output);
        return fdz[0];
    }









}
