package 观察者模式.手写观察者模式;

/**
 * @Author: longsx
 * @DateTime: 2020/6/9 22:49
 * @Description: 观察者2 接收发过来的信息 只展示pressure
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement{
    private Subject subject;
    private float pressure;


    /**
     * 传递一个subject的实现类 这里传递weatherData，并注册自己
     * @param subject weatherData
     */
    public CurrentConditionsDisplay2(Subject subject) {
        this.subject=subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("负责监控pressure的观察者CurrentConditionsDisplay2更新啦！");
        System.out.println(this.toString());

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure=pressure;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay2{" +
                "subject=" + subject +
                ", pressure=" + pressure +
                '}';
    }
}
