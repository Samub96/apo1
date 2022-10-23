package model;

public class Fauna extends Species {

  private boolean isMigratory;
  private double maxWeigth;

  public Fauna(String name, String scientificName, boolean isMigratory, double maxWeigth){
    super(name, scientificName);
    this.isMigratory = isMigratory;
    this.maxWeigth = maxWeigth;
  }
  public boolean getIsMigratory() {
    return isMigratory;
  }
  public void setIsMigratory(boolean isMigratory){
    this.isMigratory = isMigratory;
  }
  public double getMaxWeigth() {
    return maxWeigth;
  }
  public void setMaxWeigth(double maxWeigth){
    this.maxWeigth = maxWeigth;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Fauna{" +
            "Name=" + super.getName() +
            ", Scientific name=" + super.getScientificName() +
            ", Is Migratory=" + isMigratory +
            ", Max Weigth=" + maxWeigth +
            '}';
  }
}
