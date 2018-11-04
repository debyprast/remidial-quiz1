/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debyprast.RemidialQuiz1;

/**
 *
 * @author sin
 */
public class Penonton {
    private String nama;
    private String kategori;

    public Penonton(String nama, String kategori) {
        this.nama = nama;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public String getInfoPenonton(){
        return this.nama+"| "+this.kategori+" |\t";
    }
}
