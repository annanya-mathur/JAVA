@FunctionalInterface
interface A {
    int sum(int i , int j);
}

public class Main
{
	public static void main(String[] args) {
		A obj = (i,j) -> i+j;
		System.out.println(obj.sum(4,5));
	}
}
