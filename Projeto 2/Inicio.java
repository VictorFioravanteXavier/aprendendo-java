import java.util.ArrayList;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto1", 10.99);
        Produto p2 = new Produto("Produto2", 12.99);
        Produto p3 = new Produto("Produto3", 14.99);
        Produto p4 = new Produto("Produto4", 16.99);
        Produto p5 = new Produto("Produto5", 18.99);
        Produto p6 = new Produto("Produto6", 20.99);
        Produto p7 = new Produto("Produto7", 22.99);
        Produto p8 = new Produto("Produto8", 24.99);
        Produto p9 = new Produto("Produto9", 26.99);
        Produto p10 = new Produto("Produto10", 28.99);

        
        Carrinho c1 = new Carrinho();
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p3);
        c1.addProduto(p4);

        c1.notaFiscal();

        c1.pagar(100);
    }
}

class Produto{
    public String nome;
    public double valor;

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }
}

class Carrinho{
    private  List<Produto> produtos = new ArrayList<Produto>(); 
    private double valor;

    public void addProduto(Produto p){
        this.produtos.add(p);
        this.valor += p.valor;
    }

    public void notaFiscal(){
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Nome: "+ produtos.get(i).nome + " Valor: " + produtos.get(i).valor);
        }
        System.out.println("Valor Total da Compra:" + this.valor);
    }

    public void pagar(double valor){
        if (valor >= this.valor) {
            System.out.println("Troco: R$"+(valor-this.valor));
        } else {
            System.out.println("Valor insuficiente faltam: R$"+(this.valor-valor));
        }
    }
}