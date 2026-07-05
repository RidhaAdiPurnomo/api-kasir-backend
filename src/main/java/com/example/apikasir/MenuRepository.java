package com.example.apikasir;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MenuRepository {

    public List<String> getSemuaMenu() {
        // Nanti, saat terhubung ke MS SQL, baris ini akan diganti dengan perintah SQL
        // Contoh: SELECT * FROM tabel_menu
        return List.of("Nasi Goreng", "Mie Tek-Tek", "Es Teh Manis", "Kopi Hitam", "Ayam Bakar Rica");
    }
}