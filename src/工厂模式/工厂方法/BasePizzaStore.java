package 工厂模式.工厂方法;



/**
 * @Author: longsx
 * @DateTime: 2020/6/13 0:22
 * @Description: pizza店
 */
public abstract class BasePizzaStore {
    BasePizza pizza;
    String style;

    /**
     * 工厂方法 下面的实体类必须实现该方法
     * @param type pizza的种类
     * @return pizza
     */
    abstract BasePizza createPizza(String type);
    public void orderPizza(String type){
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
