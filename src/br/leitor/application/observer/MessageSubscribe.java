package br.leitor.application.observer;

public abstract class MessageSubscribe implements Subscribe {

    @Override
    public void processEvent(Event event) {
        processMessageEvent((MessageEvent) event);
    }

    abstract void processMessageEvent(MessageEvent event);
}
