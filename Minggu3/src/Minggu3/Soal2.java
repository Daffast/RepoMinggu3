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
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        String inpoet;
        String kata[] = new String[3];
        int angka[] = new int[3];
        
        while(x < 3){
            inpoet = sc.nextLine();
            String value[] = inpoet.split(" ");
            kata[x] = value[0];
            angka[x] = Integer.parseInt(value[1]);
            if(kata[x].length() >= 10 || angka[1] >= 999){
                System.out.println("Kata atau angka melebihi limit");
                break;
            }
            x++;
        }
        x = 0;
        System.out.println("==============================");
        while(x < 3){
            System.out.println(String.format("%-15s", kata[x]) + String.format("%03d", angka[x]));
            x++;
        }
        System.out.println("==============================");
    }
}
