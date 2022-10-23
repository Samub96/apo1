package ui;
import model.GameController;
import java.util.Scanner;
public class GameManager {
	
	static Scanner sc= new Scanner(System.in);
	static GameController game = new GameController();
	
	public static void main(String[] args) {
		System.out.println("Welcome to Treasure Game ");
		boolean exit=false;
		
		while (!exit) {
			System.out.println("what do you wanna register ");
			System.out.println("[1]Register player ");
			System.out.println("[2]Register level ");
			System.out.println("[3]Register treasure ");
			System.out.println("[4]Register enemy ");
			System.out.println("[5]Estadistics ");
			System.out.println("[6]Exit ");
			int register= sc.nextInt();
			switch (register) {
			case 1:
				registerPlayer();
				break;
			case 2:
				registerLevel();
				break;
			case 3:
				registerTreasure();
				break;
			case 4:
				registerEnemy();
				break;
			case 5: 
				 System.out.println("[1] Player");
				 System.out.println("[2] Level");
				 System.out.println("[3] Enemy");
				 System.out.println("[4] Treasure");
				 int stadistic = sc.nextInt();
				 
				 switch(stadistic) {
				 case 1:
					 game.showPlayers();
					 break;
				 case 2:
					 game.showLevels();
					 break;
				 case 3:
					 game.showEnemy();
					 break;
				 case 4: 
					 game.showTreasures();
					 break;
					 
				 }
				break;
			case 6:
				exit=true;
				break;
				
			}
			
			
			
		}
		
		

	}
	public static void registerPlayer(){
		System.out.println(" What is your nickname? ");
		String nickname = sc.nextLine();
		sc.nextLine();
		System.out.println(" What is your name? ");
		String name = sc.nextLine();
		System.out.println(" you will start with 10 points, and 5 point of life , is necessary level up ");	
		int level = 1;
		int score =10;
		int health = 5;
		
		
		 
		 if (game.registerPlayer(nickname,name, score,health, level,score,1, null, null)) {
			 System.out.println("");
			 System.out.println("Registrado correctamente");
			 System.out.println("");
		 } else {
			 System.out.println("");
			 System.out.println("no se registro");
			 System.out.println("");
		 }
		 
	}
	
	public static void registerLevel(){
		System.out.println("Number of level");
		int level = sc.nextInt();
		System.out.println("score necessary tu level up");
		double levelPoint = sc.nextDouble();
		System.out.println("select difilcuty");
		System.out.println("[1] bajo");
		System.out.println("[2] medio");
		System.out.println("[3] alto");
		int difilculty = sc.nextInt();
		
		System.out.println("choose enemy ");
		System.out.println("[1] Jorge the ogro + 200 points");
		System.out.println("[2] Mike the abstract + 600 points");
		System.out.println("[3] Boddy the boss +1.000 points");
		System.out.println("[4] Jean the magic+ 300 points");
		int enemy = sc.nextInt();
		String name ="";
		int score = 0;
		int type = 0;
		switch(enemy) {
		
		case 1:
			 name= "Jorge";  score = 200; type = 1;
			break;
		case 2 :
			name= "Mike"; score = 600; type = 2;
			break;
		case 3:
			 name= "Boddy"; score = 1000; type = 3;
			break;
		case 4 :
			 name= "Jorge"; score = 300; type = 4;
			break;
		}
		System.out.println("Position ");
		int positionX = (int)Math.random()*10+1;
		int positiony = (int)Math.random()*10+1;
		System.out.println("PositionENEMY = " + positionX + positiony );
		System.out.println(" ");
		System.out.println("Generate treasure ");
		String url = "jjdkajkfewjkÑWKEWHFEKWÑCNDSJKÑ";
		int positionxX = (int)Math.random()*10+1;
		int positionyy = (int)Math.random()*10+1;
		System.out.println("Position Treasure = " + positionxX + positionyy );
		
		if(game.registerlevel(level, levelPoint, difilculty, name, score, positionX, positiony, type, url, positionxX, positionyy)) {
			
			System.out.println("");
			 System.out.println("Registrado correctamente");
			 System.out.println("");
		 } else {
			 System.out.println("");
			 System.out.println("no se registro");
			 System.out.println("");
		 }
	}
	
	public static void registerTreasure() {
		System.out.println("Copy and paste the Url of the treasure");
		String url = sc.nextLine();
		System.out.println("where is the position x");
		int positionx=sc.nextInt();
		System.out.println("where is the position y");
		int positiony=sc.nextInt();
		
		if (game.registerTreasure(url, positionx, positiony)) {
			System.out.println("");
			 System.out.println("Registrado correctamente");
			 System.out.println("");
		 } else {
			 System.out.println("");
			 System.out.println("no se registro");
			 System.out.println("");
		 }
		}
	public static void registerEnemy() {
		sc.nextLine();
		System.out.println(" What is the enemy name? ");
		String name= sc.nextLine();
		System.out.println(" What is the type ");
		System.out.println("[1] ogro");
		System.out.println("[2] abstract");
		System.out.println("[3] boss");
		System.out.println("[4] magic");
		sc.nextInt();
		int type = sc.nextInt();
		System.out.println(" What is the enemy score? ");
		int score = sc.nextInt();
		System.out.println("where is the position x");
		int positionx=sc.nextInt();
		System.out.println("where is the position y");
		int positiony=sc.nextInt();
		
		if (game.registerEnemy(name, score, positionx, positiony, type)) {
			System.out.println("");
			 System.out.println("Registrado correctamente");
			 System.out.println("");
		 } else {
			 System.out.println("");
			 System.out.println("no se registro");
			 System.out.println("");
		 }
		}
		
}
		

	


