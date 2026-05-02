public class Patient implements Treatment {
    String name;
    private static int totalPatients=0;
    private int id;

    public Patient(String name){
        this.name = name;
        totalPatients++;
        this.id = Patient.totalPatients;
    }

    public String getName() {
        return name;
    }

    public static void displayReport() {
        System.out.println("Número de pacientes no hospital: " + Patient.totalPatients);

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            System.out.println("A pausa foi interrompida");
        }
    }

    @Override
    public void applyMedication() {
        System.out.println("Medicamento aplicado ao paciente " + this.name + "\n");

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            System.out.println("A pausa foi interrompida");
        }
    }

    @Override
    public void discharge() {
        System.out.printf("Paciente %s recebeu alta \n", this.name);
        Patient.totalPatients--;

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            System.out.println("A pausa foi interrompida.");
        }
    }
}
