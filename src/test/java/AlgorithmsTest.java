import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

}