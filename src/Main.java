import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Day1SonarSweep day1 = new Day1SonarSweep();
		System.out.println("Day 1, Part 1: " + day1.calculatePart1());
		System.out.println("Day 1, Part 2: " + day1.calculatePart2());
		
		Day2Dive day2 = new Day2Dive();
		System.out.println("Day 1, Part 1: " + day2.calculatePart1());
		System.out.println("Day 1, Part 2: " + day2.calculatePart2());
	}
}
