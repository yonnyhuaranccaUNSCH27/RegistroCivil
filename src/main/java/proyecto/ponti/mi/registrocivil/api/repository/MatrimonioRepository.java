package proyecto.ponti.mi.registrocivil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.registrocivil.api.model.Matrimonio;

public interface MatrimonioRepository extends JpaRepository<Matrimonio,Integer> {
}
