package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contato {
    private Long id;
    private String telefoneFixo;
    private String whatsapp;
    private String telefoneEmergencia;
    private String nomeContatoEmergencia;
}
