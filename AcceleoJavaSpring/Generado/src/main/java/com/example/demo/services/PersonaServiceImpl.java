package com.example.demo.services;

import com.example.primera.entities..Persona;
import com.example.primera.repositories.BaseRepository;
import com.example.primera.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

	@Autowired
	private PersonaRepository PersonaRepository;

	public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }
}


