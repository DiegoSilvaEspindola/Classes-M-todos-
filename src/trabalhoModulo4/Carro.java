package trabalhoModulo4;



public class Carro {
    private int numPortas ;
    private int numChassi ;
    private int anoFabricacao ;
    private String combustivel;
    String marcaModelo ;
    String cor ;
    double preco ;
    boolean motorLigado;

    public Carro(int numPortas, int numChassi, int anoFabricacao, String combustivel) {
        this.numPortas = numPortas;
        this.numChassi = numChassi;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;

    }


    public void mostraCarro(){
        System.out.println("Seu carro tem " + numPortas + "Portas");
        System.out.println("A numeração do chassi do seu carro é : " + numChassi);
        System.out.println("Seu carro foi fabricado no ano :" + anoFabricacao);
        System.out.println("Seu carro funciona com : " + combustivel);
        System.out.println("Seu carro é um : " + marcaModelo);
        System.out.println("Vem na cor : " + cor);
        System.out.println("O veículo vai custar : " + preco + "Mil reais");
        System.out.println(" Motor funcionando ? " + motorLigado);

    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }
}
