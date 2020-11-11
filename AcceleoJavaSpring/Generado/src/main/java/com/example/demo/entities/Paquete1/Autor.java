	package com.example.demo.entities.Paquete1;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import com.example.demo.entities.Base;
	
		
	@Entity
	@Table(name= "autor")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	
	public class Autor 	extends Base
	  {
	@Column(name = "nombre")
		private  String nombre;
	@Column(name = "apellido")
		private  String apellido;
	@Column(name = "bibliografia")
		private  String bibliografia;
	
	
	
	
	
	}
