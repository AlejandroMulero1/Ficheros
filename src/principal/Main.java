package principal;
import java.io.*;

public class Main {
    /*
    private static String INPUT_NAME = "input.txt";
    private static String OUTPUT_NAME = "output.txt";
    private static int[] VOCALS = {97, 101, 105, 111, 117};

    public static void main(String[] args) {

         try {
             CharCounter counters = new CharCounter(VOCALS, false);
             FileReader input = new FileReader (INPUT_NAME);
             FileWriter output = new FileWriter(OUTPUT_NAME);
             int c = input.read();
             while (c!=(-1)) {
                 counters.countIfTargeted((char) c);
                 c = input.read();
                 }
            input.close();
             System.out.println(counters.toString());
             } catch (IOException ex) {
             System.out.println("Something bad has happended :-‐‐()");
             }
         }
  */
    private static int[] VOCALS = {97, 101, 105, 111, 117};
    public static void main(String[] args) {
        CharCounter counters = new CharCounter(VOCALS, false);
        counters.leerCadena();
        counters.escribirCadena();
    }
 }
