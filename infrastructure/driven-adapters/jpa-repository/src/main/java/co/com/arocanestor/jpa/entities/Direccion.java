package co.com.arocanestor.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDireccion;

    @OneToOne
    @JoinColumn(name = "Id_Persona")
    private Persona idPersona;
    private String ciudad;
    private String barrio;
    private String direccion;
    private String detalles;
}
