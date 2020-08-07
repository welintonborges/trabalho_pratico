package com.welintonBorges.respositor;


import com.welintonBorges.domain.Cliente;
import com.welintonBorges.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

	public Optional<Instalacao> findByCodigo(String codigo);
	public List<Instalacao> findByCliente(Cliente cliente);


}
