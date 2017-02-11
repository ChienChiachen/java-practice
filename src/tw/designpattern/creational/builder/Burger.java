package tw.designpattern.creational.builder;

/**
 * Created by chiachen on 2016/11/24.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
