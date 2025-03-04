package pe.edu.idat.demo_security_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.idat.demo_security_jwt.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol,
        Integer> {

    //select * from rol where nomrol = :nomrol
    Rol findByNomrol(String nomrol);
}
