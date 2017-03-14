package logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by liangwenxing on 2017/3/4.
 */
public class Test1 {
    private static final Logger myLogger = Logger.getLogger("Demo.Demo");

    public int read(String file,String pattern){
        return 0;
    }

    public static void main(String[] args) {
        Logger.getGlobal().info("just for test");
        Logger.getGlobal().setLevel(Level.FINE);
        myLogger.setLevel(Level.FINE);
        myLogger.warning("warning");
        myLogger.fine("fine");
        myLogger.log(Level.FINE,"fine two");
    }
}
