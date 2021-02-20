/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pbo2.pkg10116378.sriutaminingsih.pkg6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Sri Utami Ningsih 
 * Kelas : PBO-2
 * NIm : 10116378
 */
public class UASPBO210116378SRIUTAMININGSIH6 {


    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        System.out.print("Value 1 = ");
        kal.value1 = scn.nextDouble();
        System.out.print("Value 2 = ");
        kal.value2 = scn.nextDouble();
    

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("Hasil Perkalian : "+kal.kaliBilangan());
    }

}
