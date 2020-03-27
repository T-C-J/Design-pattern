package behavioral.observer;

import behavioral.observer.interfaces.ConcreteObserver;
import behavioral.observer.interfaces.ConcreteSubject;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver1 = new ConcreteObserver();
        ConcreteObserver concreteObserver2 = new ConcreteObserver();
        ConcreteObserver concreteObserver3 = new ConcreteObserver();
        concreteSubject.attach(concreteObserver1);
        concreteSubject.attach(concreteObserver2);
        concreteSubject.attach(concreteObserver3);

        concreteSubject.notifyObservers();

        concreteSubject.detach(concreteObserver2);
        concreteSubject.notifyObservers();
    }
}
