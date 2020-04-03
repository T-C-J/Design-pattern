package behavioral.templateMethod.example;


import behavioral.templateMethod.interfaces.AbstractClass;

public class ConcreteClass extends AbstractClass {

    @Override
    protected void firstStep() {
        System.out.println("第一步");
    }

    @Override
    protected void secondStep() {
        System.out.println("第二步");
    }

    @Override
    protected void thirdStep() {
        System.out.println("第三步");
    }
}
