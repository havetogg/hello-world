package genericClass;

import java.time.LocalDate;

/**
 * Created by liangwenxing on 2017/2/23.
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthday={
                LocalDate.of(1906,12,9),
                LocalDate.of(1815,12,10),
                LocalDate.of(1903,12,1),
                LocalDate.of(1910,6,22),
        };
        Pair<LocalDate> mm = ArrayAlg2.minmax(birthday);
        System.out.println("min="+mm.getFirst());
        System.out.println("max="+mm.getSecond());
    }
}
class ArrayAlg2{
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if(a==null||a.length==0) return null;
        T min = a[0];
        T max = a[0];
        for(T t:a){
            if(min.compareTo(t)>0) min=t;
            if(max.compareTo(t)<0) max=t;
        }
        return new Pair<>(min,max);
    }
}