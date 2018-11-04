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
public class Main {
    public static void main(String[] args) {
        Tiket tiket1=new Tiket("001", "Insidous 3", 25000);
        Penonton karina=new Penonton("Karina", "Remaja");
        Transaksi[] t=new Transaksi[1];
        t[0]=new Transaksi(karina,tiket1,0.5f);
        t[0].print();
    }
}