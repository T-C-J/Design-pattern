package behavioral.observer.example;

import behavioral.observer.interfaces.Observer;
import behavioral.observer.interfaces.Subject;

import java.util.*;

public class ConcreteSubject implements Subject {


    List<behavioral.observer.interfaces.Observer> observers = new ArrayList<>();
    @Override
    public void attach(behavioral.observer.interfaces.Observer observer) {
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
