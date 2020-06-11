package 装饰者模式;

/**
 * @Author: longsx
 * @DateTime: 2020/6/11 21:40
 * @Description: 饮料类的实体
 */
public class ConcreteBeverage1 extends BaseBeverage {
    public ConcreteBeverage1() {
        this.description="ConcreteBeverage1";
    }

    @Override
    double cost() {
        return 5.0;
    }
}
