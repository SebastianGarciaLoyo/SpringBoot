package com.jpaappj3.jpa_app;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jpaappj3.jpa_app.entities.Person;
import com.jpaappj3.jpa_app.repositories.PersonRepository;
import jakarta.transaction.Transactional;


@SpringBootApplication
public class JpaAppApplication implements CommandLineRunner {

	// Inyectando la dependencia 'PersonRepository'
	@Autowired
	private PersonRepository personRepository;

	// Función principal
	public static void main(String[] args) {
		SpringApplication.run(JpaAppApplication.class, args);
	}

	// Sobrecarga de métodos
	@Override
	public void run(String... args) throws Exception {	
		
	}


	// Especifica que el método de abajo accederá a los datos en la DDBB si no existe ningún error
	@Transactional
	public void create() {
		// Creando las instancias necesarias
		Scanner scanner = new Scanner(System.in);


		// Ingresando los datos a anexar a la base de datos
		System.out.print("Ingrese el nombre: ");
		String name = scanner.next();

		System.out.println("\nIngrese el apellido: ");
		String lastname = scanner.next();

		System.out.println("\nIngrese el lenguaje de programación: ");
		String programmingLanguage = scanner.next();
		scanner.close();


		// Agregando la información recolectada a la clase 'Person'
		Person person = new Person(null, name, lastname, programmingLanguage);

		Person personNew = personRepository.save(person);
		System.out.println(personNew);

		// Llama el método 'findById' a partir de 'personNew.getId()'. Si existe muestra la info, de lo contrario se tumba la transacción
		personRepository.findById(personNew.getId()).ifPresent(System.out::println);
	}
}