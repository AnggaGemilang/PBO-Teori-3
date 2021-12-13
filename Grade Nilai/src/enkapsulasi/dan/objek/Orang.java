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
public class Orang {
    protected int id;
    protected String nama, tmpTglLahir, alamat, noTelp;
    
    protected Orang(int id, String nama, String tmptTglLahir, String alamat, String noTelp){
        this.id = id;
        this.nama = nama;
        this.tmpTglLahir = tmptTglLahir;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
    
    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getTmpTglLahir() {
        return tmpTglLahir;
    }

    protected void setTmpTglLahir(String tmpTglLahir) {
        this.tmpTglLahir = tmpTglLahir;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    protected String getNoTelp() {
        return noTelp;
    }
    
    protected void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }
    
}
