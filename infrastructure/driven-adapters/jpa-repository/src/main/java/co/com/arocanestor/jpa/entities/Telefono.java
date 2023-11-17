package co.com.arocanestor.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="telefono")
public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTelefono;

    private String telefono;
    private String tipo;
    @OneToOne
    @JoinColumn(name = "Id_Persona")
    private Persona idPersona;
}
