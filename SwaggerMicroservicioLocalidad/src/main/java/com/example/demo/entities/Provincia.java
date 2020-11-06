	//Paquetes:
	package com.example.demo.entities;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Date;
	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToMany;
	import javax.persistence.OneToOne;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import javax.persistence.Inheritance;
	import javax.persistence.InheritanceType;
	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	import com.fasterxml.jackson.annotation.JsonSubTypes;
	import com.fasterxml.jackson.annotation.JsonTypeInfo;	
	import javax.persistence.PrimaryKeyJoinColumn;	
	import lombok.Data;
	import lombok.NoArgsConstructor;
	import lombok.AllArgsConstructor;
	import lombok.Builder;	

	@Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder

	@Entity
	@Table(name = "provincia")	
	
	public class Provincia extends BaseEntity{	
		
		@Column
		private 
			String 
		nombre;	
	
		
		
				@OneToOne(cascade = CascadeType.REFRESH)
				@JoinColumn(name = "provincia_pais")							
				private Pais pais
	;		
				
	
	
	
}
