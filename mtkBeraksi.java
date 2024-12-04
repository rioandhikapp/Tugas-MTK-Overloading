/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtkcool;

/**
 *
 * @author rioan
 */
public class mtkBeraksi {

    public static void main(String[] args) {
        
        mtkcanggih mtk = new mtkcanggih();
        
        System.out.println("=====Ini Overloading Pertambahan=====");
        mtk.pertambahan(12.5, 28.7, 14.2);
        mtk.pertambahan(12, 28, 14);
        mtk.pertambahan(23, 24);
        mtk.pertambahan(3.4, 4.9);
        
        System.out.println("\n=====Ini Overloading Pengurangan=====");
        mtk.pengurangan(12.5, 28.7, 14.2);
        mtk.pengurangan(12, 28, 14);
        mtk.pengurangan(23, 24);
        mtk.pengurangan(3.4, 4.9);
        
        System.out.println("\n=====Ini Overloading Perkalian=====");
        mtk.perkalian(12.5, 28.7, 14.2);
        mtk.perkalian(12, 28, 14);
        mtk.perkalian(23, 24);
        mtk.perkalian(3.4, 4.9);

        System.out.println("\n=====Ini Overloading Pembagian=====");
        mtk.pembagian(12.5, 28.7, 14.2);
        mtk.pembagian(12, 28, 14);
        mtk.pembagian(23, 24);
        mtk.pembagian(3.4, 4.9);
        
        System.out.println("\n=====Ini Overloading Modulus=====");
        mtk.modulus(12.5, 28.7, 14.2);
        mtk.modulus(12, 28, 14);
        mtk.modulus(23, 24);
        mtk.modulus(3.4, 4.9);
    }
}
