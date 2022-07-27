# Desafio POO
## _Modulo 1 - Abstração de Bootcamp usando POO_


O objetivo principal é colocar em prática umas das principais ferramentas da OO: *ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO*, através de um projeto Java.

- ABSTRAÇÃO
- ENCAPSULAMENTO
- HERANÇA
- POLIMORFISMO

## ABSTRAÇÃO
Esse é o primeiro conceito que quero abordar, pois ele é em si o conceito de criação das classes e objetos. Esse conceito nos orienta a construir códigos que sejam relacionados com objetos da nossa vida real. 
Classes são os modelos ou moldes nos quais surgirão os objetos. As classes definem algumas propriedades e métodos que deverão fazer parte do objeto que derivar dela ou então, como dizemos, os objetos que serão instanciados a partir dela.
### _Exemplo_
```sh
public class Conta {
    int numero;
    double saldo;
    double limite;
    void depositar(double valor){
        this.saldo += valor;
    }
    void sacar(double valor){
        this.saldo -= valor;
    }
    void imprimeExtrato(){
        System.out.println("Saldo: "+this.saldo);
    }
}
```
## ENCAPSULAMENTO
Esse é um conceito simples de aplicar, pois é simplesmente para mantermos as propriedades protegidas de acessos diretamente, produzindo dessa forma efeitos não desejados nas nossas classes. 
É a técnica utilizada para esconder uma ideia, ou seja, não expôr detalhes internos para o usuário, tornando partes do sistema mais independentes possível. Por exemplo, quando um controle remoto estraga apenas é trocado ou consertado o controle e não a televisão inteira. Nesse exemplo do controle remoto, acontece a forma clássica de encapsulamento, pois quando o usuário muda de canal não se sabe que programação acontece entre a televisão e o controle para efetuar tal ação.
### _Exemplo_
```sh
public class Funcionario {
    private double salario;
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}
```

## HERANÇA
Na Programação Orientada a Objetos o significado de herança tem o mesmo significado para o mundo real. Assim como um filho pode herdar alguma característica do pai, na Orientação a Objetos é permitido que uma classe herde atributos e métodos da outra, tendo apenas uma restrição para a herança. Os modificadores de acessos das classes, métodos e atributos só podem estar com visibilidade public e protected para que sejam herdados.

Uma das grandes vantagens de usar o recurso da herança é na reutilização do código. Esse reaproveitamento pode ser acionado quando se identifica que o atributo ou método de uma classe será igual para as outras. Para efetuar uma herança de uma classe é utilizada a palavra reservada chamada extends.
```sh
public class Funcionario {
    private String nome;
    private double salario;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calculaBonificacao(){
        return this.salario * 0.1;
    }
}
```
#POLIMORFISMO
Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação, assinatura, mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse. O overload não é um tipo de polimorfismo, pois com overload a assinatura do método obrigatoriamente tem que ter argumentos diferentes, requisito que fere o conceito de Polimorfismo citado acima.
De forma genérica, polimorfismo significa várias formas. No caso da Orientação a Objetos, polimorfismo denota uma situação na qual um objeto pode se comportar de maneiras diferentes ao receber uma mensagem, dependendo do seu tipo de criação.
EXEMPLO:
```sh
abstract class Mamífero {
  public abstract double obterCotaDiariaDeLeite();
}
class Elefante extends Mamífero {
  public double obterCotaDiariaDeLeite(){
    return 20.0;
  }
}
class Rato extends Mamifero {
  public double obterCotaDiariaDeLeite() {
    return 0.5;
  }
}
class Aplicativo {
  public static void main(String args[]){
    System.out.println("Polimorfismo\n");
    Mamifero mamifero1 = new Elefante();
    System.out.println("Cota diaria de leite do elefante: " + mamifero1.obterCotaDiariaDeLeite());
    Mamifero mamifero2 = new Rato();
    System.out.println("Cota diaria de leite do rato: " + mamifero2.obterCotaDiariaDeLeite());
  }
}
```

