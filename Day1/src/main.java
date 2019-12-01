import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class main {



    public static void part1(ArrayList<Integer> modules) {

    }
    public static void main(String[] args) throws IOException {
        ArrayList <String> array = new ArrayList<>(Files.readAllLines(Paths.get("input.txt")));
        modulo test = new modulo();
        test.part1(array);
        int d = test.fuelRecursivo(100756);
        System.out.println(d);
        test.part2(array);

    }



}
