package com.example.casotres.services;

import com.example.casotres.entities.Paquete.Persona;
import com.example.casotres.repositories.BaseRepository;
import com.example.casotres.repositories.PersonaRepository;
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


