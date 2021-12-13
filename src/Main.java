import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		Day1SonarSweep runner = new Day1SonarSweep();
		try {
			System.out.println("Day 1, Part 1: " + runner.calculatePart1());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Day 1, Part 2: " + runner.calculatePart2());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
