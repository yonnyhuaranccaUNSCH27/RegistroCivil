package proyecto.ponti.mi.registrocivil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.registrocivil.api.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
