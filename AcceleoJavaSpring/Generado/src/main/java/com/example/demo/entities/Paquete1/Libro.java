	package com.example.demo.entities.Paquete1;
		import javax.persistence.JoinColumn;
		import javax.persistence.CascadeType;
			import javax.persistence.ManyToMany;
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
	@Table(name= "libro")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	
	public class Libro 	extends Base
	  {
	@Column(name = "")
		private  String titulo;
	@Column(name = "")
		private  int paginas;
	@Column(name = "")
		private  String autor;
	@Column(name = "")
		private  String genero;
	@Column(name = "")
		private  int fecha;
	
	
	
	}
