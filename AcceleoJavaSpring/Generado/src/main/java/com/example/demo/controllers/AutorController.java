package com.example.demo.controllers;

import com.example.demo.entities.Paquete1.Autor;
import com.example.demo.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autors")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}

