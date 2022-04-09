/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4pbomenghitungluas;
import java.util.Scanner;
/**
 *
 * @author REGIN
 */
public class Solution {
    
    //atribut
    static int inp1;
    static int inp2; 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil = sc.nextInt();
        switch(pil){
            case 1:
                Persegi p = new Persegi(sc.nextInt());
                System.out.println(p.rumusP());
                break;
            case 2:
                Segitiga s = new Segitiga(sc.nextInt(), sc.nextInt());
                System.out.println(s.rumusS());
                break;
            case 3:
                Lingkaran l = new Lingkaran(sc.nextInt());
                System.out.println(l.rumusL());
                break;
            default :
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}

class Persegi{
   static int sisi = Solution.inp1;
   
   //constructor
   Persegi(int sisi){
      this.sisi = sisi;
   }
   
    int rumusP(){
       return sisi*sisi;
   }
}

class Segitiga{
   static int alas = Solution.inp1;
   static int tinggi = Solution.inp2;
   
   //constructor
   Segitiga(int alas, int tinggi){
      this.alas = alas;
      this.tinggi = tinggi;
   }
   
    int rumusS(){
       return alas*tinggi/2;
   }
}

class Lingkaran{
   int radius = Solution.inp1;
   
   //constructor
   Lingkaran(int radius){
      this.radius = radius;
   }
   
    double rumusL(){
       if(radius % 7 == 0){
              double phi = 22/7;
              return (int) phi * radius * radius;  
          }else{
              double phi = 3.14;
              return (double)phi * radius * radius;
          }
        } 
   }