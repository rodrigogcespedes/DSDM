package com.example.casodos.controllers;

import com.example.casodos.entities.Paquete.Persona;
import com.example.casodos.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}

