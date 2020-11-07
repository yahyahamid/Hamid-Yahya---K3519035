/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka2;

    import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class gametebakangka2 {
    public static void main(String[] args) {
        ArrayList <String> namauser = new ArrayList<>(); // Membuat array Nama user
        ArrayList <Integer> skor = new ArrayList<>(); // Membuat array Sekor user
        Scanner input1 = new Scanner(System.in); // Input pertama 
        Scanner input2= new Scanner(System.in); // Input kedua
        Random random1=new Random(); // Mengacak angka
        String cariY; // Untuk mencari nilai Y, jika input y, maka otomatis akan keluar
        
        do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            cariY=input1.nextLine();
            namauser.add(cariY);
            int Nilai = 0; // Variabel nilai 
            int CekGameOver=0; // Cek Game over. bernilai 1 jika GameOver
            int aKumulasi[]= new int[6]; // Membuat array nilai tiap level permainan
            int NilaiPasJalan=0; // Varibel nilai
            // Mulai Ngegame
            if(!("y").equals(cariY)){  
              // ------------------- START SCRIPT TEBAK DISINI --------------------------  
                String nextLevel; // untuk Menaikkan Level
                int PilihLevel=1;   // Untuk menentukan Level Pertama dan selanjutnya akan dinaikkan nilainya 
                System.out.println("Selamat Datang " + cariY); // Untuk memberikan sambutan kepada Pemain
                do{
                    
                int Kout, Ang, Pang;
                    System.out.println("# Level " + PilihLevel);
                    int StarNilaiO=PilihLevel-1;    
                    Pang=PilihLevel*100; // Menaiikan Nilai dan Angka Random pada tiap level
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
                    System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                    int AngKaAcak=random1.nextInt(Pang); // Mulai mengacak Nomor
                    
                       for(Kout=0;Kout<=5;Kout++){
                        if(Kout==5){ // Jika Loop ke 6, maka dipastikan GameOver
                            System.out.println("GAMEOVER! Anda Gagal");
                            CekGameOver++; // Memberikan nilai ++ (1), untuk memunculkan game Over
                        }
                        else{  
                            System.out.println("Tebakan Anda ? ");
                            int AkuTeb=input2.nextInt(); // Menginput Tebakan
                            int Kurang=4-Kout;
                            if(AkuTeb==AngKaAcak){ // JIka inputan dan random sama
                                // Penilaian. Memberikan nilai ketika berhasil menebak, dikalikan dengan Level
                                if(Kout==0){
                                    NilaiPasJalan=PilihLevel*100; // 1 x tebak, level x kan 100
                                }
                                else if(Kout==1){
                                    NilaiPasJalan=PilihLevel*70; // 2 x tebak, level x kan 70
                                }
                                else if(Kout==2){
                                    NilaiPasJalan=PilihLevel*50; // 3 x tebak, level x kan 50
                                }
                                else if(Kout==3){
                                    NilaiPasJalan=PilihLevel*30; // 4 x tebak, level x kan 30
                                }
                                else{
                                    NilaiPasJalan=0; // 5 x tebak, level x kan 0
                                }
                                // Memberikan informasi tebakan keberapa yang telah berhasil
                                int NeTebak=Kout+1;
                                // Konfirmasi Tebakan Berhasil :)
                                System.out.println("Selamat Anda berhasil menebak Angka dalam " + NeTebak + " kali tebakan. Sekor anda adalah " + NilaiPasJalan);
                                break;
                                
                                }
                            else{ // Gagal menebak, akan dimumculkan informasi dan sisa tebakan yang bisa dilakukan
                                if(AkuTeb>AngKaAcak){
                                    System.out.println("Tebakan Anda terlalu Besar! Anda mempunyai kesempatan " + Kurang + " kali lagi" ); // Jika Tebakan lebih besar dari angka random
                                }
                                else{

                                    System.out.println("Tebakan Anda terlalu Kecil! Anda mempunyai kesempatan " + Kurang + " kali lagi" ); // Jika tebakan lebih kecil dari angka random
                                }
                            }
                        }
                    }
                       
                       if(CekGameOver>0){
                        break;
                    }
                    // Level 5 adalah Level Maksimal
                    if(PilihLevel==5){ // Jika sudah Mencapai Level 5, langsung di break/otomatis Exit
                        break;
                    }
                    else{
                    aKumulasi[StarNilaiO]=NilaiPasJalan; // Membuat Array Nilai   
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau ketik 'exit' untuk keluar : ");
                    nextLevel=input1.nextLine(); // inputan next level atau exit
                    PilihLevel++; // Level bertambah setelah input Next Level
                    
                    }
                   
                }
                while(!"exit".equals(nextLevel));
                
                } 
            
            for(int rO=0; rO<5; rO++){ // membuat array nilai pada tiap level, untuk kemudian dijumlahkan
                Nilai=Nilai+aKumulasi[rO];  
            }
            skor.add(Nilai); // Menambahkan Nilai Akhir pada masing masing peserta
            // SCORE SEMENTARA
            if(!"y".equals(cariY)){ // Skore akan ditampilkan sementara, tetaapi jika y diinputkan, akan dilewati
                
            System.out.println("SCORE SEMENTARA");
                    System.out.println("---------------");
                    int xSemen, ySemen; // Dklarasi variabel loop dan array
                    int xJumSemen=namauser.size();
                  
                    for(xSemen=0;xSemen<xJumSemen;xSemen++){ // Looping memunculkan nama dan nilai dalam array
                        System.out.println(namauser.get(xSemen) + " : " + skor.get(xSemen));
                    }
                    System.out.println("---------------");
            }
            
        }        while(!"y".equals(cariY)); // Jika diiputkan y, maka akan keluar
        int jumPemain=namauser.size(); // Mengambil jumlah Rercord dalam array, dan untuk menghilangkan y paling belakang pada loop dikurangi 1 (-1)
        System.out.println("SCORE AKHIR");
        System.out.println("=================================");
        int l;
        for(l=0;l<jumPemain-1;l++){
            System.out.println(namauser.get(l) + " : " + skor.get(l)); // Menampilkan Skore di Akhir permainan
        }
        System.out.println("=================================");
    }
}
