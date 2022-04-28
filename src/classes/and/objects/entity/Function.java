package classes.and.objects.entity;

public class Function {
    private final int a;
    private final int b;
    private final int c;

    public Function(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPartOfFunction(int x, int y) {
        return (a * x + b * y + c) == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(a + "x ");

        if (b >= 0) {
            builder.append("+ " + b + "y ");
        } else {
            builder.append(b + "y ");
        }

        if (c >= 0) {
            builder.append("+ " + c + " = 0");
        } else {
            builder.append(c + " = 0");
        }

        return builder.toString();
    }
}
