import java.util.Arrays;
import java.util.Scanner;

public class ConversorDeTemperatura implements ConversorTemperatura {
    private double temperaturaEmCelsius;
    private double temperaturaEmFahrenheit;

    public double getTemperaturaEmCelsius() {
        return temperaturaEmCelsius;
    }

    public void setTemperaturaEmCelsius(double temperaturaEmCelsius) {
        this.temperaturaEmCelsius = temperaturaEmCelsius;
    }

    public double getTemperaturaEmFahrenheit() {
        return temperaturaEmFahrenheit;
    }

    public void setTemperaturaEmFahrenheit(double temperaturaEmFahrenheit) {
        this.temperaturaEmFahrenheit = temperaturaEmFahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit(double valor) {
        return (valor * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double valor) {
        return (valor - 32) / 1.8;
    }
}
