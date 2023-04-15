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
    @JoinColumn(name = "idacta",referencedColumnName = "idacta")
    private Acta idacta;
    @ManyToOne
    @JoinColumn(name = "idpersona_novio",referencedColumnName = "idpersona_novio")
    private Persona idpersona_novio;
    @ManyToOne
    @JoinColumn(name = "idpersona_novia",referencedColumnName = "idpersona_novia")
    private Persona idpersona_novia;
    private Date fmatrimonio;
    private LocalDateTime fregistro;
    @ManyToOne
    @JoinColumn(name = "idpersona_testigo1",referencedColumnName = "idpersona_testigo1")
    private Persona idpersona_testigo1;
    @ManyToOne
    @JoinColumn(name = "idpersona_testigo2",referencedColumnName = "idpersona_testigo2")
    private Persona idpersona_testigo2;
    @ManyToOne
    @JoinColumn(name = "idpersona_testigo3",referencedColumnName = "idpersona_testigo3")
    private Persona idpersona_testigo3;
    @ManyToOne
    @JoinColumn(name = "idpersona_alcalde",referencedColumnName = "idpersona_alcalde")
    private Persona idpersona_alcalde;
    @ManyToOne
    @JoinColumn(name = "idusuario",referencedColumnName = "idusuario")
    private Usuario idusuario;
    private String documento;
    private Integer estado;
}
