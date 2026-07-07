package com.example.apikasir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PesananController {

    @Autowired
    private PesananService pesananService;

    @GetMapping("api/pesanan/subtotal")
    public String getSubTotal(@RequestParam String namaBarang, @RequestParam int jumlah){

        return pesananService.hitungSubTotal(namaBarang, jumlah);
    }

}
