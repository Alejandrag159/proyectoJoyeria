package com.example.proyectoArquitecturaJoyeria;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoArquitectaturaApplication {

	public static void main(String[] args) {
		// primero carga las variables de entorno y despues carga la aplicacion
		loadEnv();
		SpringApplication.run(ProyectoArquitectaturaApplication.class, args);
	}
	// se crea el metotodo

	public static void loadEnv() {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
	}


}
