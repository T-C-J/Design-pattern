package behavioral.observer.interfaces;

/**
 *  被观察对象
 */
public interface Subject {

    /**
     * 添加观察者
     * @param observer
     */
    void attach(Observer observer);
    /**
     * 删除观察者
     * @param observer
     */
    void detach(Observer observer);

    /**
     *  响应观察者
     */
    void notifyObservers();
}
