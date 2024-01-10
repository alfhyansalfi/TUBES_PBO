package com.obat.obat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyObatList {

    @Id
    private int id;
    private String nama;
    private String stok;
    private String harga;
    public MyObatList() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MyObatList(int id, String nama, String stok, String harga) {
        super();
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getStok() {
        return stok;
    }
    public void setStok(String stok) {
        this.stok = stok;
    }
    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }
}
