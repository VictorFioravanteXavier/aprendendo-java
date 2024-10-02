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
            if (p.idade >= 65) {
                if (p.tempo >= 30) {
                  System.out.println("Pode se aposentar");  
                } else {
                    System.out.println("Não pode se aposemtar por falta de tempo trabalhado ");
                }
            } else {
                System.out.println("Não pode se aposentar por falta de idade");
            }
        } else if (p.sexo.equalsIgnoreCase("F")){
            if (p.idade >= 65) {
                if (p.tempo >= 30) {
                  System.out.println("Pode se aposentar");  
                } else {
                    System.out.println("Não pode se aposemtar por falta de tempo trabalhado ");
                }
            } else {
                System.out.println("Não pode se aposentar por falta de idade");
            }
            System.out.println("Sexo nao reconhecido");
        }
    }
}
