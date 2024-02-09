    class Programa {    
        public static void main(String[] args) {
	class Retangulo {
		int largura;
        int comprimento;
		int perimetro;
		int area;
		
        // ..
    }
            Retangulo testeRetangulo; 
            testeRetangulo = new Retangulo();

            testeRetangulo.largura = 10;
			testeRetangulo.comprimento = 12;
			testeRetangulo.perimetro = 2 * (testeRetangulo.largura + testeRetangulo.comprimento);
			testeRetangulo.area = testeRetangulo.largura * testeRetangulo.comprimento;
			
			System.out.println("largura: " + testeRetangulo.largura);
			System.out.println("comprimento: " + testeRetangulo.comprimento);
			System.out.println("perimetro: " + testeRetangulo.perimetro);
			System.out.println("perimetro: " + testeRetangulo.area);
            
        }
    }
