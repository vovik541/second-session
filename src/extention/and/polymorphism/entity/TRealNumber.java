package extention.and.polymorphism.entity;

public class TRealNumber extends TNumber<Float> {

    public TRealNumber(Float number) {
        this.number = number;
    }

    @Override
    public int findSumOfDigits() {
        return number.toString()
                .chars()
                .mapToObj(i -> (char) i)
                .filter(x -> x != '.')
                .filter(x -> x != '-')
                .mapToInt(x -> Integer.parseInt(String.valueOf(x)))
                .reduce(0, Integer::sum);
    }

    @Override
    public int findLastDigit() {
        Float tempNumber = Math.abs(number);
        char[] chars = tempNumber.toString().toCharArray();
        return Integer.parseInt(String.valueOf(chars[chars.length - 1]));
    }
}
