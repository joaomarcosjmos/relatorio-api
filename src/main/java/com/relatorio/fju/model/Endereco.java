package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

    private Long id;
    private String descricaoEndereco;
    private String cidade;
    private String nomeEstado;
    private String bairro;
    private TipoMoradia tipoMoradia;
}
