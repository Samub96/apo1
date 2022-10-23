package model;



public class Level {
		
		
	private int levelGame;
	private double levelPoint;
	private Treasure treasures;
	private LevelType difilcult;
	private Enemy enemys;
	
	public Level(int levelGame, double levelPoint, int levels, Enemy enemys,Treasure treasures) {
		
		this.levelGame = levelGame;
		this.levelPoint = levelPoint;
		this.enemys = enemys;
		this.treasures = treasures;
		switch(levels) {
		case 1:
			difilcult = LevelType.BAJO;
			break;
		case 2:
			difilcult = LevelType.MEDIO;
			break;
		case 3:
			difilcult = LevelType.ALTO;
			break;
		
		}
		
	}

	public int getLevelGame() {
		return levelGame;
	}

	public void setLevelGame(int levelGame) {
		this.levelGame = levelGame;
	}

	public double getLevelPoint() {
		return levelPoint;
	}

	public void setLevelPoint(double levelPoint) {
		this.levelPoint = levelPoint;
	}
	

	public Enemy getEnemys() {
		return enemys;
	}

	public void setEnemys(Enemy enemys) {
		this.enemys = enemys;
	}

	public Treasure getTreasures() {
		return treasures;
	}

	public void setTreasures(Treasure treasures) {
		this.treasures = treasures;
	}

	public LevelType getDifilcult() {
		return difilcult;
	}

	public void setDifilcult(LevelType difilcult) {
		this.difilcult = difilcult;
	}

	@Override
	public String toString() {
		return "Level [levelGame=" + levelGame + ", levelPoint=" + levelPoint + ", treasures=" + treasures
				+ ", difilcult=" + difilcult + ", enemys=" + enemys + "]";
	}

	
	

	
	
	
	
}
