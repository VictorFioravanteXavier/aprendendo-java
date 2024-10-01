import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("AAA", 98, "m", 35);
        Pessoa p2 = new Pessoa("AAA2", 38, "f",10);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2); 

        //percorrer uma array
        for (int i = 0; i < pessoas.size(); i++) {
            Aposentadoria.verificar(pessoas.get(i));
        }
    }
}


class Pessoa {
    public int idade;
    public String nome;
    public String sexo;
    public int tempo;

    public Pessoa(String nome, int idade, String sexo, int tempo){
        this.idade = idade;
        this.sexo = sexo;
        this.tempo = tempo;
        this.nome = nome;
    }

    
}

/**
 * Aposentadoria
 */
class Aposentadoria {
    public static void verificar(Pessoa p){
        if (p.sexo.equalsIgnoreCase("M")) {
            if (p.idade >= 65 && p.tempo >=30) {
                System.out.println("Pode se aposentar");
            } else {
                if (p.idade <= 65 && p.tempo <= 30) {
                    System.out.println("Você não podera se aposentar pela sua idade e tempo trabalhado faltam "+ (65 - p.idade) + "anos e " + (30 - p.tempo) + " de tempo trabalhado");
                } else if (p.idade <= 65) {
                    System.out.println("Você não podera se aposentar pela sua idade faltam "+ (65 - p.idade) + " anos");
                } else if (p.tempo <= 30) {
                    System.out.println("Você não podera se aposentar pela seu tempo trabalhado faltam "+ (30 - p.tempo) + " de tempo trabalhado");
                }
            }
        } else if (p.sexo.equalsIgnoreCase("F")){
            if (p.idade >= 60 && p.tempo >=25) {
                if (p.idade >= 60 && p.tempo >=25) {
                System.out.println("Pode se aposentar");
            } else {
                if (p.idade <= 60 && p.tempo <= 25) {
                    System.out.println("Você não podera se aposentar pela sua idade e tempo trabalhado faltam "+ (60 - p.idade) + "anos e " + (25 - p.tempo) + " de tempo trabalhado");
                } else if (p.idade <= 60) {
                    System.out.println("Você não podera se aposentar pela sua idade faltam "+ (60 - p.idade) + " anos");
                } else if (p.tempo <= 25) {
                    System.out.println("Você não podera se aposentar pela seu tempo trabalhado faltam "+ (25 - p.tempo) + " de tempo trabalhado");
                }
            }
            }
        } else {
            System.out.println("Sexo nao reconhecido");
        }
    }
}
