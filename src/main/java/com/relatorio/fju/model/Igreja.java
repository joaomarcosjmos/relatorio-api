package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Igreja {

    private Long id;
    private String nomeIgreja;
    private Regiao regiao;
}
