package model;

public class Move {
	
	private String nameM;
	private String typeM;
	private double baseValue;
	private double percentAccuary;
	private double maxValue;
	public Move(String nameM, String typeM, double baseValue, double percentAccuary,double maxValue) {
		super();
		this.nameM = nameM;
		this.typeM = typeM;
		this.baseValue = baseValue;
		this.percentAccuary = percentAccuary;
		this.maxValue = maxValue;
	}
	public String getNameM() {
		return nameM;
	}
	public void setNameM(String nameM) {
		this.nameM = nameM;
	}
	public String getTypeM() {
		return typeM;
	}
	public void setTypeM(String typeM) {
		this.typeM = typeM;
	}
	public double getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}
	public double getPercentAccuary() {
		return percentAccuary;
	}
	public void setPercentAccuary(double percentAccuary) {
		this.percentAccuary = percentAccuary;
	}
	
	
	public double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}
	
	
	public boolean calculateMaxVale(String type1,String type2) {
		if(typeM.equals(type1)||typeM.equals(type2)){
			
				maxValue = baseValue+(baseValue*0.5);
		
		}
		return false;
	}
	@Override
	public String toString() {
		return "Move [nameM=" + nameM + ", typeM=" + typeM + ", baseValue=" + baseValue + ", percentAccuary="
				+ percentAccuary + maxValue + "]";
	}
	

}
