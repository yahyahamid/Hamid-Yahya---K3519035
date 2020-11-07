/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

    import java.util.Scanner;
public class GameTebakAngka{
public static void main(String[] args){

  int a = (int)(Math.random() *100);// acak angka dari 0-100
  int c = 2;
    System.out.println("--------------------------------------------------");
    System.out.println("   MARI MENEBAK ANGKA 0 - 100 dengan 3X Kesempatan");
    System.out.println("---------------------------------------------------");
do{
    System.out.println("---------------------------------------------------");
    System.out.println("    MASUKKAN ANGKA YANG ANDA TEBAK????");
    System.out.println("---------------------------------------------------");
    Scanner jawab = new Scanner (System.in);
    int b = jawab.nextInt();

if (c > 0 ){
if ( b == a ){
    System.out.println("CONGRATULATION!!! Angka yang anda masukkan BENAR!");
    break;}
else if ( b < a ){
    System.out.println("Maaf guys, angka yang anda masukkan terlalu KECIL.");}
else if ( b > a ){
    System.out.println("Maaf guys, angka yang anda masukkan terlalu BESAR.");}

    System.out.println("    Anda Memiliki " + c + " Kesempatan Lagi");
    System.out.println("---------------------------------------------------");
    c--;}
else{
    System.out.println("---------------------------------------------------");
    System.out.println("ANDA SALAH!!KESEMPATAN TELAH HABIS. SILAHKAN COBA LAGI");
    System.out.println("ANGKA YANG DIMAKSUD ADALAH " + a);
    System.out.println("---------------------------------------------------");
    break;
    }
   }
while ( c >=0 );
    }
   }
