package 工厂模式.工厂方法;

/**
 * @Author: longsx
 * @DateTime: 2020/6/13 15:13
 * @Description: TODO
 */
public class ChicagoPizzaStore extends BasePizzaStore {
    String style="Chicago";
    @Override
    BasePizza createPizza(String type) {
        if("Cheese".equals(type)){
            pizza = new CheesePizza(style);
        }else if("Clam".equals(type)){
            pizza = new ClamPizza(style);
        }else{
            throw new RuntimeException("无输入pizza");
        }
        return pizza;
    }
}
