package deik;

public class CoverageExample {
    public int decision(int a, int b, int c) {

        if (a==354) {
            if (b > c) {
                a = c;
            } else {
                a = b;
            }
        }
        return a;
    }
}
