package co.com.arocanestor.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numFactura;
    @OneToOne
    @JoinColumn(name = "Id_Persona")
    private Persona idPersona;
    private Date fecha;
    private Integer numPago;
}
