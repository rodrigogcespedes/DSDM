	package com.example.demo.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	
	import com.example.demo.entities.Provincia;

	@Repository
	public interface ProvinciaRepository extends JpaRepository<Provincia, Integer>{
	
	}	
