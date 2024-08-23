import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner porta = new Scanner (System.in); 

        System.out.println("Informe o número da Agência");
        int NumAgencia = porta.nextInt(); 

        System.out.println("Informe o número da conta");
        int NumConta = porta.nextInt(); 

        System.out.println("Informe o nome do cliente");
        String nomeCliente = porta.next(); 

        System.out.println("Informe o saldo");
        double saldo = porta.nextDouble(); 

        System.out.println("=============================");
        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é,  " + NumAgencia + "e conta " + NumConta + "e seu saldo " + saldo + "já está disponível para saque. "  );
    }
}
