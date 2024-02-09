interface Conta{
	void deposita(double quantia) ;
}

classe ContaCorrente implements Conta{
	double saldo;
	void deposita(double quantia) {
		saldo += quantia;}
	void saca(double quantia) {
		saldo -= quantia;}
	}