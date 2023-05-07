package proyecto.ponti.mi.registrocivil.api.controller;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import proyecto.ponti.mi.registrocivil.api.controller.dto.ActaDTO;
import proyecto.ponti.mi.registrocivil.api.model.Acta;
import proyecto.ponti.mi.registrocivil.api.repository.ActaRepository;

@RestController
@RequestMapping("/api/admin/acta")
public class ActaController {
    private final ActaRepository actaRepository;

    public ActaController(ActaRepository actaRepository) {
        this.actaRepository = actaRepository;
    }

    @GetMapping("")
    Page<Acta> index(@PageableDefault(sort="numacta", size=5) Pageable pageable){
        return actaRepository.findAll(pageable);
    }

    @GetMapping("/{id}")
    Acta obtener(@PathVariable Integer id){
        return actaRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Acta crear(@RequestBody @Validated ActaDTO actaDTO){
        Acta acta=new ModelMapper().map(actaDTO,Acta.class);
        return actaRepository.save(acta);
    }

    @PutMapping("/{id}")
    Acta actualizar(@PathVariable Integer id, @RequestBody ActaDTO actaDTO){
        Acta acta=actaRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);

        new ModelMapper().map(actaDTO, acta);
        return actaRepository.save(acta);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void eliminar(@PathVariable Integer id){
        Acta acta=actaRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
        actaRepository.delete(acta);
    }


}
