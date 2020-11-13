package com.example.casocuatro.services;

import com.example.casocuatro.entities.Paquete.Persona;
import com.example.casocuatro.repositories.BaseRepository;
import com.example.casocuatro.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

	@Autowired
	private PersonaRepository PersonaRepository;
	
	public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }
}


