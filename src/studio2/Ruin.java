package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		System.out.println("How much are you starting with?");
		double beginningAmount = in.nextDouble();
		int totalSimulations = 500;
		int simulationCount = 1;

		for (int i = 0; i < totalSimulations; i++) {
			double startAmount = beginningAmount;
			int count = 0;
			while (startAmount < winLimit && startAmount > 0) {
				double win = Math.random();
				if (win <= winChance) {
					startAmount++;
				} else {
					startAmount--;
				}
				count++;
			}
				if (startAmount > 0) {
					System.out.println("Simulation " + simulationCount + ": " + count + " WIN");
				} else {
					System.out.println("Simulation " + simulationCount + ": " + count + " LOSE");
				}
				simulationCount++;
			}
		}

	}
