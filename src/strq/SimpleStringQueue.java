package strq;
/**
 * Created by alvin2 on 12/10/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class SimpleStringQueue implements StringQueue
{
    String s = "";

    @Override
    public int length()
    {
        return s.length();
    }

    @Override
    public void enqueue(String string)
    {
        for (int i = 0; i < string.length(); i++) {
            s += string.charAt(i);
        }
    }

    @Override
    public String dequeue(int length)
    {
        if (length > s.length()) {
            throw new RuntimeException("Out of bounds!");
        }

        s = s.substring(length);
        return s;
    }

    @Override
    public String toString()
    {
        return s;
    }
}
