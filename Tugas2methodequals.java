/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author ACER
 */
public class Tugas2methodequals {
     public static void main(String[] args) {
        String st1="saya suka makan bakso";
        String st2 ="saya suka makan bakso";
        String st3 ="saya bakso ";
        String st4 ="makan ";
        String st5 ="bakso";
        String st6 =st3+st4+st5;
        System.out.println("st 1 : "+ st1);
        System.out.println("st 2 : "+ st2);
        System.out.println("st 3 : "+ st3);
        System.out.println("st 4 : "+ st4);
        System.out.println("st 5 : "+ st5);
        System.out.println("st 6 : "+ st6);
        System.out.println("Membandingan dengan Operator ==");
        System.out.println("st 1 == st 2 : "+ (st1==st2));
        System.out.println("st 6 == st 1 : "+ (st6==st1));
        System.out.println("st 6 == st 2 : "+ (st6==st2));
        System.out.println("Membandingan dengan Metode equal");
        System.out.println("statement1.equal(st2): "+(st1.equals(st2)));
        System.out.println("statement6.equal(st1): "+(st6.equals(st1)));
        System.out.println("statement6.equal(st2): "+(st6.equals(st2)));
        System.out.println("jadi kesimpulannya perbandingan menggunakan operator == hanya true pada statement 1 banding statement 2 selain itu false");
        System.out.println("sementara pada metode equel semuanya true");
    }

} 
   
