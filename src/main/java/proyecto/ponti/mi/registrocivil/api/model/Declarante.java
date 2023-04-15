package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Declarante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddeclarante")
    private Integer id;

    private String descripcion;
}
