	package com.example.demo.entities.Paquete1;
	import java.io.Serializable;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import main.java.com.example.demo.entities.Base;
	
		
	@Entity
	@Table(name= "autor")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	
	public class Autor 	extends Base
	  {
	@Column(name = "")
		private  String nombre;
	@Column(name = "")
		private  String apellido;
	@Column(name = "")
		private  String bibliografia;
	
	
	
	}
