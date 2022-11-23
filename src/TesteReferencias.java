
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta: "+primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //variavel segunda conta aponta pra mesma referencia da primeira conta
		
		System.out.println("saldo da segunda conta: "+segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: "+segundaConta.saldo);
		
		System.out.println("saldo da primeira conta: "+segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("sao a mesmissima conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}