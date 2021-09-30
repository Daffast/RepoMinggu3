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
public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        String str = sc.nextLine();
        String splitStr[] = str.split("[!@,.'_\\s]+");
        System.out.println(splitStr.length);
        for(String y : splitStr){
            System.out.println(y);
        }
    }
}
