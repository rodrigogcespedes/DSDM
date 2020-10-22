package com.example.demo.services;

import com.example.primera.entities..Domicilio;
import com.example.primera.repositories.BaseRepository;
import com.example.primera.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService{

	@Autowired
	private DomicilioRepository DomicilioRepository;

	public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository){
        super(baseRepository);
    }
}


