package lec01b;

public class DataTypeCastDemo {
    public static void main(String[] args) {
        //auto-cast: int->long int->double float->double
        long y = 3;
        double x = 4;
        double z = 3.4f;
        //
        //int a=3.2;//CE cannot convert from double to int
        int a = (int) 3.2;
        float t = (float) Math.PI;
    }
}
