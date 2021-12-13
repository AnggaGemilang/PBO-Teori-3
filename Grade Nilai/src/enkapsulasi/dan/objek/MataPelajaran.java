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
public class MataPelajaran {
    private int id;
    private String nama;
    private String tipePelajaran;
    private ArrayList<Guru> daftarGuru = new ArrayList<>();
    
    public MataPelajaran(int id, String nama, String tipePelajaran){
        this.id = id;
        this.nama = nama;
        this.tipePelajaran = tipePelajaran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipePelajaran() {
        return tipePelajaran;
    }

    public void setTipePelajaran(String tipePelajaran) {
        this.tipePelajaran = tipePelajaran;
    }

    public ArrayList<Guru> getGuru() {
        return daftarGuru;
    }

    public void setGuru(Guru guru) {
        this.daftarGuru.add(guru);
    }

    public void deleteGuru(int index) {
        this.daftarGuru.remove(index);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void getProfile(){
        System.out.println("Id : " + this.id);
        System.out.println("Mata Pelajaran : " + this.nama);
        System.out.println("Tipe Pelajaran : " + this.tipePelajaran);
        if(this.daftarGuru.isEmpty()){
            System.out.println("Data Guru : Kosong");
        } else {
            System.out.print("Data Guru : ");
            for(int i = 0; i < this.daftarGuru.size(); i++){
                if(i == this.daftarGuru.size()-1){
                    System.out.print(this.daftarGuru.get(i).getNama());
                } else {
                    System.out.print(this.daftarGuru.get(i).getNama() + " - ");
                }
            }
        }
    }
    
}
