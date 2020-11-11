	package com.example.demo.entities.Paquete1;
		import javax.persistence.JoinColumn;
		import javax.persistence.CascadeType;
			import javax.persistence.ManyToMany;
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
	@Table(name= "libro")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	
	public class Libro 	extends Base
	  {
	@Column(name = "titulo")
		private  String titulo;
	@Column(name = "paginas")
		private  int paginas;
	@Column(name = "autor")
		private  String autor;
	@Column(name = "genero")
		private  String genero;
	@Column(name = "fecha")
		private  int fecha;
	
	
	
	
	
				@ManyToMany(cascade= CascadeType.ALL)
				@JoinTable(name="Libro_Autor",
				joinColumns=@JoinColumn(name="Libro"),
				inverseJoinColumns=@JoinColumn(name="Autor"))
				@Default
			private List<Autor> haciaAutor = new ArrayList<Autor>();
	
	
	
	
	}
