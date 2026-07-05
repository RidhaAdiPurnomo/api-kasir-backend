package com.example.apikasir;

import org.springframework.stereotype.Service;

@Service
public class TransaksiService {

    // Logika perhitungan dipindah ke sini
    public String hitungDiskon(int totalBelanja) {
        if (totalBelanja >= 100000) {
            int diskon = totalBelanja * 10 / 100;
            int totalBayar = totalBelanja - diskon;
            return "Selamat, dapat diskon 10%! Total bayar: Rp " + totalBayar;
        } else {
            return "Tidak ada diskon. Total bayar: Rp " + totalBelanja;
        }
    }
}
