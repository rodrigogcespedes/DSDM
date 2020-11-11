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

import com.example.demo.entities.Localidad;
import com.example.demo.services.LocalidadService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo.class)
class LocalidadServiceTest {


	@MockBean
	private LocalidadRepository localidadRepository;
	
	@Autowired
	private LocalidadServiceImpl localidadService;

	@Test
	public void findAllTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		Localidad localidad2 = new Localidad();

					localidad2.setDenominacion("a");

		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);
		listaEnviada.add(localidad2);

		when(localidadRepository.findAll()).thenReturn(listaEnviada);


		assertEquals(listaEnviada, localidadService.findAll());
	}

	@Test
	void findOneTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);


		when(localidadRepository.findById(1L)).thenReturn(Optional.of(localidad1));

		assertEquals(localidad1, localidadService.findById(1L));

	}

	@Test
	void saveTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);


		when(localidadRepository.save(localidad1)).thenReturn(localidad1);

		assertEquals(localidad1, localidadService.save(localidad1));

	}

	@Test
	void deleteTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);

		when(localidadRepository.existsById(1L)).thenReturn(true);


		assertEquals(true, localidadService.delete(1L));

	}

	@Test
	void updateTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);

		when(localidadRepository.findById(1L)).thenReturn(Optional.of(localidad1));
		when(localidadRepository.save(localidad1)).thenReturn(localidad1);

		assertEquals(localidad1, localidadService.update(localidad1,1L));

	}

}
