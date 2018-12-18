package by.academy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static by.academy.week1.PhoneNumber.*;
import static junit.framework.TestCase.assertEquals;


/**
 */
public class PhoneNumberTest {

    @Test
    public void shouldAnswerWithTrue() {
        List<Integer> phoneNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        assertEquals("(123)456-7890", getPhoneNumberFirst(phoneNumber));
        assertEquals("(123)456-7890", getPhoneNumberSecond(phoneNumber));
    }
}
