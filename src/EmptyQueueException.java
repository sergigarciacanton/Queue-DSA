import java.lang.Throwable;

public class EmptyQueueException extends Throwable {

    public EmptyQueueException() {
        System.out.println("Error: s'està intentant extreure un objecte d'una cua buida.");
    }
}
