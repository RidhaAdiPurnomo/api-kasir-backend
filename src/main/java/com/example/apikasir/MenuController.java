package com.example.apikasir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/api/menu")
    public List<String> getDaftarMenu() {
        // Controller sekarang terlihat sangat bersih
        return menuService.ambilDaftarMenu();
    }
}