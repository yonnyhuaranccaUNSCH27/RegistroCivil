package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tipopersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipopersona")
    private Integer id;
    private String descripcion;
}
