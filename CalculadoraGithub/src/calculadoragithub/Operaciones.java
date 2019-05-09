/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragithub;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Operaciones {
    Scanner sc = new Scanner(System.in);
    private int num1, num2, result;
    
    public void Numeros(){
        System.out.println("Introduzca el primer número");
        num1=sc.nextInt();
        System.out.println("Introduzca el segundo número");
        num2=sc.nextInt();
    }
    
    public void Suma(){
        result=num1+num2;
        System.out.println(num1+ " + "+num2+" = "+result);
    }
    
        public void Resta(){
        result=num1-num2;
        System.out.println(num1+ " - "+num2+" = "+result);
    }
    
        public void Multip(){
        result=num1*num2;
        System.out.println(num1+ " * "+num2+" = "+result);
    }
    
        public void Div(){
        result=num1/num2;
        System.out.println(num1+ "  "+num2+" = "+result);
    }
}
