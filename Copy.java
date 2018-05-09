/**
 *  In The Name of ALLAH
 *
 *  Written by: Mortaza Seydi - Zanjan University - Spring 2018
 *
 *  Assignment 3
 *  Exercise 3
 *
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy implements Runnable
{
    private Path from;
    private Path to;

    public void getPath(String from, String to)
    {
        this.from = Paths.get(from);
        this.to = Paths.get(to);
    }

    @Override
    public void run()
    {
        System.out.println("\nThread Copy Started...");

        if (from.isAbsolute() && to.isAbsolute())
        {
            try
            {
                Files.copy(from, to);
                System.out.println("\nCopy Finished");

            }
            catch (IOException e)
            {
                System.out.println("IoException Happened\n");
            }
        }
    }
}
