public class Main {
    public static void main(String[] args) {
        Inter inter = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
        System.out.println(inter.perfectSquare(5));
    }
}

interface Inter {

    public boolean perfectSquare(int num);

}