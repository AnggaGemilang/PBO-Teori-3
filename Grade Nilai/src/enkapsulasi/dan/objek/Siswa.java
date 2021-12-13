/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi.dan.objek;

import java.util.ArrayList;

/**
 *
 * @author angga
 */
public class Siswa extends Orang{
    private int nim, hasilAkhir;
    private ArrayList<Integer> nilai;
    private char grade;
    
    public Siswa(int id, String nama, String tmptTglLahir, String alamat, String noTelp, int nim, ArrayList<Integer> nilai){
        super(id, nama, tmptTglLahir, alamat, noTelp);
        this.nim = nim;
        this.nilai = nilai;
        this.hasilAkhir = setHasilAkhir(nilai);
        this.grade = setGrade(this.hasilAkhir);
    }

    public static int setHasilAkhir(ArrayList<Integer> nilai){
        return (int)(((double)20/(double)100 * (double)(nilai.get(0))) + ((double)35/(double)100 * (double)(nilai.get(1))) + ((double)45/(double)100 * (double)(nilai.get(2))));
    }
    
    public static char setGrade(int hasilAkhir){
        if(hasilAkhir > 85){
            return 'A';
        } else if(hasilAkhir >= 75 && hasilAkhir <= 84){
            return 'B';
        } else if(hasilAkhir >= 65 && hasilAkhir <= 74){
            return 'C';            
        } else if(hasilAkhir >= 49 && hasilAkhir <= 64){
            return 'D';            
        } else {
            return 'E';            
        }
    }

    public void setNilai(int index, int value){
        this.nilai.set(index, value);
        this.hasilAkhir = setHasilAkhir(this.nilai);
        this.grade = setGrade(this.hasilAkhir);
    }

    public void getProfile(){
        System.out.println("Id : " + super.id);
        System.out.println("Nama : " + super.nama);
        System.out.println("Tempat, Tanggal Lahir : " + super.tmpTglLahir);
        System.out.println("Alamat : " + super.alamat);
        System.out.println("Nomor Telepon : " + super.noTelp);
        System.out.println("NIM : " + this.nim);
        System.out.print("Nilai : ");
        for(int i = 0; i < this.nilai.size(); i++){
            if(i == this.nilai.size()-1){
                System.out.print(this.nilai.get(i));
            } else {
                System.out.print(this.nilai.get(i) + " - ");
            }
        }
        System.out.println("\nHasil Akhir : " + this.hasilAkhir);
        System.out.println("Grade : " + this.grade);
    }

    public int getNim() {
        return nim;
    }
   
    public void setNim(int nim) {
        this.nim = nim;
    }

    public ArrayList<Integer> getNilai() {
        return nilai;
    }

    public void setNilai(ArrayList<Integer> nilai) {
        this.nilai = nilai;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getHasilAkhir() {
        return hasilAkhir;
    }
    
    public void setHasilAkhir(int hasilAkhir) {
        this.hasilAkhir = hasilAkhir;
    }
    
}
