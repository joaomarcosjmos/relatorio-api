package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Regiao {

    private Long id;
    private String nomeRegiao;
    private Bloco bloco;
}
