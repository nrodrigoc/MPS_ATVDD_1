package br.leitor.application.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Publisher {

    private Map<String, List<Subscribe>> listeners;

    public void addListner(String eventType, Subscribe subscribe){
        List<Subscribe> listners = listeners.get(eventType);
        if(listners == null){
            listners = new ArrayList<Subscribe>();
        }
        listners.add(subscribe);
    }

    public void removeListner(String eventType, Subscribe subscribe){
        List<Subscribe> listners = listeners.get(eventType);
        if(listners == null){
            return;
        }
        listners.remove(subscribe);
    }

    public void notify(String eventType, Event event){
        List<Subscribe> subscribes = listeners.get(eventType);
        if(subscribes != null){
            subscribes.forEach(subscribe -> {
                subscribe.processEvent(event);
            });
        }
    }

}
