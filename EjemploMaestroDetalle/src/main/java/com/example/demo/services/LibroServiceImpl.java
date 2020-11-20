package com.example.demo.services;

import com.example.demo.entities.Paquete1.Libro;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{

	@Autowired
	private LibroRepository LibroRepository;
	
	public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository){
        super(baseRepository);
    }
}


