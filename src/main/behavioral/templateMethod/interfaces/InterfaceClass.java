package behavioral.templateMethod.interfaces;

public interface InterfaceClass {

    void firstStep();
    void secondStep();
    void thirdStep();
    default void templateMethod(){
        firstStep();
        secondStep();
        thirdStep();
    }
}
