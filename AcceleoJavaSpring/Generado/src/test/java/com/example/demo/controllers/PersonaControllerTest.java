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


import com.example.demo.entities.Persona;
import com.example.demo.services.PersonaServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(PersonaController.class)
class PersonaControllerTest {

	@MockBean
	private PersonaServiceImpl personaService;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void getAllTest() throws Exception {
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

		when(personaService.findAll()).thenReturn(listaEnviada);

		mockMvc.perform(get("api/v1/personas")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())

				.andExpect(jsonPath("$[0].nombre", is("a")))
				.andExpect(jsonPath("$[1].nombre", is("a")))
				.andExpect(jsonPath("$[0].apellido", is("a")))
				.andExpect(jsonPath("$[1].apellido", is("a")))
				.andExpect(jsonPath("$[0].dni", is(1)))
				.andExpect(jsonPath("$[1].dni", is(1)))

	}

	@Test
	void getOneTest() throws Exception {
		Persona persona1 = new Persona();
		
					persona1.setNombre("a");
					persona1.setApellido("a");
					persona1.setDni(1);


		when(personaService.findById(1L)).thenReturn(persona1);

		mockMvc.perform(get("api/v1/personas")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())

				.andExpect(jsonPath("$.nombre", is("a")))
				.andExpect(jsonPath("$.apellido", is("a")))
				.andExpect(jsonPath("$.dni", is(1)))

	}

	@Test
	void saveTest() throws Exception {
		Persona persona1 = new Persona();
		
					persona1.setNombre("a");
					persona1.setApellido("a");
					persona1.setDni(1);


		when(personaService.save(persona1)).thenReturn(persona1);
		ObjectMapper om = new ObjectMapper();
		mockMvc.perform(post("api/v1/personas")
				.contentType(MediaType.APPLICATION_JSON)
				.content(om.writeValueAsString(persona1))
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.nombre", is("a")))
				.andExpect(jsonPath("$.apellido", is("a")))
				.andExpect(jsonPath("$.dni", is(1)))

	}

	@Test
	void deleteTest() throws Exception {

		when(personaService.delete(1L)).thenReturn(true);
		mockMvc.perform(delete("api/v1/personas")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$",is(true)));

	}

	@Test
	void updateTest() throws Exception {
		Persona persona1 = new Persona();
		
					persona1.setNombre("a");
					persona1.setApellido("a");
					persona1.setDni(1);


		when(personaService.update(persona1,1L)).thenReturn(persona1);
		ObjectMapper om = new ObjectMapper();
		mockMvc.perform(put("api/v1/personas")
				.contentType(MediaType.APPLICATION_JSON)
				.content(om.writeValueAsString(persona1))
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.nombre", is("a")))
				.andExpect(jsonPath("$.apellido", is("a")))
				.andExpect(jsonPath("$.dni", is(1)))


	}

}
