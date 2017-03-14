package design.carBuilder;

/**
 * Created by liangwenxing on 2017/3/9.
 */
public class BMWModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("BMW S");
    }

    @Override
    protected void stop() {
        System.out.println("BMW S");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW A");
    }

    @Override
    protected void enginBoom() {
        System.out.println("BMW E");
    }
}
