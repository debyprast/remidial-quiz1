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
public class Transaksi {
    private Penonton penonton;
    private Tiket tiket;
    private float discount;
    
    public Transaksi(Penonton penonton, Tiket tiket,float discount) {
        this.penonton = penonton;
        this.tiket = tiket;
        this.discount=discount;
    }

    public float getDiscount() {
        return this.tiket.getHarga()*discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
    public Penonton getPenonton() {
        return penonton;
    }

    public void setPenonton(Penonton penonton) {
        this.penonton = penonton;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }
    public void print(){
        System.out.println("==TRANSAKSI==========================");
        System.out.println("| Nama\t | Kategori | Kode Tiket | Film\t| Harga \t| Discount");
        System.out.println("| "+this.penonton.getInfoPenonton()+this.tiket.getInfo()+this.getDiscount()+" |");
    }
}
