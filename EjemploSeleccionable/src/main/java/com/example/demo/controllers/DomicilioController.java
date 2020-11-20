package com.example.demo.controllers;

import com.example.demo.entities.Paquete1.Domicilio;
import com.example.demo.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{


}

