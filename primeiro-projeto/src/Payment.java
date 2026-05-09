import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.lang.Thread;
import java.lang.InterruptedException;

abstract class Payment {
    private double value;
    final String data;

    public Payment() {
        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.data = dataAtual.format(formatoBR);
    }

    NumberFormat formatBr = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public double getValue() {
        return value;
    }

    public String getData() {
        return data;
    }

    public void setValue(double value) {
        this.value = value;
    }

    abstract void processPayment();

    public void displayReceipt() {
        String value = formatBr.format(this.value);
        System.out.printf("""
                --------- Recibo ---------
                data: %s — valor: %s
                
                """, this.data, value);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Pausa interrompida");
        }
    }
}
