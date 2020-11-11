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

import com.example.demo.entities.Localidad;

@RunWith(SpringRunner.class)
@DataJpaTest
class LocalidadRepositoryTest {

	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private LocalidadRepository localidadRepository;

	@Test
	void findAllTest() {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		Localidad localidad2 = new Localidad();

					localidad2.setDenominacion("a");


		List<Localidad> listaVacia = new ArrayList<>();

		assertEquals(listaVacia, localidadRepository.findAll());

		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);
		listaEnviada.add(localidad2);
		
		entityManager.persist(localidad1);
		entityManager.persist(localidad2);
		entityManager.flush();


		assertEquals(listaEnviada, localidadRepository.findAll());
	}

	@Test
	void findByIdTest() {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		Localidad localidad2 = new Localidad();

					localidad2.setDenominacion("a");

		entityManager.persist(localidad1);
		entityManager.persist(localidad2);
		entityManager.flush();


		assertEquals(localidad1,localidadRepository.findById(1L).get());
	}

	@Test
	void deleteTest() {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		Localidad localidad2 = new Localidad();

					localidad2.setDenominacion("a");


		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);
		listaEnviada.add(localidad2);

		entityManager.persist(localidad1);
		entityManager.persist(localidad2);
		entityManager.flush();

		localidadRepository.deleteById(1L);

		assertEquals(1, localidadRepository.findAll().size());

	}

	@Test
	void saveTest() {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		Localidad localidad2 = new Localidad();

					localidad2.setDenominacion("a");


		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);
		listaEnviada.add(localidad2);

		
		entityManager.persist(localidad1);
		localidadRepository.save(localidad2);
		entityManager.flush();

		assertEquals(listaEnviada, localidad2Repository.findAll());
	}

}
