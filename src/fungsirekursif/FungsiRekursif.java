/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsirekursif;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class FungsiRekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input data
        Scanner masukan = new Scanner(System.in);
        //deklarasi variabel
        int bil, hasil;
        // input data dari user dan inisialisasi variabel
        System.out.print("Masukan Suatu Bilangan : ");
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        //Proses output
        System.out.println("Nilai Faktorial " + bil + " Adalah " + hasil);
    }

    // method faktorial
    private static int faktorial(int a){
        if (a == 1) {
            return 1;
        } else {
            return (a * faktorial(a - 1));
        }

    }
}
