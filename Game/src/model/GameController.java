package model;

public class GameController {
	
	public static final int LEVEL=10;
	public static final int PLAYER=20;
	public static final int ENEMY=25;
	public static final int TREASURE=50;
	
	private Player[] players;
	private Level[] levels;
	private Enemy[] enemys;
	private Treasure[] treasures;
	
	
	
	

	public GameController() {
		
		this.players = new Player[PLAYER];
		this.levels = new Level[LEVEL];
		this.enemys = new Enemy[ENEMY];
		this.treasures = new Treasure[TREASURE];
	}





	public boolean registerPlayer(String nickname, String name, int score, int health,int levelGame, double levelPoint, int levels, Enemy enemys,Treasure treasures ) {
		
		Player p1 = new Player(nickname, name, score,health, new Level( levelGame, levelPoint,levels, null, null) );
		for (int i = 0; i < players.length; i++ ) {
			
			if (players[i] == null) {
				players[i] = p1;
				return true;
			}
			
		}
		return false;
	}
	
	
	public String showPlayers() {
		String msg="";
		
		for (int i = 0 ; i < players.length; i++ ) {
			if (players[i] != null) {
				
					msg += "\n" + (i + 1) + " . " + players[i].getNickName() + players[i].getScore() ;
					
					}
				}
			
			return msg;
	}
	
	public boolean registerlevel(int levelGame, double levelPoint, int levell, String name, int score, int position_X, int position_y, int typeenemy,String url, int positionX, int positiony) {
		
		
		Level newlevel = new Level(levelGame,levelPoint,levell, new Enemy(name, score, position_X, position_y, typeenemy ),new Treasure(url, positionX, positiony));
		
		for(int i = 0; i < levels.length ;i++) {
			
			if (levels[i] == null) {
				
				levels[i] = newlevel;
				return true;
			}
			
		}
		return false;
	}
	
	
	public String showLevels(){
		
		String msg = "";
		for(int i = 0; i < levels.length; i++) {
			
			if(levels[i] != null) {
				
				msg += i +"-"+ levels[i].toString();		
				}
			
		}
		
		return msg;
	}
	
	public boolean registerEnemy(String name, int score, int position_X, int position_y, int typeenemy) {
		
		Enemy newEnemy = new Enemy(name, score, position_X, position_y, typeenemy);
		
		for (int i = 0; i<enemys.length;i++) {
			if (enemys[i] == null) {
				enemys[i] = newEnemy;
				return true;
			}
			
		}
		return false;
	}

public String showEnemy(){
		
		String msg = "";
		
		for(int i = 0; i < enemys.length; i++) {
			
			if(enemys[i] != null) {
				
				msg += i +"-"+ enemys[i].toString();		
				}
			
		}
		
		return msg;
	}

	public boolean registerTreasure (String url, int position_X, int position_y) {
		
		Treasure newTreasure = new Treasure(url, position_X,position_y);
		
		for(int i = 0 ; i < treasures.length; i++ ) {
			
			if(treasures[i] == null) {
				treasures[i] = newTreasure;
				return true;
			}
		}
		return false;
	}
	
	public String showTreasures() {
		
		String msg = "";
		for(int i = 0; i < treasures.length; i++) {
			
			if(treasures[i] != null) {
				
				msg += i +"-"+ treasures[i].toString();		
				}
			
		}
		
		return msg;
		
	}
	
}
		
		
	
