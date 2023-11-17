package co.com.arocanestor.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="mododepago")
public class ModoDePago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numPago;

    private String tipo;
    private String detalle;
}
