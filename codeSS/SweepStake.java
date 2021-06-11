package codeSS;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SweepStake {

	private final String[] topTeams = {"France", "England", "Portugal", "Germany", 
			"Belgium", "Italy", "Spain", "Netherlands", "Croatia", "Poland", "Turkey",
			"Denmark", "Sweden", "Wales", "Scotland" };
	private List<String> selectedTeams;
	public List<String> people;
	
	public SweepStake(List<String> p) {
		this.people = p;
		List<String> sT = new ArrayList<>();
		for (int i = 0; i < p.size(); i++ ) {
			sT.add(topTeams[i]);
		}
		this.selectedTeams = sT;
	}
	
	public int randInt() {
		Random r = new Random();
		int randInt = r.nextInt(selectedTeams.size());
		return randInt;
	}
	
	public String toString() {
		String results = "";
		
		for (String person : people) {
			int index = randInt();
			results = results + person + " is matched with " + selectedTeams.get(index) + "\n";
			selectedTeams.remove(index);
		}
		return results;
	}
	
}
