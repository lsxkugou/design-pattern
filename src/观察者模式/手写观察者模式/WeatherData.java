package 观察者模式.手写观察者模式;

import java.util.ArrayList;

/**
 * @Author: longsx
 * @DateTime: 2020/6/9 22:34
 * @Description: 气象站类，实现了Subject接口，模拟接收消息，并向组件发送更新消息
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当温度发生变化时，调用该方法
     * 为什么不直接调用notifyObservers()呢？ 因为可能以后还有新的需求，可能不仅仅是调用notifyObservers了，这个时候
     * 就可以直接添加在这个方法中
     */
    public void measurementsChange(){
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
}
