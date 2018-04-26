/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumersio;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class StatisticMethods {
    private ArrayList numbers;
    
    public StatisticMethods(){}

    public ArrayList getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList numbers) {
        this.numbers = numbers;
    }
    
    public double mean(){
        int len = this.numbers.size();
        double add = 0, mean = 0;
        for(Object n : this.numbers){
            add += (Double)n;
        }
        mean = add / len;
        return mean;
    }
    
    public double median(){
        double median, add;
        int len, numerator = 0;
        Object arr[] = this.numbers.toArray();
        Arrays.sort(arr);
        len = arr.length;
        if(len % 2 == 0){
            add = (Double)arr[(len / 2) - 1] + (Double)arr[(len / 2)];
            median = add / 2;
        }else{
            median = (Double)arr[(len / 2) - 1];
        }
        return median;
    }
        
    public double mode() {
        Object a[] = this.numbers.toArray();
        double maxValue = 0, maxCount = 0;

        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if ((Double)a[j] == (Double)a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = (Double)a[i];
            }
        }

        return maxValue;
    }
    
    public double max(){
        double max;
        int len;
        Object arr[] = this.numbers.toArray();
        Arrays.sort(arr);
        len = arr.length;
        max = (Double)arr[len - 1];
        return max;
    }
    
    public double min(){
        double max;
        int len;
        Object arr[] = this.numbers.toArray();
        Arrays.sort(arr);
        len = arr.length;
        max = (Double)arr[0];
        return max;
    }
    
}
