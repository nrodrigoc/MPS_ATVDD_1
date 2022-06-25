package br.leitor.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Venda extends Transacao{

    private int parcelas;
    private int tipoParcela;

    public Venda(String codigoProcessamento, String nsu, LocalDateTime dataTransacao, long idPortador, BigDecimal valor, String status, int parcelas, int tipoParcela) {
        super(codigoProcessamento, nsu, dataTransacao, idPortador, valor, status);
        this.parcelas = parcelas;
        this.tipoParcela = tipoParcela;
    }

    public Venda(int parcelas, int tipoParcela) {
        this.parcelas = parcelas;
        this.tipoParcela = tipoParcela;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public int getTipoParcela() {
        return tipoParcela;
    }

    public void setTipoParcela(int tipoParcela) {
        this.tipoParcela = tipoParcela;
    }
}
