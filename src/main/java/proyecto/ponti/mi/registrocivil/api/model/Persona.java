package proyecto.ponti.mi.registrocivil.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpersona")
    private Integer id;
    private String dni;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String genero;
    private Date fnacimiento;
    private String nacionalidad;
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "iddistrito",referencedColumnName = "iddistrito")
    private Distrito iddistrito;

    @ManyToOne
    @JoinColumn(name = "idtipopersona",referencedColumnName = "idtipopersona")
    private Tipopersona idtipopersona;
}
