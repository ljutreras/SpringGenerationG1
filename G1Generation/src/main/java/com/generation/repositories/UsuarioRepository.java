package com.generation.repositories;

import com.generation.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long > { //JpaRepository<OBJETO,TIPO_DE_DATO_PK>
    /** Las interfaces solo definen los metodos*/
    /** Querys y usar metodos que se conectan a la base de datos         */

}
