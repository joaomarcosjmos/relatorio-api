package com.relatorio.fju.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Jovem {

    private Long id;
    private String nome;
    private String sexo;
    private String nomeArquivoFoto;
    private String nomeConjuge;
    private LocalDateTime dataCasmento;
    private String possuiFilhos;
    private int quantidadeFilhos;
    private String conjugeEhIurd;
    private String conjugeEhObreiro;
    private String namoraAtualmente;
    private String gostaDeAlguem;
    private String nomePretendente;
    private String possuiTituloEleitor;
    private String pertenceGrupoMulheresIurd;
    private String nomeGrupoMulheresIurd;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataPreenchimentoFormulario;
    private LocalDateTime dataUltimaAtualizacao;
    private String textoSugestao;
    private Contato contato;
    private RedeSocial redeSocial;
    private Endereco endereco;
    private DadosProfissional dadosProfissional;
    private TipoEstadoCivil tipoEstadoCivil;
    private DadosEscolares dadosEscolares;
    private DadosEspirituais dadosEspirituais;
    private SituacaoIurdFju situacaoIurdFju;
    private Igreja igreja;
    private String ehPastor;



}
