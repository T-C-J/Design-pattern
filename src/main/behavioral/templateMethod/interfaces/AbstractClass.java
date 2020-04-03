package behavioral.templateMethod.interfaces;


/**
 *  规定了方法的执行顺序
 *
 *  子类只用实现响应的方法 就会按照父类规定的顺序执行
 *  比如  netty 中 SimpleChannelInboundHandler，XXXDecoder 等类中
 *  规定了执行步骤，对外提供抽象方法
 *
 */
public abstract class AbstractClass {


    protected abstract void firstStep();
    protected abstract void secondStep();
    protected abstract void thirdStep();

    public void templateMethod(){
        firstStep();
        secondStep();
        thirdStep();
    }
}
