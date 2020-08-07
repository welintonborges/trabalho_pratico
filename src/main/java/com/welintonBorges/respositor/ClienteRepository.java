package com.welintonBorges.respositor;

import com.welintonBorges.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Optional<Cliente> findByCpf(String cpf);

}
