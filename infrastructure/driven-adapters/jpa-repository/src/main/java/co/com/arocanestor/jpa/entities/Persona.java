package co.com.arocanestor.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    private String nombre;
    private String apellido;
    private String docIdentificacion;
    private Date fechaNacimiento;
    @OneToOne
    @JoinColumn(name = "Id_Sexo")
    private Sexo idSexo;
}
