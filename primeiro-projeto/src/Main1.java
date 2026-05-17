public class Main1 {
    public static void main(String[] args) {
        Sapo sapo = new Sapo(9, 145, 2, 1000);
        Macaco macaco = new Macaco(4444, 734, 7, 10000);
        Aguia aguia = new Aguia(32, 442, 57, 10000);
        Vegetal alface = new Vegetal(3);
        Formiga formiga = new Formiga(1, 7, 9, 100);
        Aranha aranha = new Aranha(3, 86, 2, 100, 18);

        formiga.info();
        formiga.atacar(sapo, 29);
        formiga.mover(8, 33);
        macaco.comer(alface.getMassa());
        formiga.info();
        aguia.info();
        aguia.atacar(formiga, 22);
        aguia.info();
        aranha.info();
        aranha.atacar(sapo, 0);
        aranha.info();

        System.out.println("---------- Informações restantes ---------------");
        sapo.info();
        macaco.info();
    }
}
