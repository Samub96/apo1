package ui;
import model.PokeCollectorController;
import java.util.Scanner;
public class PokeCollectorManager{
	
	public static Scanner sc= new Scanner(System.in);
	public static PokeCollectorController controller = new PokeCollectorController();
	
	public static void main(String[] args){
		boolean exit=false;
		while (!exit){
			System.out.println("what do you wanna do");
			System.out.println("[1] Register pokedex");
			System.out.println("[2] Show pokedex");
			System.out.println("[3] Register pokemon");
			System.out.println("[4] Show pokemons");
			System.out.println("[5] create Team");
			System.out.println("[6] show Team");
			System.out.println("[7] for exit");
			System.out.println("[8] Example");
			int poke = sc.nextInt();
			
			switch (poke){
				
				case 1:	
				registerPokedex();
				break;
				case 2:
				showPokedex();
				break;
				case 3:
				registerPokemon();
				break;
				case 4:
				showPokemon();
				break;
				
				case 5:
				createTeam();
				break;
				
				case 6:
				showTeams();
				break;
				
				case 7:
				exit=true;
				break;
				case 8:
					System.out.println(controller.showpoke());
					break;
				default:
				System.out.println("");
			}
		}
		
	}
	private static void registerPokedex(){
		System.out.println("Where is the Region");
		sc.nextLine();
		String region=sc.nextLine();
		System.out.println("what is the capital");
		String capital=sc.nextLine();
		System.out.println("how many pokemon have");
		
		int pokemonNumber=sc.nextInt();
		System.out.println("how many GYM have");
		
		int gymNumber=sc.nextInt();
		
		if(controller.registerPokedex(region,capital, pokemonNumber, gymNumber)){
		
			System.out.println("Registrado correctamente");
		
		}else{
			System.out.println("No se registro");
			
		}			
	}
		
		public static void showPokedex(){
		System.out.println(controller.showPokedex());
	}
		
		
	
	public static void registerPokemon(){
		sc.nextLine();
		System.out.println(" What is the name of the pokemon");
		String pokemon=sc.nextLine();
		
		System.out.println(" What is the id");
		
		int id=sc.nextInt();
		sc.nextLine();
		
		
		System.out.println(" What is the health of the pokemon");
		int health = sc.nextInt();
		
		System.out.println(" has many type the pokemon?");
		String type=sc.nextLine();
		String type_1="";
		String type_2=null;
		if (type.equals("yes")){
			
		System.out.println(" What is the type 1 of the pokemon");
		type_1=sc.nextLine();
		
		System.out.println(" What is the type 2 of the pokemon");
		type_2=sc.nextLine();
		}else{
			
		System.out.println(" What is the type 1 of the pokemon");
		type_1=sc.nextLine();
		}
		
		System.out.println(" Date of capture");
		System.out.println(" Day");
		int day = sc.nextInt();
		System.out.println(" Month");
		int month = sc.nextInt();
		System.out.println(" year");
		int year = sc.nextInt();
		
		System.out.println(" What is the attack power?");
		String attpower=sc.nextLine();
		
		System.out.println(" What is the defence power?");
		String defpower=sc.nextLine();
		
		System.out.println(" What is the speed?");
		double speed=sc.nextDouble();
		System.out.println(" Type of pokemon");
		System.out.println(" [1] Water ");
		System.out.println(" [2] Fire ");
		System.out.println(" [3] Grass ");
		System.out.println(" [4] Dark ");
		System.out.println(" [5] Normal ");
		int pokeType= sc.nextInt();
		if(controller.registerPokemon( pokemon,id, type_1, type_2, health, attpower,defpower, speed,day,month,year,pokeType)){
		
			System.out.println("Registrado correctamente");
		
		}else{
			System.out.println("No se registro");
			
		}			
		
		
		
	}
	public static void showPokemon(){
		
		System.out.println(controller.showPokemon());
	}
	
	public static void createTeam(){
		System.out.println(" What is the name of the team?");
		String team=sc.nextLine();
		System.out.println(" when was created the team?");
		System.out.println(" Day");
		int day=sc.nextInt();
		System.out.println(" Month");
		int month=sc.nextInt();
		System.out.println(" Year");
		int year=sc.nextInt();
		System.out.println(" Which pokemon do you want add?");
		sc.nextLine();
		String poketeam=sc.nextLine();
		if(controller.registerTeam(team, day, month, year)){
		
			System.out.println("Registrado correctamente");
		
		}else{
			System.out.println("No se registro");
			
		}			
	}
	
	public static void showTeams(){
		
		System.out.println(controller.showTeams());
	}

}