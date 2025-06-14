import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);
        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);
        if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("Hoje é a data de pagamento");
        } else if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("A data de pagamento já passou");
        } else {
            System.out.println("A data de pagamento não é hoje");
        }

        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra no formato brasileiro: " + dataCompra.format(formatoBR));
        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data Conclusão compra: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusão compra em Nova York: " + dataCompraNy);
        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");
        LocalDate dataPagamento = LocalDate.parse("2025-07-30");
        //Period periodo = Period.between(dataCompra, dataPagamento);
        long diferencaDias = ChronoUnit.DAYS.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + diferencaDias + " dias");
    }
}