package 观察者模式.JDK实现观察者模式;



/**
 * @Author: longsx
 * @DateTime: 2020/6/9 22:58
 * @Description: 模拟气象站向WeatherData信息收集器发送消息，发送的信息再由WeatherData自动派发到各个观察者上，进行更新相应数据和展示
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        //将实现了subject接口的weatherData对象传入构造方法进行注册 注册观察者1和观察者2
        //观察者1观察temperature和humidity
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);


        //向weatherData发送数据
        weatherData.setAttribute(27,23,222);
    }
}
