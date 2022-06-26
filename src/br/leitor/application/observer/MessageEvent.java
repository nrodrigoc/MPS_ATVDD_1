package br.leitor.application.observer;

public abstract class MessageEvent extends Event{
    protected String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public MessageEvent() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
