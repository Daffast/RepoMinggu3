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
public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalJual = sc.nextInt();
        int gajiPokok;
        
        if(totalJual >= 40){
            gajiPokok = 500000 + ((totalJual * 50000) * 25/100);
            System.out.println(gajiPokok);
        }
        else if(totalJual >= 80){
            gajiPokok = 500000 + ((totalJual * 50000) * 35/100);
            System.out.println(gajiPokok);
        }
        else if(totalJual < 15){
            gajiPokok = 500000 - ((50000 * (15 - totalJual)) * 15/100);
            System.out.println(gajiPokok);
        }
        else{
            gajiPokok = 500000 + ((50000 * 10/100) * totalJual);
            System.out.println(gajiPokok);
        }
    }
}
