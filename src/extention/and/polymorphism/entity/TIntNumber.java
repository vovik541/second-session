package extention.and.polymorphism.entity;

public class TIntNumber extends TNumber<Integer> {

    public TIntNumber(int number) {
        this.number = number;
    }

    public int findSumOfDigits() {
        int tempNum = Math.abs(number);
        int sum = 0;

        while (tempNum != 0) {
            sum += tempNum % 10;
            tempNum /= 10;
        }

        return sum;
    }

    @Override
    public int findLastDigit() {
        return number % 10;
    }
}
