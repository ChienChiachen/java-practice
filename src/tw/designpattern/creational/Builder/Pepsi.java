package tw.designpattern.creational.Builder;

/**
 * Created by chiachen on 2016/11/24.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
