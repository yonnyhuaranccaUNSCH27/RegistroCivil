package proyecto.ponti.mi.registrocivil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.registrocivil.api.model.Acta;

import java.util.Optional;

public interface ActaRepository extends JpaRepository<Acta, Integer> {
    //OBTNER UNA ACTA POR ID
    Optional<Acta> findOneById(Integer id);
    Optional<Acta> findOneByIdAndNumacta(Integer id,String numacta);
}
