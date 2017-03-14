package design.carBuilder;

import java.util.ArrayList;

/**
 * Created by liangwenxing on 2017/3/9.
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
