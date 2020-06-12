package 工厂模式.简单工厂;

/**
 * @Author: longsx
 * @DateTime: 2020/6/13 0:23
 * @Description: Pizza的基类
 */


public abstract class BasePizza {

    /**
     * 准备披萨
     */
    abstract void prepare();
    /**
     * 烘焙
     */
    abstract void bake();
    /**
     * 切片
     */
    abstract void cut();
    /**
     * 打包
     */
    abstract void box();

}
