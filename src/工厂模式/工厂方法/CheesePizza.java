package 工厂模式.工厂方法;

/**
 * @Author: longsx
 * @DateTime: 2020/6/13 0:27
 * @Description: TODO
 */
public class CheesePizza extends BasePizza {


    public CheesePizza(String style) {
        name=style+"CheesePizza";

    }

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
