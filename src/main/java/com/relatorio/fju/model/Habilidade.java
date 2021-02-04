package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Habilidade {

    private Long id;
    private String nomeHabilidade;
    private Projeto projeto;
    private DepartamentoProjeto departamentoProjeto;
}
