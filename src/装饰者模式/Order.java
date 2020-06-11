package 装饰者模式;

/**
 * @Author: longsx
 * @DateTime: 2020/6/11 21:57
 * @Description: TODO
 */
public class Order {
    public static void main(String[] args) {
        //新建被装饰对象 注意 要用上转型对象，不然后面无法装饰
        BaseBeverage concreteBeverage1=new ConcreteBeverage1();
        //装饰对象
        concreteBeverage1 = new ConcreteCondiment1(concreteBeverage1);
        concreteBeverage1 = new ConcreteCondiment1(concreteBeverage1);


        System.out.println(concreteBeverage1.cost());
        System.out.println(concreteBeverage1.getDescription());

    }
}
