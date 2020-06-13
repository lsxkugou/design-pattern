package 工厂模式.工厂方法;



/**
 * @Author: longsx
 * @DateTime: 2020/6/13 0:42
 * @Description: 模拟订餐
 */
public class OderPizza {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("Cheese");
        System.out.println();
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("Clam");
    }
}
