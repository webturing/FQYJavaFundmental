package lec01b;

public class OutputFormat {
    public static void main(String[] args) {
        String name = "Tom";
        int age = 18;
        double weight = 52.1;
        char rank = '\u0042';//'B' 51
        System.out.println(String.format("%10s\t%5d\t%8.2f\t%c", name, age, weight, rank));

    }
}
