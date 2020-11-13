	package com.example.casotres.entities.Paquete;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import com.example.casotres.entities.Base;
	
		
	@Entity
	@Table(name= "pais")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	
	public class Pais 	extends Base
	  {
	@Column(name = "nombre")
		private  String nombre;
	
	
	
	
	
	}
