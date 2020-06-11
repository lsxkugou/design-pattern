package 装饰者模式;

/**
 * @Author: longsx
 * @DateTime: 2020/6/11 21:55
 * @Description: TODO
 */
public class ConcreteCondiment1 extends BaseCondimentDecorator {
    BaseBeverage baseBeverage;

    public ConcreteCondiment1(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
        description="concreteCondiment1";
    }

    @Override
    public String getDescription() {
        return this.description+"+"+baseBeverage.getDescription();
    }

    @Override
    double cost() {
        return 2+baseBeverage.cost();
    }
}
