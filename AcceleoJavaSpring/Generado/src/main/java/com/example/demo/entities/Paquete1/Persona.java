	package com.example.demo.entities.Paquete1;
		import javax.persistence.JoinColumn;
		import javax.persistence.CascadeType;
			import javax.persistence.OneToOne;
			import javax.persistence.OneToMany;
			import javax.persistence.JoinTable;
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
	@Table(name= "persona")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	
	public class Persona 	extends Base
	  {
	@Column(name = "")
		private  String nombre;
	@Column(name = "")
		private  String apellido;
	@Column(name = "")
		private  int dni;
	
	
	
	}
