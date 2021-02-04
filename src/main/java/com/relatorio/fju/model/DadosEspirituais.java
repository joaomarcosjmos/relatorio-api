package com.relatorio.fju.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosEspirituais {

    private Long id;
    private String ehMembroIurd;
    private String mesAnoChegadaIURD;
    private int anoChegadaiurd;
    private int mesChegadaiurd;
    private String ehBatizadoEspiritoSanto;
    private String mesAnoBatismoEspiritoSanto;
    private String ocasiaoBatismoEspiritoSanto;
    private String comoConheceuIURD;
    private String jaSeAfastou;
    private String motivoSeAfastou;
    private String mesAnoAfastamento;
    private String tempoAfastamento;
    private String tempoEstaFirme;
    private String temFamiliaresIurd;
    private String descricaoFamiliaresIurd;
    private String ehBatizadoAguas;
    private String mesAnoBatismoAguas;
    private String batismoAguasIurd;
    private String descricaoModoChegouFju;
    private String mesAnoEntradaFju;
    private String motivoEntradaFju;
    private String possuiBiblia;
    private String possuiBibliaNoCelular;
    private String leuTodaBiblia;
    private FrequenciaLeitura frequenciaLeitura;
}
