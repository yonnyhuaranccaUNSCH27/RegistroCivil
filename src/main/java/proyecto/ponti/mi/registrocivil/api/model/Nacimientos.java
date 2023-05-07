package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Nacimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idnacimientos")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idacta")
    private Acta idacta;
    @ManyToOne
    @JoinColumn(name = "idpersona_nacimiento")
    private Persona idpersona_nacimiento;
    @ManyToOne
    @JoinColumn(name = "idpersona_padre")
    private Persona idpersona_padre;
    @ManyToOne
    @JoinColumn(name = "idpersona_madre")
    private Persona idpersona_madre;
    @ManyToOne
    @JoinColumn(name = "iddeclarante")
    private Persona iddeclarante;
    @ManyToOne
    @JoinColumn(name = "idpersona_declarante_otros")
    private Persona idpersona_declarante_otros;
    @ManyToOne
    @JoinColumn(name = "idpersona_alcalde")
    private Persona idpersona_alcalde;
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario idusuario;
    private LocalDateTime fregistro;
    private String documento;
    private Integer estado;

}
