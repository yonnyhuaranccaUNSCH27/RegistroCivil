package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Acta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idacta")
    private Integer id;
    private String numacta;
    private String libro;
    private String folio;
    private Date fregistro;
}
