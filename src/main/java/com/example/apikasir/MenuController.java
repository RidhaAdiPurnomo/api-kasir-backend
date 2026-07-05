package com.example.apikasir;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MenuController {

    @GetMapping("/api/menu")
    public List<String> getDaftarMenu() {
        // Ini adalah data statis (dummy) sebagai contoh awal
        // Nanti, data ini akan diambil dari database MS SQL
        return List.of("Nasi Goreng", "Mie Tek-Tek", "Es Teh Manis", "Kopi Hitam");
    }
}