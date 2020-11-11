package com.example.demo.controllers;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import com.example.demo.entities.Localidad;
import com.example.demo.services.LocalidadServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(LocalidadController.class)
class LocalidadControllerTest {

	@MockBean
	private LocalidadServiceImpl localidadService;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void getAllTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");

		Localidad localidad2 = new Localidad();

					localidad2.setDenominacion("a");


		List<Localidad> listaEnviada = new ArrayList();
		listaEnviada.add(localidad1);
		listaEnviada.add(localidad2);

		when(localidadService.findAll()).thenReturn(listaEnviada);

		mockMvc.perform(get("api/v1/localidads")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())

				.andExpect(jsonPath("$[0].denominacion", is("a")))
				.andExpect(jsonPath("$[1].denominacion", is("a")))

	}

	@Test
	void getOneTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");


		when(localidadService.findById(1L)).thenReturn(localidad1);

		mockMvc.perform(get("api/v1/localidads")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())

				.andExpect(jsonPath("$.denominacion", is("a")))

	}

	@Test
	void saveTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");


		when(localidadService.save(localidad1)).thenReturn(localidad1);
		ObjectMapper om = new ObjectMapper();
		mockMvc.perform(post("api/v1/localidads")
				.contentType(MediaType.APPLICATION_JSON)
				.content(om.writeValueAsString(localidad1))
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.denominacion", is("a")))

	}

	@Test
	void deleteTest() throws Exception {

		when(localidadService.delete(1L)).thenReturn(true);
		mockMvc.perform(delete("api/v1/localidads")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$",is(true)));

	}

	@Test
	void updateTest() throws Exception {
		Localidad localidad1 = new Localidad();
		
					localidad1.setDenominacion("a");


		when(localidadService.update(localidad1,1L)).thenReturn(localidad1);
		ObjectMapper om = new ObjectMapper();
		mockMvc.perform(put("api/v1/localidads")
				.contentType(MediaType.APPLICATION_JSON)
				.content(om.writeValueAsString(localidad1))
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.denominacion", is("a")))


	}

}
