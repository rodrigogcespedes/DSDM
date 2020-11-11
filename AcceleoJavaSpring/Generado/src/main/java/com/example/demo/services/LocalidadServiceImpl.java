package com.example.demo.services;

import com.example.demo.entities.Paquete1.Localidad;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

	@Autowired
	private LocalidadRepository LocalidadRepository;
	
	public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){
        super(baseRepository);
    }
}


