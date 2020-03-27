package behavioral.observer.interfaces;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("Observer ->"+object.toString());
    }
}
