package com.example.davidryan.cardgame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidryan on 07/09/2017.
 */

public class ValuesTest {

    @Test
    public void testValueNumbers(){
        assertEquals(3, Values.THREE.NUM());
        assertEquals(11, Values.JACK.NUM());
        assertEquals(14, Values.ACE.NUM());
    }
}
