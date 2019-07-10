package lec02a;

public class VariableScope {
    static int globle = 0;

    public static void main(String[] args) {
        int a = 0;
        {
            System.out.println(a);
            int b = 1;
        }
        //System.out.println(b);

    }
}
