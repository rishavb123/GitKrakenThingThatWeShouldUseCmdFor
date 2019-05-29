public class Main {
    public static void main(String[] args) {

        Inter2 hi = (float a, float b) -> System.out.printf("%.3f / %.3f = %.3f", a, b, a / b);
		hi.methodOne(1, 3);
    }
}


interface Inter2 {
	void methodOne(float a, float b);
}