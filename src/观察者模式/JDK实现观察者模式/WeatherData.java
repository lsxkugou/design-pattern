package 观察者模式.JDK实现观察者模式;

import 观察者模式.手写观察者模式.Observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @Author: longsx
 * @DateTime: 2020/6/10 13:13
 * @Description: TODO
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }


    /**
     * 当温度发生变化时，调用该方法
     * 为什么不直接调用notifyObservers()呢？ 因为可能以后还有新的需求，可能不仅仅是调用notifyObservers了，这个时候
     * 就可以直接添加在这个方法中
     * 与手写的观察者模式一样，notifyObservers会调用该类底层维护的observers中的observer对象里的Update方法
     * 注意：必须先调用setChanged方法，该方法用于控制线程
     */
    public void measurementsChange(){
        setChanged();
        notifyObservers();

        //.......扩展方法
    }
    /**
     * 模拟从气象局接收到温度，湿度，气压。一旦接收到，调用measurementsChange方法，类比为激活事件
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setAttribute(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
