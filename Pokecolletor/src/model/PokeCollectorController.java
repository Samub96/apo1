package model;
public class PokeCollectorController{
		
	private Team[] teams;
	private Pokedex[] pokedexes;
	private Pokemon[] pokemons;
	private Move[] moves;
	
	
	public PokeCollectorController(){
		this.teams=new Team[5];
		this.pokedexes= new Pokedex[3]; // {null,null,null}
		this.pokemons = new Pokemon[1000];
		this.moves = new Move[50];
		tescase();
	}
	public void tescase() {
		Pokemon poke = new Pokemon("pikachu",01,"water","fire",200,"impactrueno","escudo",200,new Date(12,24,2022),2);
		pokemons[1] = poke;
	}
	
	public String showpoke() {
		
	String msg = "";
	
	msg += pokemons[1].toString();
	
	return msg;
	}
		
	
	public boolean registerPokedex(String region,String capital, int pokemonNumber, int gymNumber){
		
		
		Pokedex pokedex = new Pokedex(region, pokemonNumber, gymNumber, capital, pokemons);
		
		for(int i = 0; i<pokedexes.length;i++){
			
			if(pokedexes[i] == null){
			
				pokedexes[i] = pokedex;
				return true;
			}
			
			
		}
		
		return false;
	}
	
	public String showPokedex(){
		
		String showpk="";
		
		for (int i = 0; i < pokedexes.length;i++){
			if (pokedexes!= null){
				
				showpk += pokedexes[i].toString();
			}
			
		}
		return showpk;
	}
	
	
	public boolean registerPokemon(String pokemones,int id, String type_1,String type_2, int health, String attpower, String defpower, double speed,int day, int month, int year , int type){
	
		
		Pokemon pokemon = new Pokemon(pokemones, id,type_1,type_2,health,attpower,defpower,speed,new Date(day, month,year),type);
		
		for(int i = 0; i<pokemons.length;i++){  //Profe, sinceramente no se por que no me compila 
			
			if(pokemons[i] == null){
			
				pokemons[i] = pokemon;
				return true;
			}
			
			
		}
		
		return false;
	}
	public String showPokemon(){
		String showpokemon="";
		for (int i=0; i<pokemons.length;i++){
			if (pokemons!= null){
				
				showpokemon += i+"-"+pokemons[i].toString();
			}
			
		}
		return showpokemon;
	}
	
	public boolean registerTeam(String name, int day, int month, int year) {

		Team newTeam = new Team(name, new Date(day, month, year));

		for (int i = 0; i < teams.length; i++) {

			if (teams[i] == null) {

				teams[i] = newTeam;
				return true;
			}

		}

		return false;

	}

	public String showTeams() {

		String team = "";

		for (int i = 0; i < teams.length; i++) {

			if (teams[i] != null) {

				team +=i+"-"+ teams[i].toString();
			}

		}
		return team;

	}
	
	public boolean registerMove(String nameM, String typeM, double baseValue, double percentAccuary,double maxValue) {
		
		Move newMove = new Move(nameM,typeM, baseValue, percentAccuary, maxValue);
		for (int i = 0; i < moves.length; i++) {

			if (moves[i] == null) {

				moves[i] = newMove;
				
				return true;
			}

		}

		return false;

	}
		
}