package br.leitor.application.observer;

public class AuditoriaSubscribe implements Subscribe {

    @Override
    public void processEvent(Event event) {
        AuditoriaEvent auditoriaEvent = (AuditoriaEvent) event;
        System.out.println(auditoriaEvent);
    }
}
