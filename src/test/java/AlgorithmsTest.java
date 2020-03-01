import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmsTest {

    @Test
    void shouldReturnTrueIfWordIsPalindromUpperCase(){
        //given
        String w = "kajak";
        //when
        boolean palindrom = Algorithms.isPalindrom(w);
        //then
        Assertions.assertEquals(true, palindrom);
    }

    @Test
    void shouldReturnTrueIfWordIsPalindrom(){
        //given
        String w = "Kajak";
        //when
        boolean palindrom = Algorithms.isPalindrom(w);
        //then
        Assertions.assertEquals(true, palindrom);
    }

    @Test
    void shouldReturnFalseIfWordIsNotPalindrom() {
        //given
        String w = "xyz";
        //when
        boolean palindrom = Algorithms.isPalindrom(w);
        //then
        Assertions.assertEquals(false, palindrom);
    }

    @Test
    void testNWD(){
        assertEquals(5,Algorithms.NWD(5,5));
        assertEquals(8,Algorithms.NWD(16,8));
        assertEquals(9,Algorithms.NWD(81,18));
        assertEquals(1,Algorithms.NWD(13,3));
    }
    @Test
    void testabs(){
        assertEquals(5,Algorithms.abs(5));
        assertEquals(6,Algorithms.abs(-6));
        assertEquals(0,Algorithms.abs(0));
        assertEquals(50,Algorithms.abs(-50));
    }
}