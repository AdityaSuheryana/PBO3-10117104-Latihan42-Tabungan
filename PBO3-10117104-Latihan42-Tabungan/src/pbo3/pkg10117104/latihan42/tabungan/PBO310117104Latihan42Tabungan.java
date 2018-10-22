/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Kelas : PBO3 / IF-3
 * NIM : 10117104
 * Deskripsi Program : Menampilkan hasil dari penarikan uang tabungan 
 * yang di input oleh keboard user 
 * 
 */
public class PBO310117104Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int D;
        System.out.println("====Program Penarikan Uang====");
        Tabungan T = new Tabungan();
        
        System.out.printf("Masukan Saldo Awal : ");
        T.Tabungan(scn.nextInt());
        System.out.printf("Jumlah uang yang akan diambil : ");
        D = scn.nextInt();
       
        System.out.println("Saldo Anda Sekarang : "+ T.ambilUang(D));
    }
    
}
