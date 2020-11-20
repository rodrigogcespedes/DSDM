	package com.example.demo.entities.Paquete1;
		import javax.persistence.JoinColumn;
		import javax.persistence.CascadeType;
			import javax.persistence.OneToMany;
			import javax.persistence.JoinTable;
			import java.util.ArrayList;
			import java.util.List;
			import lombok.Builder.Default;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import com.example.demo.entities.Base;
	
		
	@Entity
	@Table(name= "persona")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	
	public class Persona 	extends Base
	  {
	@Column(name = "nombre")
		private  String nombre;
	@Column(name = "apellido")
		private  String apellido;
	
	
	
	
	
					@OneToMany(cascade=CascadeType.MERGE, orphanRemoval=true)
			
			private List<Libro> haciaLibro = new ArrayList<Libro>();
	
	
	
	
	}
