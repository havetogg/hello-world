package design.carBuilder;

/**
 * Created by liangwenxing on 2017/3/9.
 */
public class BenzModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("奔驰跑");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰叫");
    }

    @Override
    protected void enginBoom() {
        System.out.println("奔驰引擎响起来");
    }
}
