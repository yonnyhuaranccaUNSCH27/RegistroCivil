package proyecto.ponti.mi.registrocivil.api.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class ActaDTO {
    @NotBlank
    @Size(min=3, max=25)
    private String numacta;

    private String libro;

    private String folio;

    private Date fregistro;
}
