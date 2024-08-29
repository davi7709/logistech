package com.logistech.logistech.model;

public class Produto {

    private String codigo;
    private String nome;
    private String descricao;
    private int quantidadeEmEstoque;
    private double precoUnitario;

    //Transformar em um ENUM
    private String categoria;

    //Criar outra classe
    private String fornecedor;
    private String dataEntradaEstoque;

    //Categoria de alimentos pereciveis
    private String dataValidade;
    private String localizacaoNoArmazem;
    private int nivelMinimoEstoque;
    private int nivelMaximoEstoque;
    private String codigoDeBarras;
    private boolean ativo;
    private String imagem;

    public Produto(){

    }

    public Produto(String codigo, String nome, String descricao, int quantidadeEmEstoque,
                   double precoUnitario, String categoria, String fornecedor,
                   String dataEntradaEstoque, String dataValidade, String localizacaoNoArmazem,
                   int nivelMinimoEstoque, int nivelMaximoEstoque, String codigoDeBarras,
                   boolean ativo, String imagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.precoUnitario = precoUnitario;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.dataEntradaEstoque = dataEntradaEstoque;
        this.dataValidade = dataValidade;
        this.localizacaoNoArmazem = localizacaoNoArmazem;
        this.nivelMinimoEstoque = nivelMinimoEstoque;
        this.nivelMaximoEstoque = nivelMaximoEstoque;
        this.codigoDeBarras = codigoDeBarras;
        this.ativo = ativo;
        this.imagem = imagem;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDataEntradaEstoque() {
        return dataEntradaEstoque;
    }

    public void setDataEntradaEstoque(String dataEntradaEstoque) {
        this.dataEntradaEstoque = dataEntradaEstoque;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getLocalizacaoNoArmazem() {
        return localizacaoNoArmazem;
    }

    public void setLocalizacaoNoArmazem(String localizacaoNoArmazem) {
        this.localizacaoNoArmazem = localizacaoNoArmazem;
    }

    public int getNivelMinimoEstoque() {
        return nivelMinimoEstoque;
    }

    public void setNivelMinimoEstoque(int nivelMinimoEstoque) {
        this.nivelMinimoEstoque = nivelMinimoEstoque;
    }

    public int getNivelMaximoEstoque() {
        return nivelMaximoEstoque;
    }

    public void setNivelMaximoEstoque(int nivelMaximoEstoque) {
        this.nivelMaximoEstoque = nivelMaximoEstoque;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
