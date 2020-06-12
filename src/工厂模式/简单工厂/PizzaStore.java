package 工厂模式.简单工厂;


import java.text.SimpleDateFormat;

/**
 * @Author: longsx
 * @DateTime: 2020/6/13 0:22
 * @Description: pizza店
 */
public class PizzaStore {
    BasePizza pizza;
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public void orderPizza(String type){
        pizza=simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
