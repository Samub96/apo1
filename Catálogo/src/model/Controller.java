package model;

public class Controller {

  private Species[] collection;

  public Controller() {
    this.collection = new Species[80];

  }




  public String showSpecies(int show) {
    String msg = "";

    for (int i = 0; i < collection.length; i++) {

      if (collection[i] != null) {

        switch (show) {
          case 1:
            msg += "\n" + (i + 1) + ". " + collection[i].getName();
            break;
          case 2:
            if (collection[i] instanceof Fauna) {
              msg += "\n" + (i + 1) + ". " + collection[i].getName();
            }
            break;
          case 3:
            if (collection[i] instanceof Flora) {
              msg += "\n" + (i + 1) + ". " + collection[i].getScientificName();
            }
            break;
          default:
            break;
        }
      }
    }
    if (msg.equals("")) {
      msg = "There are no Species registered yet";
    }

    return msg;
  }
  public boolean registerFlora(String name, String scientificName, boolean hasFlowers, boolean hasFruits, double maxHeigth) {

    Flora newFlora = new Flora(name, scientificName, hasFlowers, hasFruits, maxHeigth);

    for (int i = 0; i < collection.length; i++) {

      if (collection[i] == null) {

        collection[i] = newFlora;
        return true;
      }

    }

    return false;

  }
  public boolean registerFauna(String name, String scientificName, boolean isMigratory, double maxWeigth) {

    Fauna newFauna = new Fauna(name, scientificName, isMigratory, maxWeigth);

    for (int i = 0; i < collection.length; i++) {

      if (collection[i] == null) {

        collection[i] = newFauna;
        return true;
      }

    }

    return false;

  }
  public boolean editFauna(int characteristicEdit, String newEdit, String specieName) {
    switch (characteristicEdit) {
      case 1: // Name
        for (int i = 0; i < collection.length; i++) {
          if (collection[i].getName().equalsIgnoreCase(specieName)) {
            collection[i].setName(newEdit);
            return true;
          }
        }
        break;

      case 2: // Scientific Name
        for (int i = 0; i < collection.length; i++) {
          if (collection[i].getName().equalsIgnoreCase(specieName)) {
            collection[i].setScientificName(newEdit);
            return true;
          }
        }
        break;

      case 3: // Migratory
        if (newEdit.equalsIgnoreCase("yes")) {
          for (int i = 0; i < collection.length; i++) {
            if (collection[i].getName().equalsIgnoreCase(specieName)) {

              if (collection[i] instanceof Fauna) {

                ((Fauna) collection[i]).setIsMigratory(true);

              } else if (newEdit.equalsIgnoreCase("no")) {

                ((Fauna) collection[i]).setIsMigratory(false);

              }
            }

          }
        }
        break;

      case 4: // Weight

        for (int i = 0; i < collection.length; i++) {
          if (collection[i].getName().equalsIgnoreCase(specieName)) {

            if (collection[i] instanceof Fauna) {

              ((Fauna) collection[i]).setMaxWeigth(Double.parseDouble(newEdit));

            }

          }
        }

        break;
    }
    return false;
  }
  public boolean editFlora(int characteristicEdit, String newEdit, String specieName) {
    switch (characteristicEdit) {
      case 1: // Name
        for (int i = 0; i < collection.length; i++) {
          if (collection[i].getName().equalsIgnoreCase(specieName)) {
            collection[i].setName(newEdit);
            return true;
          }
        }
        break;

      case 2: // Scientific Name
        for (int i = 0; i < collection.length; i++) {
          if (collection[i].getName().equalsIgnoreCase(specieName)) {
            collection[i].setScientificName(newEdit);
            return true;
          }
        }
        break;

      case 3: // Flowers
        if (newEdit.equalsIgnoreCase("yes")) {
          for (int i = 0; i < collection.length; i++) {
            if (collection[i].getName().equalsIgnoreCase(specieName)) {

              if (collection[i] instanceof Flora) {

                ((Flora) collection[i]).setHasFlowers(true);

              } else if(newEdit.equalsIgnoreCase("no")) {

                ((Flora) collection[i]).setHasFlowers(false);

              }

            }
          }

        }
        break;

      case 4: // Fruits
        if (newEdit.equalsIgnoreCase("yes")) {
          for (int i = 0; i < collection.length; i++) {
            if (collection[i].getName().equalsIgnoreCase(specieName)) {

              if (collection[i] instanceof Flora) {

                ((Flora) collection[i]).setHasFruits(true);

              } else if(newEdit.equalsIgnoreCase("no")) {

                ((Flora) collection[i]).setHasFruits(false);
              }

            }
          }

        }
        break;

      case 5: // Height

        for (int i = 0; i < collection.length; i++) {
          if (collection[i].getName().equalsIgnoreCase(specieName)) {

            if (collection[i] instanceof Flora) {

              ((Flora) collection[i]).setMaxHeight(Double.parseDouble(newEdit));

            }

          }
        }

        break;
    }
    return false;
  }
  public boolean deleteSpecies(String name){
    for (int i = 0; i < collection.length; i++) {
      if (collection[i] != null){
        if (collection[i].getName().equals(name)){

          collection[i] = null;

          return true;
        }
      }
    } return false;

  }
  public String consultSpecies(String name){

    for (int i = 0; i < collection.length; i++) {
      if (collection[i] != null){
        if (collection[i].getName().equals(name)){

          return collection[i].toString();

        }
      }
    }
    return "Species not found";
  }

}
