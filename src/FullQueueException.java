import java.lang.Throwable;

public class FullQueueException extends Throwable{

    public FullQueueException() {
        System.out.println("Error: s'està intentant agefir un objecte a una cua plena.");
    }
}
