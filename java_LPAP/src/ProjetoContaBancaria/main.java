package ProjetoContaBancaria;


// --------------- Classe Main -------------------------------------
// ------Criando Objetos e utilizando a class 'ContaBancaria'-------

public class main {
    public static void main(String[] args) {
        
     //conta1 e conta2 são objetos idependentes, ou seja, cada um
     //tem seus próprios atributos (users !=)
     ContaBancaria conta1 = new ContaBancaria("Ana Silva", "12345-6",
             "0001");
     ContaBancaria conta2 = new ContaBancaria("Bruno Souza", "98765-4",
             "0001");
     
     // REEALIZANDO DEPOSITOS 'depositar()'
        conta1.depositar(1500.00);
        conta1.depositar(500.00);
        
        //teste de saques
        conta1.sacar(300.00); //sucesso
        conta1.sacar(1000000.00);
        
        conta2.depositar(800.00);
        conta2.sacar(200.00);
        
        // ENCAPSULAMENTO
        
        //Com Getter - maneira correta
        double meuSaldo = conta1.getSaldo();
        System.out.println("Saldo atual: R$ " + meuSaldo);
        
        //Direto - erro (não compila): consta1.saldo = -999;
        //O Encapsulamento IMPEDE alterações DIRETAS e inválidas
        
        //Exibir os dados
        conta1.exibirDados();
        conta2.exibirDados();
        
        //Update com setter
        // Vai validar antes de aceitar 
        conta1.setTitular("Ana Lima"); //vai atualizar o nome
        conta1.setTitular(""); //vai ser ignorado

        //------- Desafio Extra
        conta1.transferir(conta2, 500.00);

        conta1.exibirDados();
        conta2.exibirDados();

        //DOS EXTRAS: FALTAM 'LIMITE DIARIO' E 'CONTA POUPANÇA'
        //Aula do dia 14/05/2026
    }
}
