package thread;

/**
 * Created by liangwenxing on 2017/3/2.
 */
public class TestSynchronized {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                TestSynchronized testSynchronized1 = new TestSynchronized();
                testSynchronized1.test1();
            }
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                TestSynchronized testSynchronized2 = new TestSynchronized();
                testSynchronized2.test1();
            }
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                TestSynchronized testSynchronized3 = new TestSynchronized();
                testSynchronized3.test1();
            }
        }).start();
    }

    public void test1(){
        synchronized(this.getClass()){
            for(int i=0;i<4;i++){
                System.out.println(Thread.currentThread().getName()+1);
                try{
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
