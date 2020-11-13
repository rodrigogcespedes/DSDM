package com.example.casodos.entities.Paquete;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.casodos.entities.Base;


@Entity
@Table(name = "persona")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Persona extends Base {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Domicilio")
    private Domicilio haciaDomicilio;


}
