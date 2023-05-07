package proyecto.ponti.mi.registrocivil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.registrocivil.api.model.Nacimientos;

public interface NacimientosRepository extends JpaRepository<Nacimientos, Integer> {
}
