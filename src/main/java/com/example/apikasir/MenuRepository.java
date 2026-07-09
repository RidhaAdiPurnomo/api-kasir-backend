package com.example.apikasir;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    // Kosongkan saja. Fungsi bawaan seperti findAll() untuk mengambil semua data otomatis tersedia.
    Optional<Menu> findByNama(String nama);
}