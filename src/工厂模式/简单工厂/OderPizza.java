package 工厂模式.简单工厂;

/**
 * @Author: longsx
 * @DateTime: 2020/6/13 0:42
 * @Description: 模拟订餐
 */
public class OderPizza {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("Cheese");
    }
}
