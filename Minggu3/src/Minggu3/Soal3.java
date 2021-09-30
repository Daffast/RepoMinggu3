/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;

import java.util.Scanner;
/**
 *
 * @author daffa
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        String str;
        str = sc.nextLine();
        String value[] = str.split(" ");
        a = Integer.parseInt(value[0]);
        b = Integer.parseInt(value[2]);
        
        if(a >= 1 && a <= 1000 && b >= 1 && b <= 1000){
            switch(value[1]){
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "%":
                    System.out.println(a % b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;   
                default :
                    System.out.println("Operator salah");
                    break;
            }
        }
        else{
            System.out.println("Angka melebihi limit");
        }
    }
}
