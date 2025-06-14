import java.text.NumberFormat;
import java.util.Locale;

public class ConversorDeMoeda implements ConversaoFinanceira {
    NumberFormat formatoBR  = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private String real;

    public String getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = formatoBR.format(real);
    }

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar / 5.56;
    }
}
