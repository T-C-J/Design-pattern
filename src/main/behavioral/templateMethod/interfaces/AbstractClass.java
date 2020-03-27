package behavioral.templateMethod.interfaces;

public abstract class AbstractClass {


    protected abstract void firstStep();
    protected abstract void secnodStep();
    protected abstract void thirdStep();


    public void templateMethod(){
        firstStep();
        secnodStep();
        thirdStep();
    }
}
