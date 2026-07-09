package com.example.apikasir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    // Fungsi ini akan melempar pesan ke antrean bernama "topik-pesanan-baru"
    public void kirimPesanKeKafka(String pesan) {
        kafkaTemplate.send("topik-pesanan-baru", pesan);
        System.out.println("🚀 Pesan berhasil dilempar ke antrean Kafka: " + pesan);
    }
}