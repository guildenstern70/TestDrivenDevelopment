package it.ibm.com.bocconi.tdd;

import static org.assertj.core.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LockerTest
{

    @Before
    public void before()
    {
        System.out.println("Setting it up");
    }

    @Test
    public void whenLockerIsClosedYouCanLockIt()
    {
        Locker locker = new Locker();
        locker.close();
        locker.lock();
        assertThat(locker.getStatus()).isEqualTo(LockerStatus.LOCKED);
    }

    @After
    public void after()
    {
        System.out.println("Running: tearDown");
    }

}
