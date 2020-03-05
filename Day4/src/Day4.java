import java.util.stream.IntStream;

public class Day4 {

    private String inicio;
    private String fim;


    public Day4(String input) {
        String[] array = input.split("-");
        inicio = array[0];
        fim = array[1];
    }


    public String getInicio() {
        return inicio;
    }

    public String getFim() {
        return fim;
    }

    public boolean verificaCondicoes(char[] password) {
        boolean hasPair = false;
        for (int i = 0; i<password.length-1; i++) {
            char current = password[i];
            char after = password[i+1];

            if(current>after) return false;
            if (current==after) hasPair = true;
        }

        return hasPair;

    }


    public boolean verificaCondicoesExtra(char[] password) {
//        boolean hasPair = false;
        int occur[] = new int[10];
        for (int i = 0; i<password.length-1; i++) {
            char current = password[i];
            char after = password[i+1];

            if(current>after) return false;
            if (current==after) {
  //              hasPair = true;
                occur[Integer.parseInt(String.valueOf(current))]++;
            }
        }


        for(int ocorrencias : occur) {
            if(ocorrencias==1) return true;
        }

        return false;
    }

    public long quantasPasswords() {
        int inicioR =  Integer.parseInt(inicio);
        int fimR = Integer.parseInt(fim);


       // long candidatos = IntStream.rangeClosed(inicioR,fimR).mapToObj(Integer::toString).map(String::toCharArray).filter(this::verificaCondicoes).count();
        long candidatos = IntStream.rangeClosed(inicioR,fimR).mapToObj(Integer::toString).map(String::toCharArray).filter(this::verificaCondicoesExtra).count();

        return candidatos;
    }


}
