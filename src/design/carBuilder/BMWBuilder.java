package design.carBuilder;

import java.util.ArrayList;

/**
 * Created by liangwenxing on 2017/3/9.
 */
public class BMWBuilder extends CarBuilder{
    private BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
