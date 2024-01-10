package com.obat.obat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Obat {
    @Id
    @GeneratedValue
    private int id;
    private String nama;
    private String stok;
    private String harga;

    public Obat(int id, String nama, String stok, String harga) {
        super();
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    public Obat() {
        super();
        // TODO Auto-generated constructor stub
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
