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
    @JoinColumn(name = "idacta")
    private Acta idacta;
    @ManyToOne
    @JoinColumn(name = "idpersona_fallecido")
    private Persona idpersonafallecido;
    private Date fdefuncion;
    @ManyToOne
    @JoinColumn(name = "idpersona_alcalde")
    private Persona idpersonaalcalde;
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario idusuario;
    private String documento;
    private Integer estado;
}
