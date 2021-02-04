package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DepartamentoProjeto {

    private Long id;
    private String nomeDepartamentoProjeto;
    private Projeto projeto;
}
