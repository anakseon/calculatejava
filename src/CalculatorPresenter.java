public class CalculatorPresenter extends Presenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void calculate() {
        double firstNumber = view.getFirstNumber();
        double secondNumber = view.getSecondNumber();
        char operation = view.getOperation();

        double result = model.performOperation(firstNumber, secondNumber, operation);

        view.showResult(result);
    }
}