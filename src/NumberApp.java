// Interface for Number
interface Number {
    double add(double num);
    double subtract(double num);
    double multiply(double num);
    double divide(double num);

    void show();
}

// Derived class for Integer (whole number)
class IntegerNumber implements Number {
    private int value;

    public IntegerNumber(int value) {
        this.value = value;
    }

    @Override
    public double add(double num) {
        return value + num;
    }

    @Override
    public double subtract(double num) {
        return value - num;
    }

    @Override
    public double multiply(double num) {
        return value * num;
    }

    @Override
    public double divide(double num) {
        if (num != 0) {
            return value / num;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }
    }

    @Override
    public void show() {
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("Value: " + value);
    }
}

// Derived class for Real (real number)
class RealNumber implements Number {
    private double value;

    public RealNumber(double value) {
        this.value = value;
    }

    @Override
    public double add(double num) {
        return value + num;
    }

    @Override
    public double subtract(double num) {
        return value - num;
    }

    @Override
    public double multiply(double num) {
        return value * num;
    }

    @Override
    public double divide(double num) {
        if (num != 0) {
            return value / num;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }
    }

    @Override
    public void show() {
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("Value: " + value);
    }
}

public class NumberApp {
    public static void main(String[] args) {
        // Creating objects of the specified entities
        Number[] numbers = new Number[3];
        numbers[0] = new IntegerNumber(5);
        numbers[1] = new RealNumber(3.14);
        numbers[2] = new RealNumber(2.5);

        // Printing the entered array using the Show() method
        for (Number number : numbers) {
            number.show();
        }
    }
}
