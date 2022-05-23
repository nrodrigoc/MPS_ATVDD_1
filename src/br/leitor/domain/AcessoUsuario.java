package br.leitor.domain;

import java.time.LocalDateTime;

public class AcessoUsuario {

    private int codigo;
    private LocalDateTime dataAcesso;
    private int codigoUsuario;

    public AcessoUsuario(int codigo, LocalDateTime dataAcesso, int codigoUsuario) {
        this.codigo = codigo;
        this.dataAcesso = dataAcesso;
        this.codigoUsuario = codigoUsuario;
    }

    public AcessoUsuario(LocalDateTime dataAcesso, int codigoUsuario) {
        this.dataAcesso = dataAcesso;
        this.codigoUsuario = codigoUsuario;
    }

    public AcessoUsuario() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataAcesso() {
        return dataAcesso;
    }

    public void setDataAcesso(LocalDateTime dataAcesso) {
        this.dataAcesso = dataAcesso;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
}
