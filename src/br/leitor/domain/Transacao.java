package br.leitor.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Transacao {

    protected String codigoProcessamento;
    protected String nsu;
    protected LocalDateTime dataTransacao;
    protected long idPortador;
    protected BigDecimal valor;
    protected String status;

    public Transacao(String codigoProcessamento, String nsu, LocalDateTime dataTransacao, long idPortador, BigDecimal valor, String status) {
        this.codigoProcessamento = codigoProcessamento;
        this.nsu = nsu;
        this.dataTransacao = dataTransacao;
        this.idPortador = idPortador;
        this.valor = valor;
        this.status = status;
    }

    public Transacao() {
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

    public long getIdPortador() {
        return idPortador;
    }

    public void setIdPortador(long idPortador) {
        this.idPortador = idPortador;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
