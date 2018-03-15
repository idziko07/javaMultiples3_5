package pl.euler.wielokrotnosc3_5;


public class Euler {

    public int calculate(int number){

        int sum = 0;
        for (int i = 1; i < number; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
