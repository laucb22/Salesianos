package liga3;

import liga3.Jugador;

/**
 * Esta clase contiene cada uno de los atributos de Equipo, así como su constructor, los métodos
 * get y set, y otros métodos a los que llama para generar aleatoriamente los valores de sus
 * atributos.
 */
public class Equipo {
	public String nombre;
	public String estadio;
	public int fundacion;
	public Jugador[] jugadores = new Jugador[11];
	public int partidosGanados;
	public int partidosPerdidos;
	public int partidosEmpatados;
	public int puntos;
	
	public Equipo() {
		this.nombre = generarNombreEquipo();
		this.estadio = generarNombreEstadio();
		generarFundacion();
		generarJugadores();
		this.partidosGanados = generarPartidos();
		this.partidosPerdidos = generarPartidos();
		this.partidosEmpatados = generarPartidos();
		this.puntos = calcularPuntos(partidosGanados, partidosPerdidos);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEstadio() {
		return estadio;
	}
	
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	
	public int getFundacion() {
		return fundacion;
	}
	
	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}
	
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public int getPartidosGanados() {
		return partidosGanados;
	}
	
	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	
	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}
	
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
	
	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " | Estadio: " + estadio + " | Fundación: " + fundacion +
				" | Jugadores: " + jugadores + " | Partidos ganados: " +
				partidosGanados + " | Partidos perdidos: " + partidosPerdidos + " | Partidos empatados: " +
				partidosEmpatados + " | Puntos: " + puntos;
	}
	
	/**
	 * Pre: ---
	 * Post: genera aleatoriamente el nombre de cada Equipo mediante una tabla que contiene diferentes
	 * nombres. Genera el índice de la tabla aleatoriamente y devuelve el nombre que se corresponde con este.
	 */
	public String generarNombreEquipo() {
		String[] nombres = {"Pokémon", "Digimon", "Winx", "Witch", "BTS", "Alien", "Final Fantasy", "AOA", 
				"Totally Spies", "One Piece", "Berserk", "Enigma", "Starcraft", "Diablo", "Deep Blue Sea", 
				"Ju-On", "Hereditary", "Shiba Inu", "Hello Kitty", "Kuromi", "Detective Conan", 
				"Sailor Moon", "Fushigi Yugi", "Wedding Peach", "Inuyasha", "Bobobo"};
		int i = (int)(Math.random()*(25-0+1)+0);
		return nombres[i];
	}
	
	/**
	 * Pre: ---
	 * Post: genera el nombre de cada estadio. Para ello, utiliza una tabla con diferentes nombres
	 * y genera el índice de la misma de manera aleatoria. Por último, devuelve el elemento que
	 * contiene ese índice como nombre del estadio.
	 */
	public String generarNombreEstadio() {
		String[] nombres = {"Kanto", "Kalos", "Johto", "Sinnoh", "Hoenn", "Teselia", "Unova", "Alola", 
				"Galar", "Paldea"};
		int i = (int)(Math.random()*(9-0+1)+0);
		return nombres[i];
	}
	
	/**
	 * Pre: ---
	 * Post: genera aleatoriamente el año de fundación de cada equipo, entre los años 1990 y 2015.
	 */
	public void generarFundacion() {
		fundacion = (int)(Math.random()*(2015-1990+1)+1990);
	}
	
	/**
	 * Pre: ---
	 * Post: genera aleatoriamente un número del 0 al 5 y lo devuelve para crear el número de
	 * partidos ganados, perdidos y empatados de cada equipo.
	 */
	public int generarPartidos() {
		int partidos = (int)(Math.random()*(5-0+1)+0);
		return partidos;
	}
	
	/**
	 * Pre: ---
	 * Post: recibe por parámetro el valor de los partidos ganados y perdidos de cada equipo y
	 * calcula los puntos de los equipos a partir de ellos. Para ello, suma los partidos empatados
	 * y los ganados multiplicados por 3, y devuelve el resultado.
	 */
	public int calcularPuntos(int partidosGanados, int partidosPerdidos) {
		puntos += (partidosGanados * 3) + partidosEmpatados;
		return puntos;
	}
	
	/**
	 * Pre: ---
	 * Post: llama a la clase Jugador y genera los 11 jugadores de cada Equipo en un array.
	 */
	public void generarJugadores() {
		for(int i = 0; i < 11; i++) {
			jugadores[i] = new Jugador();
		}
	}
}
