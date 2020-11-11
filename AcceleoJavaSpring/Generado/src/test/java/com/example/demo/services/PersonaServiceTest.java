package com.example.demo.services;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.example.apirest.ApirestApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Persona;
import com.example.demo.services.PersonaService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo.class)
class PersonaServiceTest {


	@MockBean
	private PersonaRepository personaRepository;
	
	@Autowired
	private PersonaServiceImpl personaService;

	@Test
	public void findAllTest() throws Exception {
		Persona persona1 = new Persona();
		
					persona1.setNombre("a");
					persona1.setApellido("a");
					persona1.setDni(1);

		Persona persona2 = new Persona();

					persona2.setNombre("a");
					persona2.setApellido("a");
					persona2.setDni(1);

		List<Persona> listaEnviada = new ArrayList();
		listaEnviada.add(persona1);
		listaEnviada.add(persona2);

		when(personaRepository.findAll()).thenReturn(listaEnviada);


		assertEquals(listaEnviada, personaService.findAll());
	}

	@Test
	void findOneTest() throws Exception {
		Persona persona1 = new Persona();
		
					persona1.setNombre("a");
					persona1.setApellido("a");
					persona1.setDni(1);

		List<Persona> listaEnviada = new ArrayList();
		listaEnviada.add(persona1);


		when(personaRepository.findById(1L)).thenReturn(Optional.of(persona1));

		assertEquals(persona1, personaService.findById(1L));

	}

	@Test
	void saveTest() throws Exception {
		Persona persona1 = new Persona();
		
					persona1.setNombre("a");
					persona1.setApellido("a");
					persona1.setDni(1);

		List<Persona> listaEnviada = new ArrayList();
		listaEnviada.add(persona1);


		when(personaRepository.save(persona1)).thenReturn(persona1);

		assertEquals(persona1, personaService.save(persona1));

	}

	@Test
	void deleteTest() throws Exception {
		Persona persona1 = new Persona();
		
					persona1.setNombre("a");
					persona1.setApellido("a");
					persona1.setDni(1);

		List<Persona> listaEnviada = new ArrayList();
		listaEnviada.add(persona1);

		when(personaRepository.existsById(1L)).thenReturn(true);


		assertEquals(true, personaService.delete(1L));

	}

	@Test
	void updateTest() throws Exception {
		Persona persona1 = new Persona();
		
					persona1.setNombre("a");
					persona1.setApellido("a");
					persona1.setDni(1);

		List<Persona> listaEnviada = new ArrayList();
		listaEnviada.add(persona1);

		when(personaRepository.findById(1L)).thenReturn(Optional.of(persona1));
		when(personaRepository.save(persona1)).thenReturn(persona1);

		assertEquals(persona1, personaService.update(persona1,1L));

	}

}
