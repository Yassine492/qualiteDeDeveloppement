package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.data.Voiture;
import com.example.demo.data.VoitureRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(VoitureRepository.class);

	@Autowired
	private VoitureRepository voitureRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		// rajout de tuples
		voitureRepository.save(new Voiture("Toyota",10));
		voitureRepository.save(new Voiture("audi",15));
		voitureRepository.save(new Voiture("lamborghinihalal",20000));
	}
}
