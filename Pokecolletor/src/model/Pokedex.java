package model;
public class Pokedex{
	private String region;
	private int pokemonNumber;
	private int gymNumber;
	private String capitalCity;
	private Pokemon[] pokemons;
	
	
	public Pokedex(String region, int pokemonNumber, int gymNumber, String capitalCity, Pokemon[] pokemons) {
		super();
		this.region = region;
		this.pokemonNumber = pokemonNumber;
		this.gymNumber = gymNumber;
		this.capitalCity = capitalCity;
		this.pokemons = pokemons;
		this.pokemons = new Pokemon[pokemonNumber];
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public int getPokemonNumber() {
		return pokemonNumber;
	}


	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}


	public int getGymNumber() {
		return gymNumber;
	}


	public void setGymNumber(int gymNumber) {
		this.gymNumber = gymNumber;
	}


	public String getCapitalCity() {
		return capitalCity;
	}


	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}


	public Pokemon[] getPokemons() {
		return pokemons;
	}


	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}

	public boolean addPokemon(Pokemon newPokemon) {
		
		for (int i = 0; i < pokemons.length;i++) {
			
			if (pokemons[i] == null) {
				
				pokemons[i] = newPokemon;
				
				return true;
			}
		}
		return false;
	}

	public String toString(){
		return "\nPokedex info:"
		+"\nRegion: "+ this.region
		+"\nPokemon number: "+ this.pokemonNumber
		+"\nGym number: "+ this.gymNumber
		+"\nCapital City: "+ this.capitalCity;
	}
	
}
