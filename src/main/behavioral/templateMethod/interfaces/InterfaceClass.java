package behavioral.templateMethod.interfaces;

public interface InterfaceClass {

    void firstStep();
    void secnodStep();
    void thirdStep();
    default void templateMethod(){
        firstStep();
        secnodStep();
        thirdStep();
    }
}
