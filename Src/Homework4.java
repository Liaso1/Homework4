import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;
        int[] teamAges1 = new int[teamSize];
        int[] teamAges2 = new int[teamSize];

        Random random = new Random();

        System.out.println("Вік гравців регбі:");
        System.out.print("Команда 1: ");

        int sum1 = 0;
        for (int i = 0; i < teamSize; i++) {
            teamAges1[i] = random.nextInt(maxAge - minAge + 1) + minAge;
            System.out.print(teamAges1[i] + ", ");
            sum1 += teamAges1[i];
        }

        System.out.println(" ");
        System.out.print("Команда 2: ");
        int sum2 = 0;
        for (int i = 0; i < teamSize; i++) {
            teamAges2[i] = random.nextInt(maxAge - minAge + 1) + minAge;
            System.out.print(teamAges2[i] + ", ");
            sum2 += teamAges2[i];
        }

        double avgAge1 = (double) sum1 / teamSize;
        double avgAge2 = (double) sum2 / teamSize;

        System.out.println(" ");
        System.out.println("Середній вік команди 1: " + avgAge1);
        System.out.println("Середній вік команди 2: " + avgAge2);
    }

    }

