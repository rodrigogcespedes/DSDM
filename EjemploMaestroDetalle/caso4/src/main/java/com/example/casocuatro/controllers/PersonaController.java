package com.example.casocuatro.controllers;

import com.example.casocuatro.entities.Paquete.Persona;
import com.example.casocuatro.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}

