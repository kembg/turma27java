package herancaPolimorfismo;

public class cavalo extends serVivo {
	
	public boolean correr;

	public cavalo(String nome, int idade, boolean som, boolean correr) {
		super(nome, idade, som);
		this.correr = correr;
	}

	public boolean isCorrer() {
		return correr;
	}

	/*public void setCorrer(boolean correr) {
		this.correr = correr;
	}*/
	
	public void corra() {
		correr = true;
		System.out.println("Correndo...");
	}
	
	
	public void emitirSom() {
		System.out.println("bolsomito");
	}
}
