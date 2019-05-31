
public class PerfectSquareInterface{
	public static void main(String[]args){
		PerfectSquareInterfacez interfac = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
		System.out.println(interfac.PerfectSquareInterface(7));
	}
}