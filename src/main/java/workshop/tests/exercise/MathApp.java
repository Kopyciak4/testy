package workshop.tests.exercise;

import workshop.tests.exercise.service.MathService;

public class MathApp {
    private MathService mathService;


    public int multiply(int a, int b){
        return (int)mathService.multiply(a, b);
    }

    public int divides(int a, int b) {
        return (int)mathService.divides(a, b);
    }
}
