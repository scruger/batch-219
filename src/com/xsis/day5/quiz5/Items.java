package com.xsis.day5.quiz5;

import com.xsis.day5.materi.encapsulation.Student;

public class Items {

    private int kodeItem;
    private String nama;
    private int harga;
    private  int qty;

    public Items(int kodeItem, String nama, int harga) {
        this.kodeItem = kodeItem;
        this.nama = nama;
        this.harga = harga;
    }

    public Items(int kodeItem, String nama, int harga, int qty) {
        this.kodeItem = kodeItem;
        this.nama = nama;
        this.harga = harga;
        this.qty = qty;
    }

    public int getKodeItem() {
        return kodeItem;
    }

    public void setKodeItem(int kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String showChart(){
        return kodeItem + "\t\t" + nama + "\t\tRp. " + harga + "\t\t" + qty;
    }

    public String showBarang(){
        return kodeItem + "\t\t" + nama + "\t\t" + harga;
    }

    @Override
    public String toString() {
        return "Items{" +
                "kodeItem=" + kodeItem +
                ", nama='" + nama + '\'' +
                ", harga=" + harga +
                ", qty=" + qty +
                '}';
    }
}
