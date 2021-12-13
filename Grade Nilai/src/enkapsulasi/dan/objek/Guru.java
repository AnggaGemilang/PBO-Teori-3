/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi.dan.objek;

/**
 *
 * @author angga
 */
public class Guru extends Orang {
    private int nip;
    private MataPelajaran mataPelajaran;
    
    public Guru(int id, String nama, String tmpTglLahir, String alamat, String noTelp, int nip, MataPelajaran mataPelajaran) {
        super(id, nama, tmpTglLahir, alamat, noTelp);
        this.nip = nip;
        this.mataPelajaran = mataPelajaran;
    }
    
    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    public MataPelajaran getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(MataPelajaran mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }
    
    public void getProfile(){
        System.out.println("Id : " + super.id);
        System.out.println("Nama : " + super.nama);
        System.out.println("Tempat, Tanggal Lahir : " + super.tmpTglLahir);
        System.out.println("Alamat : " + super.alamat);
        System.out.println("Nomor Telepon : " + super.noTelp);
        System.out.println("NIM : " + this.nip);
        System.out.println("Mengajar Pelajaran : " + this.mataPelajaran.getNama());
    }
        
}
