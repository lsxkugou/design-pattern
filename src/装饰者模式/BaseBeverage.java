package 装饰者模式;

/**
 * @Author: longsx
 * @DateTime: 2020/6/11 21:34
 * @Description: 饮料基类
 */
public abstract class BaseBeverage {
    String description="unknown beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 子类重写该方法返回相应对象的价格
     * @return
     */
    abstract double cost();
}
