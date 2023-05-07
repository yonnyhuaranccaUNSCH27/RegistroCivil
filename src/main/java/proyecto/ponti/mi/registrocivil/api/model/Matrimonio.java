package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class Matrimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmatrimonio")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idacta")
    private Acta idacta;
    @ManyToOne
    @JoinColumn(name = "idpersona_novio")
    private Persona idpersonanovio;
    @ManyToOne
    @JoinColumn(name = "idpersona_novia")
    private Persona idpersonanovia;
    private Date fmatrimonio;
    private LocalDateTime fregistro;
    @ManyToOne
    @JoinColumn(name = "idpersona_testigo1")
    private Persona idpersonatestigo1;
    @ManyToOne
    @JoinColumn(name = "idpersona_testigo2")
    private Persona idpersonatestigo2;
    @ManyToOne
    @JoinColumn(name = "idpersona_testigo3")
    private Persona idpersonatestigo3;
    @ManyToOne
    @JoinColumn(name = "idpersona_alcalde")
    private Persona idpersonaalcalde;
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario idusuario;
    private String documento;
    private Integer estado;
}
