import java.util.Random;
import java.util.Scanner;

public class DieRollar
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continueRolling = true;

        while (continueRolling)
        {
            int roll = 0;
            boolean triple = false;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");

            while (!triple)
            {
                roll++;
                int die1 = gen.nextInt(6) + 1;
                int die2 = gen.nextInt(6) + 1;
                int die3 = gen.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", roll, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3)
                {
                    triple = true;
                }
            }

            System.out.print("You got a triple! Do you want to roll again? [Y/N]: ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equalsIgnoreCase("Y"))
            {
                continueRolling = false;
            }
        }

        scanner.close();
    }
}