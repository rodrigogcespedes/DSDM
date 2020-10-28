package com.example.demo.controllers;

import com.example.demo.entities.Paquete1.Localidad;
import com.example.demo.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidads")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}

