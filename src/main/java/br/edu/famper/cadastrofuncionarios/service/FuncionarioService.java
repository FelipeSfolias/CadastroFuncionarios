package br.edu.famper.cadastrofuncionarios.service;

import br.edu.famper.cadastrofuncionarios.model.Funcionario;
import br.edu.famper.cadastrofuncionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> findById(Long id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario update(Funcionario funcionario){
        Funcionario salvo = funcionarioRepository.findById(funcionario.getId()).orElseThrow(()->
                new RuntimeException("Funcionário não encontrado")
        );
        salvo.setNome(funcionario.getNome());
        salvo.setCargo(funcionario.getCargo());
        salvo.setDataAdmissao(funcionario.getDataAdmissao());
        salvo.setDepartamento(funcionario.getDepartamento());
        salvo.setEmail(funcionario.getEmail());
        salvo.setTelefone(funcionario.getTelefone());

        return funcionarioRepository.save(funcionario);

    }
    public void deleteById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
