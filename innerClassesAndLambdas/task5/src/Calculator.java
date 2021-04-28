public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= (d1, d2) -> d1+d2;
            break;
            case "-": res= (d1, d2) ->d1-d2;
            break;
            case "*": res= (d1, d2) -> d1*d2;
            break;
            case "/": res=(d1, d2) -> d2==0 ? Double.POSITIVE_INFINITY:d1/d2;
            break;
            default: res=(d1, d2) -> Double.MIN_VALUE; /* TODO */
//In the default value, the res function should return the minimun possible value.
        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
        DoMath calc = toOperation(op);
        return calc.compute(n1, n2);
    }
}
