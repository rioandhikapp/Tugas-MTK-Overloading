/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtkcool;

/**
 *
 * @author rioan
 */
public class mtkcanggih extends mtk{

//    overloading modulus
    void modulus(double a , double b , double c){
        double hasil  = a % b % c;
        System.out.println("Hasil modulus : " + hasil);
    }
    void modulus(int a , int b , int c){
        int hasil  = a % b % c;
        System.out.println("Hasil modulus : " + hasil);
    }
    void modulus(double a , double b ){
        double hasil  = a % b ;
        System.out.println("Hasil modulus : " + hasil);
    }
    void modulus(int a , int b ){
        int hasil  = a % b;
        System.out.println("Hasil modulus : " + hasil);
    }

    int operasiGabungan(int a , int b , int c){
        return a + (b * c);
    }
    
}
