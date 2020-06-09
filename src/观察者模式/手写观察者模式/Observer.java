package 观察者模式.手写观察者模式;

/**
 * @Author: longsx
 * @DateTime: 2020/6/9 22:27
 * @Description: observer接口
 */
public interface Observer {
    /**
     * subject中的数据进行变化时，Observer对象必须同步更新自己的数据
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temperature, float humidity, float pressure);
}
