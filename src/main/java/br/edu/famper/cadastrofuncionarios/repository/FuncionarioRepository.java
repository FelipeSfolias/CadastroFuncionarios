package br.edu.famper.cadastrofuncionarios.repository;

import br.edu.famper.cadastrofuncionarios.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
