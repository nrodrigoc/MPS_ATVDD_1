package br.leitor.application.observer;

public class EmailSubscribe extends MessageSubscribe{

    @Override
    void processMessageEvent(MessageEvent event) {
        System.out.println("Email enviado: "+ event.message);
    }
}
