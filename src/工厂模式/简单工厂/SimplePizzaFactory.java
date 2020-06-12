package 工厂模式.简单工厂;

/**
 * @Author: longsx
 * @DateTime: 2020/6/13 0:23
 * @Description: 简单披萨工厂
 */
public class SimplePizzaFactory {
    BasePizza pizza;
    public BasePizza createPizza(String type){

        if("Cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("ClamPizza".equals(type)){
            pizza = new ClamPizza();
        }else{
            throw new RuntimeException("无输入pizza");
        }
        return pizza;
    }
}
