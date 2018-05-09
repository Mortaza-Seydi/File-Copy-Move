/**
 *  In The Name of ALLAH
 *
 *  Written by: Mortaza Seydi - Zanjan University - Spring 2018
 *
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Move implements Runnable
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
        System.out.println("\nThread Move Started...");

        if (from.isAbsolute() && to.isAbsolute())
        {
            try
            {
                Files.move(from, to);
                System.out.println("\nMove Finished");
            }
            catch (IOException e)
            {
                System.out.println("IoException Happened\n");
            }
        }
    }
}
