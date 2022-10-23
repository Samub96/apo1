package model;
public class Team{
	private String name;
	private Date creationDate;
	private Pokemon[] pokemonList;
	
	public Team(String name, Date creationDate ) {
		
		this.name = name;
		this.creationDate = creationDate;
		this.pokemonList = new Pokemon[5]; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public boolean addPokemon(Pokemon newPokemon){
		
			for(int i=0; i<pokemonList.length;i++){
			
			if(pokemonList[i]==null){
				
				pokemonList[i] = newPokemon;
				return true;
				
			}
		
	    }
	    
		return false;
	}
	

	public String toString(){
		return "\nTeams info:"
		+"\nName "+ this.name
		+"\nCreacion date "+ this.creationDate;
	}
}