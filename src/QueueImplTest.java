import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class QueueImplTest {
    Queue<Integer> q;

    @Before
    public void setUp() throws FullQueueException {
        this.q = new QueueImpl<Integer>(4);
        q.push(1);
        q.push(2);
    }

    @After
    public void tearDown() {
        this.q = null;
    }

    @Test
    public void testPush() throws FullQueueException {
        Assert.assertEquals(2, q.size());
        q.push(3);
        Assert.assertEquals(3, q.size());
        q.push(4);
        Assert.assertEquals(4, q.size());
    }

    @Test
    public void testPop() throws EmptyQueueException {
        Assert.assertEquals(2, q.size());
        q.pop();
        Assert.assertEquals(1, q.size());
        q.pop();
        Assert.assertEquals(0, q.size());
    }
}
