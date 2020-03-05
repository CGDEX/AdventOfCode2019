import java.util.ArrayList;

public class main {


    public static void main(String[] args) {

        day3 day = new day3();
        ArrayList<Ponto> wires1 = day.wirePoints(day.getWire1());
        ArrayList<Ponto> wires2 = day.wirePoints(day.getWire2());


       // ArrayList<Ponto> resultado =day.pontosCruzados(wires1,wires2);



        wires1.retainAll(wires2);
        for (Ponto p : wires1) {
            System.out.println (Math.abs(p.getX()) + Math.abs(p.getY()));
        }
    }

}

