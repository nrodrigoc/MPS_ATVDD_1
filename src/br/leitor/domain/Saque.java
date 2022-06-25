package br.leitor.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Saque extends Transacao{

    private BigDecimal valorJuros;

    public Saque() {
    }

    public Saque(String codigoProcessamento, String nsu, LocalDateTime dataTransacao, long idPortador, BigDecimal valor, String status, BigDecimal valorJuros) {
        super(codigoProcessamento, nsu, dataTransacao, idPortador, valor, status);
        this.valorJuros = valorJuros;
    }

    public Saque(BigDecimal valorJuros) {
        this.valorJuros = valorJuros;
    }

    public BigDecimal getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(BigDecimal valorJuros) {
        this.valorJuros = valorJuros;
    }
}
