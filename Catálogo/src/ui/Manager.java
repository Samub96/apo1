package ui;

import java.util.Scanner;

import model.Controller;

public class Manager {

  private Scanner sc;
  private Controller controller;

  public Manager() {
    this.sc = new Scanner(System.in);
    this.controller = new Controller();
  }

  public void menu() {
    System.out.println("Welcome to Icesi Species");

    boolean exit = false;

    while(!exit){

      System.out.println("""
              \n1. Show Species
              2. Register Fauna
              3. Register Flora
              4. Consult Specie
              5. Edit Fauna
              6. Edit Flora
              7. Delete Specie
              Selection: \s""");
      int option = sc.nextInt();

      switch(option) {
        case 1:

          System.out.print("""
                  \n1. Show all species
                  2. Show all fauna species
                  3. Show all flora species
                  Selection:\s""");

          int show = sc.nextInt();

          System.out.println(controller.showSpecies(show));

          break;

        case 2:

          registerFauna();
          break;

        case 3:

          registerFlora();
          break;

        case 4:

          consultSpecies();
          break;

        case 5:

          editFauna();
          break;

        case 6:

          editFlora();
          break;

        case 7:

          deleteSpecie();
          break;

        default:

          exit = true;
          break;
      }

    }

  }

  public static void main(String[] args) {
    Manager m = new Manager();
    m.menu();
  }

  private void registerFauna() {
    System.out.println("Type the Name of the specie");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.println("Type the Scientific Name of the specie");
    String scientificName = sc.nextLine();
    System.out.println("Type the if the species is migratory or not \n Type True if Yes or False if Not");
    boolean isMigratory = sc.nextBoolean();
    System.out.println("Type the Max Weigth of the specie");
    double maxWeigth = sc.nextDouble();

    if(controller.registerFauna(name, scientificName, isMigratory, maxWeigth)) {

      System.out.println("Fauna successfully registered");

    } else {
      System.out.println("Could not create Fauna");
    }

  }

  private void registerFlora() {
    System.out.println("Type the Name of the specie");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.println("Type the Scientific Name of the specie");
    String scientificName = sc.nextLine();
    System.out.println("Type the if the species has Flowers \n Type True if Yes or False if Not");
    boolean hasFlowers = sc.nextBoolean();
    System.out.println("Type the if the species has Fruits \n Type True if Yes or False if Not");
    boolean hasFruits = sc.nextBoolean();
    System.out.println("Type the Max Heigth of the specie");
    double maxHeigth = sc.nextDouble();

    if(controller.registerFlora(name, scientificName, hasFlowers, hasFruits, maxHeigth)) {

      System.out.println("Flora successfully registered");

    } else {
      System.out.println("Could not create Flora");
    }

  }

  private void editFauna() {

    System.out.print("""
                  \nType the number according to the characteristic you want to edit:
                  1. Name
                  2. Scientific Name
                  3. Is it migratory or not (Type yes or not)
                  4. Max Weigth
                  Selection:\s""");
    int characteristicEdit = sc.nextInt();

    System.out.println("Type the new information of the characteristic");
    sc.nextLine();
    String newEdit = sc.nextLine();

    System.out.println("Type the Name the name of the species you want to edit");
    String specieName = sc.nextLine();

    if(controller.editFauna(characteristicEdit, newEdit, specieName)) {

      System.out.println("Characteristic of the Fauna successfully edited");

    } else {
      System.out.println("Could not edit Fauna");
    }


  }

  private void editFlora() {

    System.out.print("""
                  \nType the number according to the characteristic you want to edit:
                  1. Name
                  2. Scientific Name
                  3. Does it have Flowers or not (Type yes or not)
                  4. Does it have Fruits or not (Type yes or not)
                  5. Max Weigth
                  Selection:\s""");
    int characteristicEdit = sc.nextInt();

    System.out.println("Type the new information of the characteristic");
    sc.nextLine();
    String newEdit = sc.nextLine();

    System.out.println("Type the Name the name of the species you want to edit");
    String specieName = sc.nextLine();

    if(controller.editFlora(characteristicEdit, newEdit, specieName)) {

      System.out.println("Characteristic of the Fauna successfully edited");

    } else {
      System.out.println("Could not edit Fauna");
    }

  }

  private void consultSpecies() {

    System.out.println("Type the name of the species you want to consult");
    sc.nextLine();
    String name = sc.nextLine();

    System.out.println(controller.consultSpecies(name));


  }

  private void deleteSpecie() {

    System.out.println("Type the name of the species you want to consult");
    sc.nextLine();
    String name = sc.nextLine();

    if(controller.deleteSpecies(name)) {

      System.out.println("Species successfully delete");

    } else {
      System.out.println("Failed to delete species");
    }

  }

}
