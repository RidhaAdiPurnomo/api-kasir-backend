package com.example.apikasir;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PesananService {

    @Autowired
    private PesananRepository pesananRepository;

    public String hitungSubTotal(String namaBarang, int jumlah){
        int harga = pesananRepository.getHargaBarang(namaBarang);

        if (harga == 0){
            return "Maaf '" + namaBarang + "sudah habis";
        }

        int subtotal = harga * jumlah;

        return "Pesanan: " + jumlah + "x " + namaBarang + " Rp " + harga + "/porsi. Total: Rp " + subtotal;
    }
}
