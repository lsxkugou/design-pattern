package 工厂模式.工厂方法;

import 工厂模式.工厂方法.CheesePizza;
import 工厂模式.工厂方法.ClamPizza;

/**
 * @Author: longsx
 * @DateTime: 2020/6/13 14:54
 * @Description: PizzaStore的实现类
 */
public class NYPizzaStore extends BasePizzaStore {
    String style="New York";
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
