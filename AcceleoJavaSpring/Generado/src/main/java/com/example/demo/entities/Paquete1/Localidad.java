	package com.example.demo.entities.Paquete1;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	import org.hibernate.envers.Audited;
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
		import com.example.demo.entities.Base;
	
		
	@Entity
	@Table(name= "localidad")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	
	@Audited
	public class Localidad 	extends Base
	  {
	@Column(name = "denominacion")
		private  String denominacion;
	
	
	
	
	
	}
