/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumersio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alex
 */
public class RandomNumbersOutput {
    int tamano;
    
    public RandomNumbersOutput(){
        
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    public void generateRandomNumbersAndWrite(){
        Random r = new Random();
        int denominador = 0;
        double result = 0.0;
        try{
            FileWriter fw = new FileWriter("NumerosAleatorios.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i < this.tamano; i++){
                try{
                    denominador = r.nextInt(10);
                    if(denominador == 0){
                        bw.write(0.0 + ",");
                    }else{
                        result = 8.0 / denominador;
                        bw.write(result + ",");
                    }
                }catch(ArithmeticException e){
                    System.out.println("Error en la escritura");
                }
            }
            bw.close();
        }catch(IOException e){
            System.out.println("Error no se puede dividir entre 0");
        }
    }
}
