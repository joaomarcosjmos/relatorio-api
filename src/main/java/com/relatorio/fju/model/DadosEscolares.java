package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosEscolares {

    private Long id;
    private String estudaAtualmente;
    private String grauEscolaridade;
    private String grau;
    private String nomeInstituicaoEnsino;
    private String nomeCursoSuperior;
    private String periodoAtualNivelFaculdade;
    private String possuiNivelSuperior;
    private String previsaoConclusaoCurso;
    private String desejaCursarNivelSuperior;
    private String nomeCursoSuperiorDesejaCursar;
    private ModalidadeNivelSuperior modalidadeNivelSuperior;
}
