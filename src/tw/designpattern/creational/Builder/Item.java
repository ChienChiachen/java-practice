package tw.designpattern.creational.Builder;

/**
 * Created by chiachen on 2016/11/24.
 */
public interface Item {
    public abstract String name();
    public Packing packing();
    public abstract float price();
}
