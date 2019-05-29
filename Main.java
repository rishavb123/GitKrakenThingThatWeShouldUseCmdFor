public class Main {
    public static void main(String[] args) {
        Inter inter = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
        System.out.println(inter.perfectSquare(5));
        Inter2 hi = (float a, float b) -> System.out.printf("%.3f / %.3f = %.3f", a, b, a / b);
		hi.methodOne(1, 3);
    }
}

interface Inter {

    public boolean perfectSquare(int num);

}


interface Inter2 {
	void methodOne(float a, float b);
}