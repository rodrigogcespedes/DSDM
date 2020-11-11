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

import com.example.demo.entities.Autor;
import com.example.demo.services.AutorService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo.class)
class AutorServiceTest {


	@MockBean
	private AutorRepository autorRepository;
	
	@Autowired
	private AutorServiceImpl autorService;

	@Test
	public void findAllTest() throws Exception {
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

		when(autorRepository.findAll()).thenReturn(listaEnviada);


		assertEquals(listaEnviada, autorService.findAll());
	}

	@Test
	void findOneTest() throws Exception {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");

		List<Autor> listaEnviada = new ArrayList();
		listaEnviada.add(autor1);


		when(autorRepository.findById(1L)).thenReturn(Optional.of(autor1));

		assertEquals(autor1, autorService.findById(1L));

	}

	@Test
	void saveTest() throws Exception {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");

		List<Autor> listaEnviada = new ArrayList();
		listaEnviada.add(autor1);


		when(autorRepository.save(autor1)).thenReturn(autor1);

		assertEquals(autor1, autorService.save(autor1));

	}

	@Test
	void deleteTest() throws Exception {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");

		List<Autor> listaEnviada = new ArrayList();
		listaEnviada.add(autor1);

		when(autorRepository.existsById(1L)).thenReturn(true);


		assertEquals(true, autorService.delete(1L));

	}

	@Test
	void updateTest() throws Exception {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");

		List<Autor> listaEnviada = new ArrayList();
		listaEnviada.add(autor1);

		when(autorRepository.findById(1L)).thenReturn(Optional.of(autor1));
		when(autorRepository.save(autor1)).thenReturn(autor1);

		assertEquals(autor1, autorService.update(autor1,1L));

	}

}
