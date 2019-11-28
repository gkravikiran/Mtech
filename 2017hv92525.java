
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.LinkedList; 
import java.util.Queue; 

public class Console_Window_01 {

	
	public int Service_Square(int num)
	{
		num = num * num;
		return num;
	}
	
	public int Service_Increment(int inc)
	{
		inc = inc + 1;
		return inc;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Please enter your number: ");
        int input = scanner.nextInt();
        //System.out.println("Entered Number: " + input);
        int add_To_Queue = new Console_Window_01().Service_Square(input);
        Queue<Integer> x = new LinkedList<>();
        x.add(add_To_Queue);
        System.out.println("Value added to Queue X : " + x.peek());
        int add_To_Queue_Y = new Console_Window_01().Service_Increment(x.peek());
        Queue<Integer> y = new LinkedList<>();
        y.add(add_To_Queue_Y);
        System.out.println("Value from Queue Y : " + y.peek());
	}

}
