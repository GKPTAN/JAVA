import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatoHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        System.out.print("Digite o horário de entrada (HH:mm): ");
        String entrada = scanner.nextLine();
        System.out.print("Digite o horário de saída previsto (HH:mm): ");
        String saida = scanner.nextLine();
        System.out.print("Digite o horário que o funcionário saiu (HH:mm): ");
        String saidaImprevista = scanner.nextLine();
        LocalTime entradaHora = LocalTime.parse(entrada, formato);
        LocalTime saidaHora = LocalTime.parse(saida, formato);
        LocalTime saidaImprevistaHora = LocalTime.parse(saidaImprevista, formato);
        Duration saldoDeHoras;
        System.out.println("Horário de entrada: " + entradaHora.format(formato));
        System.out.println("Horário de saída previsto: " + saidaHora.format(formato));
        System.out.println("Horário real de saída: " + saidaImprevistaHora.format(formato));
        if (saidaImprevistaHora.isBefore(saidaHora)) {
            saldoDeHoras = Duration.between(saidaImprevistaHora, saidaHora);
            System.out.println("Saldo de horas: -" + saldoDeHoras.toHours() + ":" + saldoDeHoras.toMinutesPart());
        } else if (saidaImprevistaHora.isAfter(saidaHora)) {
            saldoDeHoras = Duration.between(saidaHora, saidaImprevistaHora);
            System.out.println("Saldo de horas: +" + saldoDeHoras.toHours() + ":" + saldoDeHoras.toMinutesPart());
        } else {
            saldoDeHoras = Duration.ofHours(0);
            System.out.println("Saldo de horas: " + saldoDeHoras.toHours() + ":" + saldoDeHoras.toMinutesPart());
        }
    }
}
