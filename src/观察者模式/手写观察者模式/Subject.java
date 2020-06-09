package 观察者模式.手写观察者模式;

/**
 * @Author: longsx
 * @DateTime: 2020/6/9 22:26
 * @Description: 消息发送方的接口
 */
public interface Subject {
    /**
     * 该方法用于注册Observer对象，将其封装到消息发送者对象中
     * @param o Observer对象
     */
    void registerObserver(Observer o);

    /**
     * 该方法用于注销Observer对象
     * @param o Observer对象
     */
    void removerObserver(Observer o);

    /**
     * 向所有已经注册的组件发送消息
     */
    void notifyObservers();
}
