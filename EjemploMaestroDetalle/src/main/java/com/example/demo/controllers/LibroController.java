package com.example.demo.controllers;

import com.example.demo.entities.Paquete1.Libro;
import com.example.demo.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libro")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{


}

