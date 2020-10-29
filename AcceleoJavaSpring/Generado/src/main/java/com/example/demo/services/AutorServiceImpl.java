package com.example.demo.services;

import com.example.demo.entities.Paquete1.Autor;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{

	@Autowired
	private AutorRepository AutorRepository;
	
	public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository){
        super(baseRepository);
    }
}


