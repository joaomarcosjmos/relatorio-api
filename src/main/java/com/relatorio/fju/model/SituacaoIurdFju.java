package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SituacaoIurdFju {

    private Long id;
    private String ehObreiro;
    private int anosObreiro;
    private int mesesObreiro;
    private String mesAnoFoiLevantadoObreiro;
    private String ehColaborador;
    private int mesesColaborador;
    private int anosColaborador;
    private String estaCursandoCpo;
    private String mesAnoInicioCpo;
    private String ehPertencenteFju;
    private String ehCoordenadorFju;
    private int mesAnoCoordenadorFju;
    private int mesesCoordenadorProjeto;
    private int mesesCoordenadorTribo;
    private int mesesCoordenadorFju;
    private int anosCoordenadorProjeto;
    private int anosCoordenadorTribo;
    private int anosCoordenadorFju;
    private String ehLiderTribo;
    private String periodoCoordenandoTribo;
    private String ehLiderProjeto;
    private String periodoCoordenandoProjeto;
    private String possuiCamisaProjeto;
    private String nomeCamisaFju;
    private String tamanhoCamisa;
    private String foiObreiro;
    private String motivoSaiuObreiro;
    private String foiPastor;
    private String motivoSaiuPastor;
    private String mesAnoSaiuDaObra;
    private String desejaSerObreiro;
    private String motivoDesejaSerObreiro;
    private String desejaFazerObraNoAltar;
    private String pertenceAltarJovem;
    private String pertenceIntellimen;
    private String desafiosConcluidos;
    private int desafioAtual;
    private String nomeParceiroIntellimen;
    private String telefoneParceiroIntellimen;
    private Tribo tribo;
    private Projeto projeto;




}
