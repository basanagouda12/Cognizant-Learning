package com.basu.mockito.test;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.basu.mockito.CalLogic;
public class CalLogicTest {
    
    CalLogic obj;    
    @Before
    public void setUp()
    {
        obj = new CalLogic();
    CalLogic obj= Mockito.mock(CalLogic.class);
        obj = Mockito.mock(CalLogic.class);
    }
    
        
    @Test
    public void cubeTest()
    {        
        assertEquals(27, obj.cube(3));
    }
    @After
    public void setDown()
    {
    obj = null;
    }
}
