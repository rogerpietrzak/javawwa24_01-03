import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ...comment class...
 *
 * @author
 * @since 01.03.2020
 */
class AlgorithmsTest {
    @Test
    void testNWD(){
        assertEquals(5,Algorithms.NWD(5,5));
        assertEquals(8,Algorithms.NWD(16,8));
        assertEquals(9,Algorithms.NWD(81,18));
        assertEquals(1,Algorithms.NWD(13,3));
    }
    @Test
    void testAbs(){
        assertEquals(5,Algorithms.abs(5));
        assertEquals(6,Algorithms.abs(-6));
        assertEquals(0,Algorithms.abs(0));
        assertEquals(50,Algorithms.abs(-50));
    }
}