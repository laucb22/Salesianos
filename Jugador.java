package liga3;

/**
 * Esta clase contiene todos los atributos que tiene un objeto Jugador, además de sus métodos
 * get y set y su constructor. También contiene métodos para generar aleatoriamente los atributos de la clase.
 */
public class Jugador {
	public String nombre;
	public int dorsal;
	public int goles;
	public int tarjetasRojas;
	public int tarjetasAmarillas;
	
	public Jugador() {
		this.nombre = generarNombre();
		generarDorsal();
		generarGoles();
		this.tarjetasRojas = generarTarjetas();
		this.tarjetasAmarillas = generarTarjetas();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	public int getGoles() {
		return goles;
	}
	
	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}
	
	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	
	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	
	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " | Dorsal: " + dorsal + " | Goles: " + goles +
				" | Tarjetas Rojas: " + tarjetasRojas + " | Tarjetas Amarillas: " +
				tarjetasAmarillas;
	}
	
	/**
	 * Pre: ---
	 * Post: muestra por pantalla los jugadores generados.
	 */
	public void showJugadores() {
		System.out.println("Nombre: " + nombre + " | Dorsal: " + dorsal + " | Goles: " + goles +
				" | Tarjetas Rojas: " + tarjetasRojas + " | Tarjetas Amarillas: " +
				tarjetasAmarillas);
	}
	
	/**
	 * Pre: ---
	 * Post: este método génera de manera aleatoria los nombres de los jugadores. Para ello, utiliza
	 * una tabla de nombres y otra de apellidos, genera un número aleatorio para conseguir el índice
	 * de cada una de ellas y devuelve ambos valores combinados para crear el nombre.
	 */
	public String generarNombre() {
		String[] nombres = {"Sandra", "María", "Sheila", "Marta", "Esther", "Elena", "Lucía", "Celia",
				"Lorena", "Andrea", "Isabel", "Sofía", "Sara", "Nerea", "Alba"};
		String[] apellidos = {"González", "Hernández", "López", "Jiménez", "Giménez", "Bueno", "Rubio",
				"Campos", "Clemente", "Montero"};
		int i = (int)(Math.random()*(14-0+1)+0);
		int j = (int)(Math.random()*(9-0+1)+0);
		return nombres[i] + " " + apellidos[j];
	}
	
	/**
	 * Pre: ---
	 * Post: este método genera un número aleatorio del 0 al 5 y lo devuelve para generar el número
	 * de tarjetas rojas y amarillas.
	 */
	public int generarTarjetas() {
		int tarjetas = (int)(Math.random()*(10-0+1)+0);
		return tarjetas;
	}
	
	/**
	 * Pre: ---
	 * Post: este método genera un número aleatorio del 1 al 30 para crear el número de dorsal de
	 * cada jugador.
	 */
	public void generarDorsal() {
		dorsal = (int)(Math.random()*(30-1+1)+1);
	}
	
	/**
	 * Pre: ---
	 * Post: se genera un número aleatorio del 0 al 10 para crear el número de goles de cada jugador.
	 */
	public void generarGoles() {
		goles = (int)(Math.random()*(30-0+1)+0);
	}
	
	/**
	 * Pre: ---
	 * Post: recibe el número de tarjetas rojas y amarillas de cada jugador y opera con ellas para
	 * obtener el número de expulsiones de cada uno de los jugadores.
	 */
	public int calcularExpulsiones() {
		int expulsiones = 0;
		expulsiones += tarjetasRojas;
		if(tarjetasAmarillas % 2 == 0) {
			expulsiones += (tarjetasAmarillas / 2);
		} else {
			expulsiones += (tarjetasAmarillas - 1) / 2;
		}
		return expulsiones;
	}
}
