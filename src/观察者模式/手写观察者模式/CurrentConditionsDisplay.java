package 观察者模式.手写观察者模式;

/**
 * @Author: longsx
 * @DateTime: 2020/6/9 22:49
 * @Description: 观察者1 接收发过来的信息 只展示temperature,humidity
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private Subject subject;
    private float temperature;
    private float humidity;

    /**
     * 传递一个subject的实现类 这里传递weatherData，并注册自己
     * @param subject weatherData
     */
    public CurrentConditionsDisplay(Subject subject) {
        this.subject=subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("负责监控temperature和humidity的观察者更新啦！");
        System.out.println(this.toString());

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "subject=" + subject +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
