/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesai;

import static java.lang.Math.pow;
import java.util.Random;

/**
 *
 * @author MBP
 */
public class menghitung {
    
    menghitung(){
    }
       //f(x_1,x_2 )= (4-2,1x_1^2+(x_1^4)/3) x_1^2+x_1 x_2+(-4+4x_2^2 ) x_2^2
    double ngetangrumus(double x1, double x2){
        double hasil = (4-(2.1*(pow(x1,2)))+((pow(x1,4))/3))*pow(x1,2);
        double satu = ((x1*x2)+((-4+(4*(pow(x2,2))))*pow(x2,2)));
        double hasilna = hasil + satu;
        return hasilna;
        
    }
    
    double random(){
//        Random r = new Random();
//        double randomValue = 0 + (1-0) * r.nextDouble();
//        return randomValue;
//        double random = Math.random() * 1 + 0;
//        return random;
          double randomin = 0 + (double) (Math.random()*1);
          return randomin;
//    double randomin = ThreadLocalRandom.current().nextDouble(0, 1);
//    return randomin;
    }
    double randomX(){
        
//        double randomin = ThreadLocalRandom.current().nextDouble(-10, 10);
//        return randomin;
//        double random = Math.random() * 10 + (-10);
//        return random;
//        double randomin = -10 + (double) (Math.random()*20);
//        return randomin;
          Random r = new Random();
          double randomvalue = -10 + (10+10)* r.nextDouble();
          return randomvalue;
//        double random = new Random().nextDouble();
//        double result = -10 + (random *(10+10));
//        return result;
    }
    
}
