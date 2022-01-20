

import java.util.Arrays;
import java.util.Scanner;

public class TestSubjects {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] health = new int [11];
		int [] info = new int [3];
		info[0] = 1;
		health[10] = info [0];
		random(health);
		health[0] = 1;
		int [][] hospital = new int [4][5];
		hospital[0][1] = health[0];
		hospital[0][2] = health[1];
		hospital[0][3] = health[2];
		hospital[1][4] = health[3];
		hospital[2][4] = health[4];
		hospital[3][3] = health[5];
		hospital[3][2] = health[6];
		hospital[3][1] = health[7];
		hospital[2][0] = health[8];
		hospital[1][0] = health[9];
		int end = 0;

		for (int n = 0 ; n < hospital.length ; n++)
			 System.out.println(Arrays.toString(hospital[n]));
		System.out.println();

		int points = 0;

		for(int days = 0; days <= 101; days++)
			if (days == 0) {
			intro();
		for (int p = 0; p < hospital.length; p++)
			System.out.println(Arrays.toString(hospital[p]));

		System.out.println("You are in room 1. You can go to room 2 that has a current health value of " + health[1] + " or room 10 that has a current health value of " + health[9] + ". Which room would you like to go to next? ");

		int d = input.nextInt();
		info[0] = d;

		if (info[0] == 10) 	{
			info[1] = 1;
			info[2] = info[0] -1;}
		else
			info[1] = info[0] + 1;

		if (info[0] == 1) {
			info[2] = 10;
			info[1] = info[0] + 1 ;}
		else
			info[2] = info[0] - 1;

		health[10] = info [0];
		random(health);

		health[d-1] = 1;

		hospital[0][1] = health[0];
		hospital[0][2] = health[1];
		hospital[0][3] = health[2];
		hospital[1][4] = health[3];
		hospital[2][4] = health[4];
		hospital[3][3] = health[5];
		hospital[3][2] = health[6];
		hospital[3][1] = health[7];
		hospital[2][0] = health[8];
		hospital[1][0] = health[9];

		points+=30;
 }
		else if (days >= 1 & days <= 99 & end == 0) {
			for (int p = 0; p < hospital.length; p++)
				System.out.println(Arrays.toString(hospital[p]));
		System.out.println("You are in room " + info[0] + ". You can go to room " + info[1] + " that has a current health value of " + health[info[1]-1] + " or room " + info[2] +" that has a current health value of " + health[info[2]-1] + ". Which room would you like to go to next? ");

		int d = input.nextInt();
		info[0] = d;
		if (info[0] == 10)
			info[1] = 1;
		else
			info[1] = info[0] + 1;

		if (info[0] == 1)
			info[2] = 10;
		else
			info[2] = info[0] - 1;

		health[10] = info [0];


		random(health);

		health[d-1] = 1;

			if (highest(health) >= 100) {
				end = 1;
			}

		hospital[0][1] = health[0];
		hospital[0][2] = health[1];
		hospital[0][3] = health[2];
		hospital[1][4] = health[3];
		hospital[2][4] = health[4];
		hospital[3][3] = health[5];
		hospital[3][2] = health[6];
		hospital[3][1] = health[7];
		hospital[2][0] = health[8];
		hospital[1][0] = health[9];

		points+=30;

		}
		else if (days == 100){
			System.out.println("Congratulations!");
			System.out.println();
			System.out.println("You managed to survive for " + days + " days and scored " + points + " points.");
			System.out.println();
			System.out.println("The virus is no longer a threat and there is still a world that you can take over... at least for now.");
			System.out.println();
			System.out.println("Stay tuned for part two coming soon.");
		}
		else if (end ==1 ) {
			System.out.println("GAME OVER");
			System.out.println();
			System.out.println("One of your test subjects has died and released the virus.");
			System.out.println();
			System.out.println("You survived " + days + " days and scored " + points + " points.");
			System.out.println();
			System.out.println("However that doesn't really matter because everyone in the world is now dead.");
			System.out.println();
			System.out.println("Do better next time.");
			System.out.println();

			for(int c = 0; c < hospital.length; c++)
				System.out.println(Arrays.toString(hospital[c]));

			days = 101;


		}

		}

	public static int highest(int[] health) {
		int highest = 0;

		for (int h = 0; h < health.length; h++) {

		if (health[h] > highest)
			highest = health[h];
			if (highest >= 100)
				return highest;
	}
		return highest;
	}

	public static int intro() {
		Scanner input = new Scanner(System.in);

		System.out.println("Your name is Dr.Grimsbane and you are an evil mad scientist that wants to take over the world. Your plan was to");
		System.out.println("develop a biological weapon that could target important individuals in society. However one day when you were");
		System.out.println("working on your weapon it mutated into a very contagious and deadly virus that you cannot control. If a person");
		System.out.println("contracts the virus and dies within the first 100 days, their body releases the virus into the air and infects");
		System.out.println("more people. Lucky, the only people in the world right now that have the virus are your 10 test subjects. Your ");
		System.out.println("goal is to keep your test subjects alive for 100 days so they do not spread the virus. Treating a test subject");
		System.out.println("is to keep your test subjects alive for 100 days so they do not spread the virus. Treating a test subject takes ");
		System.out.println("a lot of time so you can only treat 1 test subject per day in a room adjacent to the one that you are currently");
		System.out.println("in. Every time you visit a room the test subject’s health will be reset to 1. You can monitor a test subject's");
		System.out.println("health by looking at a map just like the one above. If a test subject’s health reaches 100 they die and you lose.");
		System.out.println("You will start in room 1 which is located near the top left hand corner of the map with the following room numbers ");
		System.out.println("determined by counting up in a clockwise motion.");

		System.out.println();

		System.out.println("If you understand type 1 and hit enter to begin.");
		int q = input.nextInt();

		if (q == 1)
		return q;
		else
			q = 1;
			System.out.println("I don't care you are starting anyway just read it again.");
			System.out.println();
			return q;

	}
	public static int[] random(int [] health) {

		int i = 0;
		for (int y = 0; y < 10; y++)

		health[y] += Math.abs( Math.random()* 2 * (3 * (5 - Math.abs(health[10] - i))));
		i++;

		if(i == 10)
			i = 0;

	return health;

	}

	}