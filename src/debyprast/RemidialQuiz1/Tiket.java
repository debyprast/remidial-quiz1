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
public class Tiket {
    private String kode ;
    private String film;
    private int harga;

    public Tiket(String kode, String film, int harga) {
        this.kode = kode;
        this.film = film;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
    
    
    public String getInfo(){
        return kode+"\t| "+film+" |"+harga+"\t|  ";
    }
}
