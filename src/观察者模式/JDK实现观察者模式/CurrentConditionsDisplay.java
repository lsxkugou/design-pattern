package 观察者模式.JDK实现观察者模式;

import 观察者模式.手写观察者模式.DisplayElement;

import java.util.Observable;
import java.util.Observer;
import 观察者模式.手写观察者模式.Subject;

/**
 * @Author: longsx
 * @DateTime: 2020/6/10 13:30
 * @Description: 观察者1 接收发过来的信息 只展示temperature,humidity
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private java.util.Observable observable;
    private float temperature;
    private float humidity;

    /**
     * 传递一个subject的实现类 这里传递weatherData，并注册自己
     * @param observable weatherData继承
     */
    public CurrentConditionsDisplay(java.util.Observable observable) {
       this.observable=observable;
       observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("负责监控temperature和humidity的观察者更新啦！");
        System.out.println(this.toString());

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            this.humidity=((WeatherData) o).getHumidity();
            this.temperature=((WeatherData) o).getTemperature();
            display();

        }

    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "observable=" + observable +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }


}
