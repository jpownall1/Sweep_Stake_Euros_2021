package codeSS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunSweepStake {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<String> listOfPeople = new ArrayList<>();
		
		System.out.print("Please enter the number of people participating: ");
		int a = in.nextInt();
		String person = in.nextLine();
		for (int i=0; i < a; i++) {
			System.out.print("Please enter person " + (i+1) + "'s name: ");
			person = in.nextLine();
			listOfPeople.add(person);
		}
		
		in.close();
		
		SweepStake s = new SweepStake(listOfPeople);
		System.out.println(s.toString());
		
	}
	
}
