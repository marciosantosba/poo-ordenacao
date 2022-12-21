public class Painel {
    public static void main(String[] args) {
        // Criei para treinar.
        // Criei uma variável chamada texto do tipo ClasseMensagem
        // new ClasseMensagem é um método criado para poder chamar a outra classe.
        ClasseMensagem texto = new ClasseMensagem();
        // vou chamar a variável texto com o método exibeMensagem.
        texto.exibeMensagem();


        //AQUI SERÁ PUXADA A INFORMAÇÃO DO OUTRO ARQUIVO, É COMO UMA PONTE PARA ACESSAR AS CLASSES
        // Sensores é para acessar o arquivo ande está as classes
        // temperatura é nome que criei para esse método.
        // new Sensores() é a criação no novo sensor dentro desse arquivo.
        // agora temperatura pode acessar o outro arquivo Sensores
        // então eu uso o temperatura. sensorTemperatura, que é a classe que criei no Sensores.java

        //Sensores temperatura = new Sensores();
        //temperatura.sensorTemperatura();

        Temperatura temperatura = new Temperatura();
        temperatura.sensorTemperatura();

        Umidade umidade = new Umidade();
        umidade.sensorUmidade();

        GasCarbonico CO2 = new GasCarbonico();
        CO2.sensorCarbonico();
    }
}

