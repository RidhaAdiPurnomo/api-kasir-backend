package com.example.apikasir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class KafkaConsumerService {

    @Autowired
    private MenuRepository menuRepository;

    @KafkaListener(topics = "topik-pesanan-baru", groupId = "grup-kasir")
    public void tangkapPesan(String pesan) {
        System.out.println("📥 [KONSUMER] Memproses antrean pesanan dari Kafka: " + pesan);

        String[] daftarPesanan = pesan.split(",");

        for (String namaPesanan : daftarPesanan) {
            String namaBersih = namaPesanan.trim();

            // 🔎 Cari menu di Data Master database berdasarkan namanya
            Optional<Menu> menuDiDatabase = menuRepository.findByNama(namaBersih);

            if (menuDiDatabase.isPresent()) {
                // Jika menu ditemukan, ambil informasi aslinya yang sudah ada harganya
                Menu menuData = menuDiDatabase.get();
                System.out.println("   ✅ PESANAN VALID: " + menuData.getNama() + " | Harga: Rp" + menuData.getHarga());

                // DI SINI: Di tahap berikutnya, kita tinggal menyimpan data ini ke tabel_transaksi

            } else {
                // Jika ada orang iseng memesan menu yang tidak terdaftar
                System.out.println("   ❌ PESANAN DITOLAK: Menu '" + namaBersih + "' tidak terdaftar di sistem!");
            }
        }
    }
}