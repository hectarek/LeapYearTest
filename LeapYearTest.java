import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void whenYearIsDivisibleBy4() {
        LeapYear leapyear = new LeapYear();
        assertEquals(true, leapyear.isLeapYear(1996));
        assertEquals(true, leapyear.isLeapYear(1984));
        assertEquals(false, leapyear.isLeapYear(2001));
        assertEquals(false, leapyear.isLeapYear(1994));
    }

    @Test 
    public void whenYearIsDivisibleBy400CannotBeDivisibleBy100(){
        LeapYear leapyear = new LeapYear();
        assertEquals(true, leapyear.isLeapYear(2000));
        assertEquals(true, leapyear.isLeapYear(1600));  
        assertEquals(false, leapyear.isLeapYear(1900));  
        assertEquals(false, leapyear.isLeapYear(1700));  
    }

    
}