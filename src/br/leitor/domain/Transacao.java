package br.leitor.domain;

import br.leitor.application.state.TransacaoMenuState;
import br.leitor.application.state.TransacaoPagamentoState;
import br.leitor.application.state.TransacaoSaqueState;
import br.leitor.application.state.TransacaoState;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Transacao {

    protected String codigoProcessamento;
    protected String nsu;
    protected LocalDateTime dataTransacao;
    protected long idPortador;
    protected BigDecimal valor;
    protected String status;

    private final TransacaoState estadoPagamento;
    private final TransacaoState estadoSaque;
    private final TransacaoState estadoMenuTransacao;

    private TransacaoState estado;

    Transacao(String codigoProcessamento, String nsu, LocalDateTime dataTransacao, long idPortador, BigDecimal valor, String status) {
        this.codigoProcessamento = codigoProcessamento;
        this.nsu = nsu;
        this.dataTransacao = dataTransacao;
        this.idPortador = idPortador;
        this.valor = valor;
        this.status = status;

        estadoPagamento = new TransacaoPagamentoState(this);
        estadoSaque = new TransacaoSaqueState(this);
        estadoMenuTransacao = new TransacaoMenuState(this);
        setEstado(estadoPagamento);
    }

    public Transacao() {
        estadoPagamento = new TransacaoPagamentoState(this);
        estadoSaque = new TransacaoSaqueState(this);
        estadoMenuTransacao = new TransacaoMenuState(this);
        setEstado(estadoPagamento);
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

    public TransacaoState getEstado() {
        return estado;
    }

    public void setEstado(TransacaoState estado) {
        this.estado = estado;
    }

    public TransacaoState getEstadoPagamento() {
        return estadoPagamento;
    }

    public TransacaoState getEstadoSaque() {
        return estadoSaque;
    }

    public TransacaoState getEstadoMenuTransacao() {
        return estadoMenuTransacao;
    }
}
