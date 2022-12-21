import java.util.Date;
import java.util.Scanner;

public class Umidade {

    public int sensorUmidade;

    Scanner scanner = new Scanner(System.in);

    public void sensorUmidade() {
        int[] vet;
        Date date = new Date();
        int aux = 0;
        vet = new int[5];
        for (int i = 0; i < vet.length; i++) {
            //vet[i] = (int)(Math.random() * 40) +10;
        System.out.printf("Digite a umidade: " + i + ": ");
        vet[i] = (scanner.nextInt());

        }

        /*
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] <= vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
        }
        */

        System.out.println(" -------------------------- UMIDADE --------------------------");
        for (int j = 0; j < vet.length; j++) {
            date = new Date(date.getTime() + 30 * 60 * 1000);
            System.out.printf("Umidade: "+vet[j]+" %%");
            System.out.printf(" - Data/Hora: " + date);
            System.out.println("");
        }
    }
}

