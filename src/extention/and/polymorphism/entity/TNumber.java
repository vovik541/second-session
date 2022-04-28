package extention.and.polymorphism.entity;

public abstract class TNumber<T extends Number> {

    protected T number;

    public abstract int findSumOfDigits();

    public abstract int findLastDigit();

    public int findFirstDigit() {
        int tempNum = Math.abs(number.intValue());
        int firstNumeric = 0;

        while (tempNum != 0) {
            firstNumeric = tempNum % 10;
            tempNum /= 10;
        }

        return firstNumeric;
    }

    @Override
    public String toString() {
        return this.number.toString();
    }
}
