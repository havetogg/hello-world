package design.carBuilder;

import java.util.ArrayList;

/**
 * Created by liangwenxing on 2017/3/9.
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
