/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leap.vowels;

import java.util.Scanner;

/**
 *
 * @author Karan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char ch = a.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is vowel");

        }else{
            System.out.println("It is consonant");
    }
    // TODO code application logic here
}

}
