package com.example.demo.repositories;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Autor;

@RunWith(SpringRunner.class)
@DataJpaTest
class AutorRepositoryTest {

	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private AutorRepository autorRepository;

	@Test
	void findAllTest() {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");

		Autor autor2 = new Autor();

					autor2.setNombre("a");
					autor2.setApellido("a");
					autor2.setBibliografia("a");


		List<Autor> listaVacia = new ArrayList<>();

		assertEquals(listaVacia, autorRepository.findAll());

		List<Autor> listaEnviada = new ArrayList();
		listaEnviada.add(autor1);
		listaEnviada.add(autor2);
		
		entityManager.persist(autor1);
		entityManager.persist(autor2);
		entityManager.flush();


		assertEquals(listaEnviada, autorRepository.findAll());
	}

	@Test
	void findByIdTest() {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");

		Autor autor2 = new Autor();

					autor2.setNombre("a");
					autor2.setApellido("a");
					autor2.setBibliografia("a");

		entityManager.persist(autor1);
		entityManager.persist(autor2);
		entityManager.flush();


		assertEquals(autor1,autorRepository.findById(1L).get());
	}

	@Test
	void deleteTest() {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");

		Autor autor2 = new Autor();

					autor2.setNombre("a");
					autor2.setApellido("a");
					autor2.setBibliografia("a");


		List<Autor> listaEnviada = new ArrayList();
		listaEnviada.add(autor1);
		listaEnviada.add(autor2);

		entityManager.persist(autor1);
		entityManager.persist(autor2);
		entityManager.flush();

		autorRepository.deleteById(1L);

		assertEquals(1, autorRepository.findAll().size());

	}

	@Test
	void saveTest() {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");

		Autor autor2 = new Autor();

					autor2.setNombre("a");
					autor2.setApellido("a");
					autor2.setBibliografia("a");


		List<Autor> listaEnviada = new ArrayList();
		listaEnviada.add(autor1);
		listaEnviada.add(autor2);

		
		entityManager.persist(autor1);
		autorRepository.save(autor2);
		entityManager.flush();

		assertEquals(listaEnviada, autor2Repository.findAll());
	}

}
