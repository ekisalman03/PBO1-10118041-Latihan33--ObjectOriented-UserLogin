/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118041.latihan33.objectoriented.userlogin;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Eki salman sya'bani
 * KELAS    : IF-1
 * NIM      : 10118041
 * Deskripsi Program : Program ini untuk menampilkan tampilan login.
 */
public class PBO110118041Latihan33ObjectOrientedUserLogin {

    /**
     * @param args the command line arguments
     */
        
        private static String usName;
        private static String passWord;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName,passWord);

    }
    
}
