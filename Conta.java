class Correntista extends Cliente
implements Depositante, Comprador{ 
	Investidor investidor;
	Conta  conta;
	void deposita(double quantia) {
		conta.deposita(quantia);
	}
	void compra(Acao acao){
		investidor.compra(acao);
	}
  }