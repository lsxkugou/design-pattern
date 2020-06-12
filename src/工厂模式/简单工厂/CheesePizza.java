package 工厂模式.简单工厂;

/**
 * @Author: longsx
 * @DateTime: 2020/6/13 0:27
 * @Description: TODO
 */
public class CheesePizza extends BasePizza {

    String name="CheesePizza";
    @Override
    void prepare() {
        System.out.printf("%s\t","prepare"+name);
    }

    @Override
    void bake() {
        System.out.printf("%s\t","bake"+name);

    }

    @Override
    void cut() {
        System.out.printf("%s\t","cut"+name);

    }

    @Override
    void box() {
        System.out.printf("%s\t","box"+name);

    }
}
