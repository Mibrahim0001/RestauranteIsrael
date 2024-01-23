package israel;
/**
 * La clase RestauranteIsrael gestiona los comensales 
 * del restaurante Israel y el srock de su almacén.
 * 
 * @author Muhammad Ibarhim
 * @version 1.0
 */

public class RestauranteIsrael {
	
	/**
	 * Representa la cantidad de patatas
	 */
	public int patatas;
	
	/**
	 * Representa la cantidad de calamares
	 */
	public int calamares;
	private static RestauranteIsrael miRestaurante;
	
	/**
	 * Constructor de la clase RestauranteIsrael con dos parametros de entrada
	 * @param a Representa la cantidad de patatas iniciales
	 * @param b Representa la cantidad de calameres iniciales
	 */
	public RestauranteIsrael(int a, int b) {
		this.setPatatas(a);
		this.setCalamares(b);
	}
	
	// Metodo por el que se calcula el numero de comensales en funcion del stock de patatas
	private int cantP() {
		int a = this.getPatatas() * 3;
		return a;
	}
	
	// Metodo por el que se calcula el numero de comensales en funcion del stock de calamares
	private int cantC() {
		int ch = this.getCalamares() * 6;
		return ch;
	}
	
	/**
	 * Metodo por el que se añade una cantidad de calamares al stock del restaurantes.
	 * @param c Representa la cantidad de calamares que se quiere añadir al stock.
	 */
	public void addCalamares(int c) {
		this.setCalamares(this.getCalamares() + c);
	}
	
	/**
	 * Metodo por el que se añade una cantidad de patatas al stock del restaurantes.
	 * @param d Representa la cantidad de patatas que se quiere añadir al stock.
	 */
	public void addPatatas(int d) {
		this.setPatatas(this.getPatatas() + d);
	}
	
	/**
	 * @hidden
	 */
	public static void main(String[] args) {
		miRestaurante = new RestauranteIsrael(50, 60);
		System.out.println("Cantidad de calamares: " + miRestaurante.getCalamares());
		System.out.println("Cantidad de patatas: " + miRestaurante.getPatatas());
		calculaComensales(miRestaurante);
		miRestaurante.addCalamares(1);
		miRestaurante.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(miRestaurante.getPatatas() + " patatas.\n" + miRestaurante.getCalamares() + " calamares");
		calculaComensales(miRestaurante);
	}
	
	/* Metodo por el que se calcula la cantidad de clientes a los que se puede dar de comer 
	 * En el restaurante Israel en funcion del stock de productos
	 */
	private static void calculaComensales(RestauranteIsrael r1) {
		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
		}
	}
	
	/**
	 * @hidden
	 */
	public int getPatatas() {
		return patatas;
	}

	/**
	 * @hidden
	 */
	public void setPatatas(int patatas) {
		this.patatas = patatas;
	}

	/**
	 * @hidden
	 */
	public int getCalamares() {
		return calamares;
	}

	/**
	 * @hidden
	 */
	public void setCalamares(int calamares) {
		this.calamares = calamares;
	}
}