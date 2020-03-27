package behavioral.observer.interfaces;

import java.util.*;

public class ConcreteSubject implements Subject{


    List<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Integer i = 0;i<4;i++){
            final  Integer num = i;
            System.out.println("Subject ->"+num);
            observers.forEach(item -> item.update(num));
        }
    }
}
