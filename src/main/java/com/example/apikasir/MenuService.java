package com.example.apikasir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> ambilDaftarMenu() {
        return menuRepository.findAll();
    }

    // --- TAMBAHKAN FUNGSI INI ---
    public Menu tambahMenu(Menu menuBaru) {
        // save() otomatis menyimpan data ke MS SQL dan mengembalikan data beserta ID barunya
        return menuRepository.save(menuBaru);
    }

    // --- FITUR UPDATE (PUT) ---
    public Menu updateMenu(Long id, Menu menuUpdate) {
        // 1. Cari data lamanya dulu berdasarkan ID
        Menu menuLama = menuRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu dengan ID " + id + " tidak ditemukan!"));

        // 2. Timpa dengan data baru
        menuLama.setNama(menuUpdate.getNama());
        menuLama.setHarga(menuUpdate.getHarga());

        // 3. Simpan kembali ke database
        return menuRepository.save(menuLama);
    }

    // --- FITUR HAPUS (DELETE) ---
    public void hapusMenu(Long id) {
        menuRepository.deleteById(id);
    }
}