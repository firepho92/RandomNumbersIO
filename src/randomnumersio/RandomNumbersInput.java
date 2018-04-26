/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumersio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class RandomNumbersInput {
    private ArrayList numeros;

    public RandomNumbersInput() {
    }

    public ArrayList getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList numeros) {
        this.numeros = numeros;
    }
    
    public void readNumbersFromFile(){
        try{
            this.numeros = new ArrayList();
            File f = new File("NumerosAleatorios.txt");
            Scanner s =  new Scanner(f);
            s.useDelimiter(",");
            
            while(s.hasNext()){
                String str = "";
                try{
                    str = s.next();
                    double n = Double.parseDouble(str);
                    numeros.add(n);
                }catch(NumberFormatException e){
                    System.out.println("Se encontró un elemento de tipo: " + str.getClass().getName() + ": " + str);
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
