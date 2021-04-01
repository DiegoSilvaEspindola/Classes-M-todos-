package trabalhoModulo4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner saida = new Scanner (System.in);

    Carro car1 = new Carro(2,1001,2020,"gasolina");

    car1.setCor("Vermelho");
    car1.setMarcaModelo("Fiat Strada");
    car1.setMotorLigado(true);
    car1.setPreco(20.000);

    car1.mostraCarro();

    if (car1.motorLigado == true){
        System.out.println("Coloque o cinto de segurança, carro pronto para uso !");
    }else {
        System.out.println("Verifique freio de mão !");
    }

   /* Carro car2 = new Carro(4, 1002, 2015,"Flex");

        System.out.println("Qual a marca e o modelo desejado?");
        car2.marcaModelo = saida.nextLine();
        System.out.println("Qual a melhor faixa de preço?");
        car2.preco = saida.nextDouble();
        System.out.println("Quer motor ligado, pronto para uso ? Escolha true ou false ");
        car2.motorLigado = saida.nextBoolean();
        System.out.println("Digite a cor que deseja");
        car2.cor = saida.nextLine();
       */

    }
}
