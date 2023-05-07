package proyecto.ponti.mi.registrocivil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.registrocivil.api.model.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia,Integer> {
}
