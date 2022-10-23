package model;
public class Pokemon{
	private String name;
	private int id;
	private String type_1;
	private String type_2;
	private int health;
	private String attpower;
	private String dfpower;
	private double speed;
	private Date capture;
	private Types pokemontype;
	
	public Pokemon(String name, int id, String type_1, String type_2, int health, String attpower, String defpower,
			double speed, Date capture, int type) {
		super();
		this.name = name;
		this.id = id;
		this.type_1 = type_1;
		this.type_2 = type_2;
		this.health = health;
		this.attpower = attpower;
		this.dfpower = defpower;
		this.speed = speed;
		this.capture = capture;
		switch(type) {
		case 1: 
			pokemontype = Types.WATER;
			break;
		case 2:
			pokemontype = Types.FIRE;
			break;
		case 3:
			pokemontype = Types.GRASS;
			break;
		case 4:
			pokemontype = Types.DARK;
			break;
		case 5: 
			pokemontype = Types.NORMAL;
			break;
		}
	}


	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getType_1() {
		return type_1;
	}



	public void setType_1(String type_1) {
		this.type_1 = type_1;
	}



	public String getType_2() {
		return type_2;
	}



	public void setType_2(String type_2) {
		this.type_2 = type_2;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public String getAttpower() {
		return attpower;
	}



	public void setAttpower(String attpower) {
		this.attpower = attpower;
	}



	public String getDfpower() {
		return dfpower;
	}



	public void setDfpower(String dfpower) {
		this.dfpower = dfpower;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public Date getCapture() {
		return capture;
	}



	public void setCapture(Date capture) {
		this.capture = capture;
	}



	public String toString(){
		return "\nPokemon info :"
		+"\nName: "+ this.name
		+"\nID: "+ this.id
		+"\ntype: "+ this.type_1 +" - "+this.type_2
		+"\nHealth: "+ this.health
		+"\nAttack power: "+this.attpower
		+"\nDefense power: "+this.dfpower
		+"\nSpeed: "+this.speed
		+"\nDate of captured"+this.capture + pokemontype;
	}
}