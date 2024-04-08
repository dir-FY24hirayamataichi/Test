package calc;

import javax.naming.spi.DirStateFactory.Result;

public class CalculatorService {
    private Calculator calculator;
    
    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }
    
    public String addAndReport(int a, int b) {
        int result = calculator.add(a, b);
        return "Result: " + result;
    }
    
    public String subtractAndReport(int a, int b) {
        int result = calculator.subtract(a, b);
        return "Result: " + result;
    }
}
