package proyecto.ponti.mi.registrocivil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.registrocivil.api.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}
