package principal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CharCounter {
    private int [] vocales;
    private boolean caseSensibility;
    private int charCounter;
    private ArrayList<Character> cadena;

    public CharCounter(int [] vocales, boolean caseSensibility){
        this.vocales=vocales;
        this.caseSensibility=caseSensibility;
        this.charCounter=0;
    }
    public  void countIfTargeted(char c){
        for (int i=0; i<vocales.length; i++){
            if (c==vocales[i]){
                charCounter++;
            }
        }
    }

    public void leerCadena(){
        try {
            String INPUT_NAME = "input.txt";
            FileReader input = new FileReader (INPUT_NAME);
            char c= (char) input.read();
            while (c!=(-1)) {
                this.cadena.add(c);
                 c = (char) input.read();
            }
            input.close();
        } catch (IOException ex) {
            System.out.println("Something bad has happended :-‐‐()");
        }
    }
    public void escribirCadena(){
        try {
            String OUTPUT_NAME = "output.txt";
            FileWriter output = new FileWriter(OUTPUT_NAME);
            Collections.reverse(this.cadena);
            for(int i=0; i<this.cadena.size(); i++) {
                output.write(this.cadena.get(i));
            }
            output.close();
        } catch (IOException ex) {
            System.out.println("Something bad has happended :-‐‐()");
        }
    }

    @Override
    public String toString(){return ""+charCounter;}
}
