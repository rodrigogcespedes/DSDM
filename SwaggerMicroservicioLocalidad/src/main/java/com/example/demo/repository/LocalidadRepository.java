	package com.example.demo.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	
	import com.example.demo.entities.Localidad;

	@Repository
	public interface LocalidadRepository extends JpaRepository<Localidad, Integer>{
	
	}	
