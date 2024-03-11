package com.lp2.cl1ma.interfaces;

import com.lp2.cl1ma.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer> {
    Usuario findByUsername(String username);
}
