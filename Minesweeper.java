
/**
 * Write a description of class Minesweeper here.
 *
 * @author Oscar Martin
 * @version V1 19/03/2024
 */
import java.util.Random;
public class Minesweeper
{
    private int x;
    /**
     * Constructor for objects of class Minesweeper
     */
    public Minesweeper()
    {
        Random rand = new Random();
        int number= rand.nextInt(10);
        System.out.println(number);
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        return x + y;
    }
}
