import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static List<String> FileReader(String filename) {
		List<String> record = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				record.add(line);
			}
			reader.close();
		} catch (Exception e) {
			System.err.format("Error occurred trying to read '%s'.", filename);
			e.printStackTrace();
		}

		return record;
	}

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.next();
		scanner.close();
		List<String> record = FileReader(filename);
		HashMap<String, Cows> cows = new HashMap<String, Cows>();
		
		String[] action = null;
		
		for (int i = 1; i < record.size(); i++) {
			action = record.get(i).split("\\s+");
			if (!cows.containsKey(action[0])) {
				cows.put(action[0], new Cows(action[0]));
			}
			Cows c = cows.get(action[0]);
			if (action[1].equals("W")) {
				if(c.ID.equals(action[0])) {
					c.setLowestWeight(Integer.parseInt(action[2]));
				}
			}
			if (action[1].equals("M")) {
				if(c.ID.equals(action[0])) {
					c.getMilk(Integer.parseInt(action[2]));
				}
			}
			if(action[1].equals("T")) {
				continue;
			}
		}
		
		ArrayList<Cows> sortedCows = new ArrayList<Cows>();
		for (Cows c : cows.values()) {
			if (c.latestWeight != 0 && c.lowestWeight != 0 && c.numOfMilkings != 0 && c.totalMilkings != 0) {
				sortedCows.add(c);
			}
		}
		
		sortedCows.sort(null);
		for (Cows c : sortedCows) {
			System.out.println(c);
		}
	}

}
