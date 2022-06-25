package br.leitor.application.presentation;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ConciliacaoTransacao {

    private String acao;
    private String codigoProcessamento;
    private String nsu;
    private LocalDateTime dataTransacao;
    private long referenciaPortador;
    private BigDecimal valor;

    public ConciliacaoTransacao(String acao, String codigoProcessamento, String nsu, LocalDateTime dataTransacao, long referenciaPortador, BigDecimal valor) {
        this.acao = acao;
        this.codigoProcessamento = codigoProcessamento;
        this.nsu = nsu;
        this.dataTransacao = dataTransacao;
        this.referenciaPortador = referenciaPortador;
        this.valor = valor;
    }

    public ConciliacaoTransacao() {
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getCodigoProcessamento() {
        return codigoProcessamento;
    }

    public void setCodigoProcessamento(String codigoProcessamento) {
        this.codigoProcessamento = codigoProcessamento;
    }

    public String getNsu() {
        return nsu;
    }

    public void setNsu(String nsu) {
        this.nsu = nsu;
    }

    public LocalDateTime getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDateTime dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public long getReferenciaPortador() {
        return referenciaPortador;
    }

    public void setReferenciaPortador(long referenciaPortador) {
        this.referenciaPortador = referenciaPortador;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
