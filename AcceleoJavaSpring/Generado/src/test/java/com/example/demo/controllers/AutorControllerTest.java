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


import com.example.demo.entities.Autor;
import com.example.demo.services.AutorServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(AutorController.class)
class AutorControllerTest {

	@MockBean
	private AutorServiceImpl autorService;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void getAllTest() throws Exception {
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

		when(autorService.findAll()).thenReturn(listaEnviada);

		mockMvc.perform(get("api/v1/autors")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())

				.andExpect(jsonPath("$[0].nombre", is("a")))
				.andExpect(jsonPath("$[1].nombre", is("a")))
				.andExpect(jsonPath("$[0].apellido", is("a")))
				.andExpect(jsonPath("$[1].apellido", is("a")))
				.andExpect(jsonPath("$[0].bibliografia", is("a")))
				.andExpect(jsonPath("$[1].bibliografia", is("a")))

	}

	@Test
	void getOneTest() throws Exception {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");


		when(autorService.findById(1L)).thenReturn(autor1);

		mockMvc.perform(get("api/v1/autors")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())

				.andExpect(jsonPath("$.nombre", is("a")))
				.andExpect(jsonPath("$.apellido", is("a")))
				.andExpect(jsonPath("$.bibliografia", is("a")))

	}

	@Test
	void saveTest() throws Exception {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");


		when(autorService.save(autor1)).thenReturn(autor1);
		ObjectMapper om = new ObjectMapper();
		mockMvc.perform(post("api/v1/autors")
				.contentType(MediaType.APPLICATION_JSON)
				.content(om.writeValueAsString(autor1))
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.nombre", is("a")))
				.andExpect(jsonPath("$.apellido", is("a")))
				.andExpect(jsonPath("$.bibliografia", is("a")))

	}

	@Test
	void deleteTest() throws Exception {

		when(autorService.delete(1L)).thenReturn(true);
		mockMvc.perform(delete("api/v1/autors")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$",is(true)));

	}

	@Test
	void updateTest() throws Exception {
		Autor autor1 = new Autor();
		
					autor1.setNombre("a");
					autor1.setApellido("a");
					autor1.setBibliografia("a");


		when(autorService.update(autor1,1L)).thenReturn(autor1);
		ObjectMapper om = new ObjectMapper();
		mockMvc.perform(put("api/v1/autors")
				.contentType(MediaType.APPLICATION_JSON)
				.content(om.writeValueAsString(autor1))
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.nombre", is("a")))
				.andExpect(jsonPath("$.apellido", is("a")))
				.andExpect(jsonPath("$.bibliografia", is("a")))


	}

}
