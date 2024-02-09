public abstract class Funcionarios {
 
    private int salario;

    public int getSalario(){
		return salario;
    }
	
	public void setSalario(int salario) {
		this.salario = salario;
		System.out.println("Salario: "+this.salario);
	}
}
