package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.naming.Name;

@Data
@Entity
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idprovincia")
    private Integer id;
    private String nomprovincia;
    private String ubigeo;
    private Float longitud;
    private Float latitud;


}
