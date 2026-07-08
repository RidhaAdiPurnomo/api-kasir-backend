package com.example.apikasir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/api/menu")
    public List<Menu> getDaftarMenu() {
        // Controller sekarang terlihat sangat bersih
        return menuService.ambilDaftarMenu();
    }
    @PostMapping("api/menu")
    public Menu tambahMenuBaru(@RequestBody Menu menu){

        return menuService.tambahMenu(menu);
    }
    // --- PINTU UPDATE ---
    // Contoh URL di Postman: http://localhost:8080/api/menu/3
    @PutMapping("/api/menu/{id}")
    public Menu perbaruiMenu(@PathVariable Long id, @RequestBody Menu menu) {
        return menuService.updateMenu(id, menu);
    }

    // --- PINTU DELETE ---
    // Contoh URL di Postman: http://localhost:8080/api/menu/3
    @DeleteMapping("/api/menu/{id}")
    public String hapusMenu(@PathVariable Long id) {
        menuService.hapusMenu(id);
        return "Menu dengan ID " + id + " berhasil dihapus dari database!";
    }
}