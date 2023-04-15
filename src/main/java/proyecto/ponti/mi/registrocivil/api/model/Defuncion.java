package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Defuncion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddefuncion")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idacta",referencedColumnName = "idacta")
    private Acta idacta;
    @ManyToOne
    @JoinColumn(name = "idpersona_fallecido",referencedColumnName = "idpersona_fallecido")
    private Persona idpersona_fallecido;
    private Date fdefuncion;
    @ManyToOne
    @JoinColumn(name = "idpersona_alcalde",referencedColumnName = "idpersona_alcalde")
    private Persona idpersona_alcalde;
    @ManyToOne
    @JoinColumn(name = "idusuario",referencedColumnName = "idusuario")
    private Usuario idusuario;
    private String documento;
    private Integer estado;
}
