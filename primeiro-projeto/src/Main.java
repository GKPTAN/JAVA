import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* LocalDate dataCompra = LocalDate.now();
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
        System.out.println("Diferença em dias: " + diferencaDias + " dias"); */

        Scanner scanner = new Scanner(System.in);

        int count=0;
        int option = 0;
        int sair = 1;
        ArrayList<Patient> patients = new ArrayList<>();

        String menu = """
                \n--------- HOSPITAL ---------
                1 — Cadastrar pacientes
                2 — Exibir relatório
                3 — Pacientes cadastrados
                4 — Sair do sistema
                ----------------------------
                """;
        while(option != 4) {
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option) {
                case 1:
                    System.out.println("Quantos Pacientes você quer cadastrar? ");
                    count = scanner.nextInt();
                    scanner.nextLine();
                    for(int i = 0; i < count; i++) {
                        System.out.printf("Nome do paciente %d: ", (i + 1));
                        patients.add(new Patient(scanner.nextLine()));
                    }
                    break;
                case 2:
                    Patient.displayReport();
                    break;
                case 3:
                    sair = 1;
                    while (sair != 0) {
                        int escolha;
                        System.out.println("--------------------- Pacientes cadastrados ---------------------");
                        for(int i = 0; i < patients.size(); i++) {
                            System.out.println((i + 1) + " — " + patients.get(i).getName());
                        }
                        System.out.println("Digite o número do paciente para mais opções ou 0 para voltar: ");
                        escolha = scanner.nextInt();
                        scanner.nextLine();
                        if (escolha == 0) {
                            sair = 0;
                        } else if (escolha > 0 && escolha <= patients.size()) {
                            Patient selectedPatient = patients.get(escolha - 1);
                            System.out.println("\nO que você quer fazer com " + selectedPatient.getName() + "?");
                            System.out.println("1 — Aplicar medicamento no paciente");
                            System.out.println("2 — Dar alta no paciente");
                            System.out.println("3 — Voltar");
                            int acao = scanner.nextInt();
                            scanner.nextLine();
                            switch (acao) {
                                case 1:
                                    selectedPatient.applyMedication();
                                    break;
                                case 2:
                                    selectedPatient.discharge();
                                    patients.remove(selectedPatient);
                                    break;
                                case 3:
                                    System.out.println("Voltando...");
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                                    break;
                            }

                        } else {
                            System.out.println("Opção inválida");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println(" ");
                    break;
            }
        }
    }
}