package com.example.Facial.Clases;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int id;
    public String tipoUsuario;
    public Date fechaCreacion;
    public Date fechaModificacion;
    public String contraseña;
    public String imagen;


    @ManyToOne()
    @JoinColumn(name="persona_id")
    public Persona persona;

    @ManyToOne()
    @JoinColumn(name="departamento_id")
    public Departamento departamento;

    @OneToMany(mappedBy ="usuario", fetch = FetchType.LAZY)
    public List<Asistencia> asistencias;

     // Métodos getters y setters
     public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
