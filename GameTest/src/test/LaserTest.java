package test;

import static org.junit.Assert.*;
import java.awt.Point;
import org.junit.Before;
import org.junit.Test;
import real.Laser;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Allen
 *  @version Jun 22, 2012
 */

public class LaserTest
{
    private Laser laser;

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @throws java.lang.Exception
     */
    @Before
    public void setUp()
        throws Exception
    {
        laser = new Laser(new Point(500, 500), new Point(10, 10));
    }

    /**
     * Test method for {@link real.Laser#draw(java.awt.Graphics)}.
     */
    @Test
    public void testDraw()
    {
        fail("Not yet implemented");
    }


    /**
     * Test method for {@link real.Laser#Laser(java.awt.Point, java.awt.Point)}.
     */
    @Test
    public void testLaser()
    {
        fail("Not yet implemented");
    }


    /**
     * Test method for {@link real.Laser#move()}.
     */
    @Test
    public void testMove()
    {
        fail("Not yet implemented");
    }

}
