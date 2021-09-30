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
public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String value = str.replaceAll("\\s", "");
        System.out.println((Long.parseLong(value) - 999999) % 5);
        
        if((Long.parseLong(value) - 999999) % 5 == 0){
            System.out.println("Berhenti");
        }
        else{
            System.out.println("Jalan");
        }
    }
}
