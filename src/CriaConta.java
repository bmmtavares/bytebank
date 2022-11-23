
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		//new Conta(); cria objeto na memoria
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("primeira conta tem "+primeiraConta.saldo);
		System.out.println("segunda conta tem "+segundaConta.saldo);
		
		primeiraConta.agencia=146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		//objetos comecam com valor padrao "zerados" na memoria
		
		System.out.println(segundaConta.agencia);
		segundaConta.agencia=146;
		System.out.println("agora a segunda conta esta na agencia "+segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
