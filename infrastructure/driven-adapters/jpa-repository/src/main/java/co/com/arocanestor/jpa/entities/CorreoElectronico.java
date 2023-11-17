package co.com.arocanestor.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="correoelectronico")
public class CorreoElectronico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCorreoE;

    private String correo;
    private String tipo;

    @OneToOne
    @JoinColumn(name = "Id_Persona")
    private Persona idPersona;
}
