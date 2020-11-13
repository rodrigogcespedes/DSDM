package com.example.casodos.services;

import com.example.casodos.entities.Paquete.Persona;
import com.example.casodos.repositories.BaseRepository;
import com.example.casodos.repositories.PersonaRepository;
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


