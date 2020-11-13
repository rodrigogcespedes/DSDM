	package com.example.casocuatro.entities.Paquete;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import com.example.casocuatro.entities.Base;
	
		
	@Entity
	@Table(name= "domicilio")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	
	public class Domicilio 	extends Base
	  {
	@Column(name = "calle")
		private  String calle;
	@Column(name = "numero")
		private  int numero;
	
	
	
	
	
	}