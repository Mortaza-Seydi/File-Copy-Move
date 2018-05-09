/**
 *  In The Name of ALLAH
 *
 *  Written by: Mortaza Seydi - Zanjan University - Spring 2018
 *
 *  Assignment 3
 *  Exercise 3
 *
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Copy copy = new Copy();
        Move move = new Move();

        String from;
        String to;
        String copyOrMove;

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n\nType  \"copy\"   And   \"move\"  And  \"exit\"   :  ");
            copyOrMove = scanner.nextLine();

            if (copyOrMove.equals("exit"))
                break;

            System.out.println("From: ");
            from = scanner.nextLine();
            System.out.println();

            System.out.println("To: ");
            to = scanner.nextLine();
            System.out.println();

            if (copyOrMove.equals("copy"))
            {
                copy.getPath(from, to);
                Thread thread = new Thread(copy);
                thread.start();
            }

            else if (copyOrMove.equals("move"))
            {
                move.getPath(from, to);
                Thread thread = new Thread(move);
                thread.start();
            }

            else
                System.out.println("\nYou Have Entered False Path........\n");
        }

    }
}
