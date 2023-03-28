package com.example.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BancoApplication.class, args);
    }
    /*
    Listas.getInstance();
    private static Listas listas;
    public static Listas getInstance() {
        if (listas == null) {
            listas = new Listas();
        }
        return listas;
    }
    */
}
