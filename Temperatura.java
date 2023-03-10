import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Temperatura {

        //declaração do nome das classes.
        public int sensorTemperatura;

        Scanner scanner = new Scanner(System.in);

        //ABERTURA DA CLASSE
        public void sensorTemperatura() {
            int[] vet; //DECLARAÇÃO DO TIPO DE VETOR, NO CASO INTEIRO E O NOME QUE ELA VAI TER, NO CASO É VET.
            Random r = new Random();//DECLARAÇÃO DO METÓDO ALEATORIO, E O NOME QUE ELA VAI TER, NO CASO É R.
            Date date = new Date();// DECLARAÇÃO METODO DE DATA, E O NOME QUE ELA VAI TER, NO CASO É DATE
            int aux = 0; //VARIÁVEL QUE VAI SER USADA NO ALGORITMO DE ORDENAÇÃO, E O NOME QUE ELA VAI TER QUE NO CASO É AUX
            vet = new int[5];//DEFINIÇÃO DO TAMANHO DO VETOR, QUE É 16
            //ALGORITMO DE NUMEROS ALEATORIOS
            //vet.legth -> vet é o nome que deu para a variável do vetor, e legth é o tamanho definido no vetor.
            for (int i = 0; i < vet.length; i++) {//REPETIÇÃO E LEITURA DE CADA LINHA DETERMINADA NO VETOR
                // vet[i] = r.nextInt(70);//GERAÇÃO E INCLUSAO DE UM NUMERO ALEATORIO EM CADA UMA DAS LINHAS.
                System.out.printf("Insira temperatura " + i + " : ");
                vet[i] = (scanner.nextInt());


            }
            //ALGORITMO DE ORDENAÇÃO
            for (int i = 0; i <= vet.length; i++) {//LEITURA DE LINHAS DETERMINADAS NO VETOR
                for (int j = 0; j < vet.length - 1; j++)//VERIFICAÇÃO DO NUMERO EM CADA LINHA
                    if (vet[j] >= vet[j + 1]) {//CONDIÇÃO PARA COMEÇAR A ORDENAÇÃO
                        aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;
                    }
            }
            //IMPRESSAO NA TELA
            System.out.println(" -------------------------- TEMPERATURA --------------------------");
            for (int j = 0; j < vet.length; j++) {//ALGORITMO PARA REPETIR AS FUNÇÕES DENTRO DO LAÇO
                date = new Date(date.getTime() + 30 * 60 * 1000); // METODO PARA GERAR A DATA ATUAL SOMANDO MEIA HORA NA DATA ATUAL QUE É 30*60*1000.
                System.out.printf("Temperatura: " + vet[j] + "°C");//PUXANDO OS NUMÉROS JÁ ORDENADOS NO ALGORITMO DE ORDENAÇÃO
                System.out.printf(" - Data/Hora: " + date);//PUXANDO A VARIÁVEL DATA, QUE JÁ ESTÁ SOMANDO MEIA EM MEIA HORA.
                System.out.println("");
            }
        }
    }
