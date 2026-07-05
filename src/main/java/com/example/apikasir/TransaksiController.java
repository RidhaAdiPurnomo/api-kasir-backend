package com.example.apikasir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransaksiController {

    // Menyuntikkan (Inject) TransaksiService ke dalam Controller
    @Autowired
    private TransaksiService transaksiService;

    @GetMapping("/api/transaksi/diskon")
    public String hitungDiskon(@RequestParam int totalBelanja) {
        // Controller sekarang hanya memanggil fungsi dari Service
        return transaksiService.hitungDiskon(totalBelanja);
    }
}