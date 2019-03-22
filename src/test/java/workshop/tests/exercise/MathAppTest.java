package workshop.tests.exercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import workshop.tests.exercise.service.MathService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {
    @Mock
    MathService mathService;

    @InjectMocks
    MathApp mathApp;

    @Test
    public void multipy() {
        when(mathService.multiply(10,20)).thenReturn((double) 2);
        assertEquals(2,mathApp.multiply(10,20));
    }

    @Test
    public void divides() {
        when(mathService.divides(20,10)).thenReturn( 2);
        assertEquals(2,mathApp.divides(20,10));
    }


}