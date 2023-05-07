package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddistrito")
    private Integer id;
    private String nomdistrito;
    private String ubigeo;
    private Float longitud;
    private Float latitud;

    @ManyToOne
    @JoinColumn(name = "idprovincia")
    private Provincia idprovincia;
}
