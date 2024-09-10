package br.edu.famper.cadastrofuncionarios.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name="tbl_funcionario")
@Data

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "funcionario_id")
    private Long id;
    @Column(name = "Nome", length = 75)
    private String nome;
    @Column(name = "Cargo", length = 75)
    private String cargo;
    @Column(name = "Departamento", length = 75)
    private String departamento;
    @Column(name = "Data de Admissão")
    private LocalDate dataAdmissao;
    @Column(name = "E-mail")
    private String email;
    @Column(name = "Telefone")
    private String telefone;

}