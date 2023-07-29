public class CalculatorModel {
    private double result;

    public void add(double firstNumber, double secondNumber) {
        result = firstNumber + secondNumber;
    }

    public void subtract(double firstNumber, double secondNumber) {
        result = firstNumber - secondNumber;
    }

    public void divide(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            result = firstNumber / secondNumber;
        } else {
            // Обработка деления на ноль
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    public void multiply(double firstNumber, double secondNumber) {
        result = firstNumber * secondNumber;
    }

    public double getResult() {
        return result;
    }

    public double performOperation(double firstNumber, double secondNumber, char operation) {

        return firstNumber;
    }
}

