package array;
import java.util.*;
public class quation1 {
	public static int sum(int[] arr) {
		int ans = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			int c = arr[i];
			ans = ans + c;
		}
		return ans;
	}
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[]= new int[n];
		for(int i = 0; i < n; i++) {
			input[i]= s.nextInt();
		}
		return input;
		
	}
		
	public static void main(String[] args) {
		int arr[] = takeInput();
		int ans = sum(arr);
		System.out.println(ans);
		
	}

}

