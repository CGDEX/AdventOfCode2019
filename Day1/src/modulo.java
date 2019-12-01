import java.util.ArrayList;

public class modulo {

    public void part1 (ArrayList <String> list) {
        Integer s = list.parallelStream().mapToInt(m->(((Integer.parseInt(m))/3)-2)).sum();
        System.out.println(s);
    }

    public void part2(ArrayList<String> list) {
        Integer s = list.parallelStream().mapToInt(m -> fuelRecursivo(Integer.parseInt(m))).sum();
        System.out.println(s);
    }

    public int fuelRecursivo(int m) {
        return (m/3)-2< 0 ? 0 : ((m/3)-2)+fuelRecursivo((m/3)-2);
    }
}
