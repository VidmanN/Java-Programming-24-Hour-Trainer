package com.practicaljava.unit1;

/**
 * Created by Nadiya Vidman on 27.01.2017.
 */
import	java.util.Scanner;

public class FriendsAndFamily {
    public	static void	main(String[] args)	{
        Scanner	input =	new	Scanner(System.in);
        do	{
            System.out.println("\n Enter list price: ");
            double listPrice = input.nextDouble();

            System.out.println(" Enter discount	%: ");
            int	discount = input.nextInt();

            System.out.printf(" You'll	pay	only $%2.2f", listPrice - listPrice*discount/100);

            System.out.println("\n Next? ");

        } while(input.nextBoolean());
    }

}
