package com.shevalucas.cursomc.repositories;

import com.shevalucas.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Transactional // transação de somente leitura
    Cliente findByEmail(String email);// Só de fazer isso no repository, ele já busca o email

}
