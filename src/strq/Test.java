package strq;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test
{

    public static void main(String[] args)
    {
        StringQueue queue = new SimpleStringQueue();  // FIXME: Use an instance of your SimpleStringQueue.

        //        queue.enqueue("BOLDLY TO GO");
        //        System.out.println(queue);
        //        queue.dequeue(7);
        //        System.out.println(queue);
        //        queue.enqueue("TO THE STORE");
        //        System.out.println(queue);
        //        System.out.println(queue.length());


        queue.enqueue("Hello, world!");
        queue.enqueue("  ");
        queue.enqueue("This is a test.");

        System.out.println(queue);

        if(queue.length() != 30)
        {
            throw new AssertionError();
        }
        String s = queue.dequeue(10);


        System.out.println(queue.length());

        if(queue.length() != 20)
        {
            throw new AssertionError();
        }

        System.out.println(s);

        if(!s.equals("Hello, wor"))
        {
            throw new AssertionError();
        }
        s = queue.dequeue(10);

        System.out.println(s);

        if(queue.length() != 10)
        {
            throw new AssertionError();
        }
        if(!s.equals("ld!  This "))
        {
            throw new AssertionError();
        }
        queue.enqueue("  All done.");
        if(queue.length() != 21)
        {
            throw new AssertionError();
        }
        s = queue.dequeue(21);
        if(queue.length() != 0)
        {
            throw new AssertionError();
        }
        if(!s.equals("is a test.  All done."))
        {
            throw new AssertionError();
        }


    }

}
