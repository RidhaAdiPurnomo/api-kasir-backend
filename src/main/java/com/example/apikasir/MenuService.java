package com.example.apikasir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<String> ambilDaftarMenu() {
        // Di sini biasanya ditambahkan logika, misalnya memfilter menu yang sedang habis
        // Namun untuk sekarang, kita langsung kembalikan datanya
        return menuRepository.getSemuaMenu();
    }
}
