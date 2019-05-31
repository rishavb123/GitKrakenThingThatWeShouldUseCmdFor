public class RunnerPQ {
    public static void main(String[] args) {
        PrintQuotient hi = (float a, float b) -> System.out.printf("%.3f / %.3f = %.3f", a, b, a / b);
        hi.printQuotient(1, 3);
    }
}