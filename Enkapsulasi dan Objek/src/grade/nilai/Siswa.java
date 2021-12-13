/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.nilai;

import java.util.ArrayList;

/**
 *
 * @author angga
 */
public class Siswa {
    private int id;
    private String nama;
    private int nim;
    private ArrayList<Integer> nilai;
    private char grade;
    private int hasilAkhir;
    
    Siswa(int id, String nama, int nim, ArrayList<Integer> nilai){
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.hasilAkhir = setHasilAkhir(nilai);
        this.grade = setGrade(this.hasilAkhir);
    }
   
    // Setter

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
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(int nim){
        this.nim = nim;
    }
    
    public void setNilai(int index, int value){
        this.nilai.set(index, value);
        this.hasilAkhir = setHasilAkhir(this.nilai);
        this.grade = setGrade(this.hasilAkhir);
    }
    
    // Getter
    
    public void getProfile(){
        System.out.println("Id : " + this.id);
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.print("Nilai : ");
        for(int i = 0; i < nilai.size(); i++){
            if(i == nilai.size()-1){
                System.out.print(this.nilai.get(i));
            } else {
                System.out.print(this.nilai.get(i) + " - ");
            }
        }
        System.out.println("\nHasil Akhir : " + this.hasilAkhir);
        System.out.println("Grade : " + this.grade);
    }
    
    public char getGrade(){
        return this.grade;
    }
    
    public String getNama(){
       return this.nama; 
    }

    public int getNim(){
       return this.nim; 
    }
    
    public int getId(){
        return this.id;
    }
    
    public ArrayList<Integer> getNilai(){
        return this.nilai;
    }
    
}
