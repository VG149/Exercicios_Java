classs Produto extends
	public int codigo;
	public String nome;
	public int quantidade;
	public double preco;
	public Produto(int c, String n, int q, doublr p) {
		codigo = c;
		nome = n;
		quantidade = q;
		preco = p;
	 }
}

class TestaProd {
	public static void main(String a[]) {
		String s = "     ";
		Produto produto;
		produto = new Produto(10, "Sabonete", 12, 1.20);
		System.out.println(produto.codigo + s + produto.nome) ;
		produto.quantidade = 100;
		System.out.println(produto.quantidade + s + produto.preco);
		produto.preco *= 1.10;
		System.out.println(produto.quantidade + s + produto.preco) ;
	}
}