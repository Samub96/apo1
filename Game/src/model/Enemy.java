package model;

public class Enemy {
	private String name;
	private int score;
	private int position_X;
	private int position_y;
	private TypeEnemy type;
	
	public Enemy(String name, int score, int position_X, int position_y, int typeenemy) {
		
		this.name = name;
		this.score = score;
		this.position_X = position_X;
		this.position_y = position_y;
		
		switch(typeenemy) {
		
		case 1:
			type = TypeEnemy.OGROS;
			break;
		case 2:
			type = TypeEnemy.ABSTRACTOS;
			break;
		case 3: 
			type = TypeEnemy.JEFES;
			break;
		case 4:
			type = TypeEnemy.MAGICOS;
			break;
			
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPosition_X() {
		return position_X;
	}
	public void setPosition_X(int position_X) {
		this.position_X = position_X;
	}
	public int getPosition_y() {
		return position_y;
	}
	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}
	@Override
	public String toString() {
		return "Enemy [name=" + name + ", score=" + score + ", position_X=" + position_X + ", position_y=" + position_y
				+ ", type=" + type + "]";
	}
	
	
	
	
	
}
