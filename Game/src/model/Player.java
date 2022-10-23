package model;

public class Player {
	private String nickName;
	private String name;
	private int score;
	private int health;
	private Level level;
	public Player(String nickName, String name, int score, int health, Level level) {
		super();
		this.nickName = nickName;
		this.name = name;
		this.score = score;
		this.health = health;
		this.level = level;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Player [nickName=" + nickName + ", name=" + name + ", score=" + score + ", health=" + health
				+ ", level=" + level + "]";
	}
	
	
	

}
