import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class day3 {

    private String[] wire1;
    private String[] wire2;


    public day3() {
        try {
            // Ler o ficheiro e dar split para os arrays
            BufferedReader br = new BufferedReader((new FileReader("src/input.txt")));
            wire1 = br.readLine().split(",");
            wire2 = br.readLine().split(",");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Ponto> wirePoints(String[] wires) {
        // Definir o array list resultante
        ArrayList<Ponto> resultado = new ArrayList<>();


        // Adicionar o ponto inicial ao arraylist resultante
        Ponto pontoInicial = new Ponto();
        resultado.add(pontoInicial);

        // Percorrer os arrays wires
        for (int i = 0; i < wires.length; i++) {


            Ponto lastPoint;

            switch (wires[i].charAt(0)) {

                case 'R':
                    for (int j=0; j < Integer.parseInt(wires[i].substring(1)); j++) {
                        lastPoint = resultado.get(resultado.size()-1);
                        Ponto novoPonto = new Ponto(lastPoint.getX() + 1, lastPoint.getY());
                        resultado.add(novoPonto);
                    }
                    break;
                case 'L':
                    for (int j=0; j<Integer.parseInt(wires[i].substring(1)); j++) {
                        lastPoint = resultado.get(resultado.size()-1);
                        Ponto novoPonto = new Ponto(lastPoint.getX() - 1, lastPoint.getY());
                        resultado.add(novoPonto);
                    }
                    break;

                case 'U':
                    for (int j=0; j<Integer.parseInt(wires[i].substring(1)); j++) {
                        lastPoint = resultado.get(resultado.size()-1);
                        Ponto novoPonto = new Ponto(lastPoint.getX(), lastPoint.getY() + 1);
                        resultado.add(novoPonto);
                    }
                    break;
                case 'D':
                    for (int j=0; j<Integer.parseInt(wires[i].substring(1)); j++) {
                        lastPoint = resultado.get(resultado.size()-1);
                        Ponto novoPonto = new Ponto(lastPoint.getX(), lastPoint.getY() - 1);
                        resultado.add(novoPonto);
                    }
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + wires[i].charAt(0));
            }
        }


        return resultado;
    }


    public ArrayList<Ponto>  pontosCruzados(ArrayList<Ponto> wires1 , ArrayList<Ponto> wires2) {

        ArrayList<Ponto> resultado = new ArrayList<>();

        for (int i=1; i < wires1.size(); i++) {
            for (int j=1; j < wires2.size(); j++) {
                if(wires1.get(i).getX() == wires2.get(j).getX() && wires1.get(i).getY() == wires2.get(j).getY()) resultado.add(wires1.get(i));
            }
        }



        return resultado;
    }






    public String[] getWire1() {
        return wire1;
    }


    public String[] getWire2() {
        return wire2;
    }
}
