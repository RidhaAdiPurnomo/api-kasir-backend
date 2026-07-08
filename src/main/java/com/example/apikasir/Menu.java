package com.example.apikasir;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabel_menu") // Ini akan menjadi nama tabel di MS SQL nanti
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Membuat kolom ID menjadi Auto-Increment
    private Long id;

    private String nama;
    private int harga;

    // Konstruktor kosong wajib untuk kebutuhan internal JPA
    public Menu() {}

    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter (Sangat penting agar datanya bisa diubah otomatis menjadi format JSON)
    public Long getId() { return id; }
    public String getNama() { return nama; }
    public int getHarga() { return harga; }

    // Setter untuk fitur Update
    public void setNama(String nama) { this.nama = nama; }
    public void setHarga(int harga) { this.harga = harga; }
}