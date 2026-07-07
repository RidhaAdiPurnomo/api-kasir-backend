package com.example.apikasir;


import org.springframework.stereotype.Repository;

@Repository
public class PesananRepository {

    public int getHargaBarang(String namaBarang){
        if (namaBarang.equalsIgnoreCase("Nasi Goreng")) return 15000;
        if (namaBarang.equalsIgnoreCase("Mie Ayam")) return 18000;
        if (namaBarang.equalsIgnoreCase("Nasi Campur")) return 12000;
        return 0;
    }

}
