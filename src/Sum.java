import java.util.Scanner;

public class Sum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input ::");
		int x = scanner.nextInt();
		System.out.println("Enter the input ::");
		int y = scanner.nextInt();
		int add = x + y;
		int sub = x-y;
		System.out.println(add);	
		System.out.println(sub);
	}

}
