package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Testemunho {

    private Long id;
    private String sofreuComDepressao;
    private String tempoSofreuDepressao;
    private String tempoLivreDepressao;
    private String sofreuAutomutilacao;
    private String tempoSofreuAutomutilacao;
    private String tempoLivreAutomutilacao;
    private String sofreuVicio;
    private String descricaoVicio;
    private String tempoVicio;
    private String tempoLivreVicios;
    private String tentouSuicidio;
    private int numeroTentativasSuicidio;
    private String mesAnoTentativaSuicidio;
    private String descricaoTentativaSuicidio;
    private String textoTestemunho;
    private Jovem jovem;
}
