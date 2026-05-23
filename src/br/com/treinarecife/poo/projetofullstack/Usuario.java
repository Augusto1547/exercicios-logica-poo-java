package br.com.treinarecife.poo.projetofullstack;

import br.com.treinarecife.poo.projetofullstack.enums.StatusUsuario;
import java.time.LocalDate;

public class Usuario {

  private Long id;
  private String nome;
  private String cpf;
  private String email;
  private String senha;
  private LocalDate dataNascimento;
  private StatusUsuario status;


}