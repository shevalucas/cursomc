package com.shevalucas.cursomc.repositories;

import com.shevalucas.cursomc.domain.Categoria;
import com.shevalucas.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}
