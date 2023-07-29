public class Main {
    private static CalculatorView view;

    public static void main(String[] args) {
        // Создаем экземпляр представления для ввода и вывода
        CalculatorView CalculatorView = new CalculatorView();

        // Создаем экземпляр модели данных
        CalculatorModel model = new CalculatorModel();

        // Создаем презентер, передавая ему экземпляры представления и модели данных
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);

        // Запускаем выполнение расчета
        presenter.calculate();
    }
}