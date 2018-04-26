/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumersio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 
 * @author alex
 */
public class RandomNumersIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandomNumbersOutput rno = new RandomNumbersOutput();
        RandomNumbersInput rni = new RandomNumbersInput();
        StatisticMethods sm = new StatisticMethods();
        ArrayList numeros = new ArrayList();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe la cantidad de números a escribir");
        rno.setTamano(in.nextInt());
        
        rno.generateRandomNumbersAndWrite();
        
        rni.readNumbersFromFile();
        
        numeros = rni.getNumeros();
        
        System.out.println("\n");
        
        for(Object numero : numeros){
            System.out.println(numero);
        }
        
        sm.setNumbers(numeros);
        
        System.out.println("Promedio: " + sm.mean() + ", mediana: " + sm.median() + ", moda: " + sm.mode() +  ", máximo: " + sm.max() + ", mínimo: " + sm.min());
    }
    
}
