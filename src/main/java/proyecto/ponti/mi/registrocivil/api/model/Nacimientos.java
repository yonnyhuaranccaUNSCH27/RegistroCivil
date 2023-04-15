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
    @JoinColumn(name = "idacta",referencedColumnName = "idacta")
    private Acta idacta;
    @ManyToOne
    @JoinColumn(name = "idpersona_nacimiento",referencedColumnName = "idpersona_nacimiento")
    private Persona idpersona_nacimiento;
    @ManyToOne
    @JoinColumn(name = "idpersona_padre",referencedColumnName = "idpersona_padre")
    private Persona idpersona_padre;
    @ManyToOne
    @JoinColumn(name = "idpersona_madre",referencedColumnName = "idpersona_madre")
    private Persona idpersona_madre;
    @ManyToOne
    @JoinColumn(name = "iddeclarante",referencedColumnName = "iddeclarante")
    private Persona iddeclarante;
    @ManyToOne
    @JoinColumn(name = "idpersona_declarante_otros",referencedColumnName = "idpersona_declarante_otros")
    private Persona idpersona_declarante_otros;
    @ManyToOne
    @JoinColumn(name = "idpersona_alcalde",referencedColumnName = "idpersona_alcalde")
    private Persona idpersona_alcalde;
    @ManyToOne
    @JoinColumn(name = "idusuario",referencedColumnName = "idusuario")
    private Usuario idusuario;
    private LocalDateTime fregistro;
    private String documento;
    private Integer estado;

}
