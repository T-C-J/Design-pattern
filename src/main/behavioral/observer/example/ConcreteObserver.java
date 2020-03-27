package behavioral.observer.example;

import behavioral.observer.interfaces.Observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("Observer ->"+object.toString());
    }
}
