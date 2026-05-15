package ProjetoContaBancaria;

//A classe é a 'base' para os Objetos
//Sem classe, sem objeto.

public class ContaBancaria {
    //'private' = encapsulamento --> classes externas nao acessam,
    //apenas atraves de metodos.

    private String titular;
    private String numero;
    private String agencia;
    private double saldo;
    private int numeroTransacoes;

    //chamado ao criar um novo objeto 'new ContaBancaria[..]'
    public ContaBancaria(String titular, String numero, String agencia) {
        //'this' ser refere ao proprio objeto, não ao parametro (como String)
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
        this.numeroTransacoes = 0;

    }

    //metodo = ação
    //Um metodo que permite depositos apenas com numeros positivos

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // += ---> saldo = saldo + valor
            System.out.println("Depósito de R$: " + valor + " realizado.");

            numeroTransacoes++;

        } else {
            System.out.println("Valor inválido para depósito.");
        }

    }

    //permite o saque apenas se o saldo for suficiente
    //true (sucesso) or false (saldo insuficiente)

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$: " + valor + " realizado.");

            numeroTransacoes++;

            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    //exibir as informações no console
    public void exibirDados() {
        System.out.println("\n ------- Dados da Conta -------");
        System.out.println("Titular: " + titular);
        System.out.println("Agencia: " + agencia + " Conta: " + numero);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Número total de transações: " + numeroTransacoes);
        System.out.println("------------------------------\n ");
    }

    //Metodos publicos que permitem ver atributos privados
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    //Permite fazer um update em Titular apenas se o novo nome não
    // for nulo nem em branco (preenchido com espaço)
    public void setTitular(String novoNome) {
        if (novoNome != null && !novoNome.isBlank()) {
            titular = novoNome;
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        destino.depositar(valor);
        saldo -= valor;
     //   destino.saldo += valor; --->  não é necessário já que o metodo depositar já faz isso
        System.out.println("Depósito realizado para: " + destino.getTitular());
    }

    public int getNumeroTransacoes() {
        return numeroTransacoes;
    }

}

