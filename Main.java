package Aula06;

public class Main {
    public static void main(String[] args) {

        try {
            SerieProxy serie1 = new SerieProxy();
            System.out.println(serie1.getSerie("euphoria"));

            System.out.println(serie1.getSerie("friends"));

            System.out.println(serie1.getSerie("community"));

            System.out.println(serie1.getSerie("theoffice"));

            System.out.println(serie1.getSerie("thewalkingdead"));

            System.out.println(serie1.getSerie("sabrina"));

        } catch (SerieNaoHabilitadaException e ) {
            System.out.println("Erro: " + e);
        }

    }
}
