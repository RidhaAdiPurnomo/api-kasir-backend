package com.example.apikasir;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransaksiController {

    @GetMapping("/api/transaksi/diskon")
    public String hitungDiskon(@RequestParam int totalBelanja) {
        if (totalBelanja >= 100000) {
            int diskon = totalBelanja * 10 / 100;
            int totalBayar = totalBelanja - diskon;
            return "Selamat, dapat diskon 10%! Total bayar: Rp " + totalBayar;
        } else {
            return "Tidak ada diskon. Total bayar: Rp " + totalBelanja;
        }
    }
}