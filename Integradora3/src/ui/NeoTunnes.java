package ui;

import java.util.Scanner;
import java.time.LocalDate;

import model.Controller;


public class NeoTunnes {
	private Scanner reader;
	private  Controller controller;

	public static void main(String[] args) {
		
		System.out.println( "Welcome to NEOTUNES");
		
		NeoTunnes neotunnes = new NeoTunnes();
		
		int option = 0;

		do {
			option = neotunnes.showMenu();
			neotunnes.executeOperation(option);

		} while (option != 0);

	}
	
	public NeoTunnes() {
		reader = new Scanner(System.in);
		controller = new Controller();
	}
	
	public int showMenu() {
		
		int option = 0;
		
		System.out.println("Please pick an option\n" 
				+ "(1) Create an user \n"
				+ "(2) Select an user \n"				
				+ "(0) To leave the application" 
				+ "\n");
		option = reader.nextInt();
		reader.nextLine();
		
		return option;
		
	}

	public void executeOperation(int operation) {

		switch (operation) {
		case 0:
			System.out.println("Thanks for using our services!");
			break;
		case 1:
			registerUser();
			break;
		case 2: 
			selectUser();
			break;
		

		default:
			System.out.println("Error, type a valid option");

		}

	}
	
	private void selectUser() {
		
		System.out.println("select an usern\n"
				+"[1] Producer\n"
				+"[2] Coustomer\n");
		
		String optionTemp1 = reader.nextLine();
		
		int option2 = Integer.parseInt(optionTemp1);
		
		if (option2 == 1 ) {
			
			//lista de usuarios *Pendiente*
			
			System.out.println("select an option\n"
					+"[1] Store \n"
					+"[2] list of song / podcasts buyed \n"
					+"[3] Create a playlist \n"
					+"[4] Share playlist \n"
					+"[5] Reproduce playlist \n");
			
			String optionTemp = reader.nextLine();
			
			int option = Integer.parseInt(optionTemp);
			
			
			switch(option) {
			case 1:
				buySong();
				break;
			case 2:
				info();
				break;
			case 3:
				createPlaylist();
				break;
			case 4:
				sharePlaylist();
				break;
			case 5:
				reproducePlaylist();
				break;
			
			}
			
		}
		
		else if(option2 == 2 ) {
			
			//lista de usuario *pendiente*
			
		System.out.println("Please pick an option\n"
							+"[1] register song\n"
							+"[2] Register Podcast\n");
		String optionTemp = reader.nextLine();
		
		int option = Integer.parseInt(optionTemp);
		
		switch (option) {
		case 1:
			registerSong();
			break;
		case 2:
			registerPodcast();
			break;
		} 
		
		}else {
			String msg = "Select a valid option ";
			System.out.println(msg);
			
		}
		
		
		
		
	}

	

	/**
	 * muestra info de las canciones registradas, podcasts,tipo de usuario y canciones compradas  
	 */
	private void info() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * registra los podcast
	 */
	private void registerPodcast() {
		
		
		
	}
	 /**
	  * registra las canciones compradas
	  */
	private void buySong() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * simula la reproduccion
	 */
	private void reproducePlaylist() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * da opcion de compartir el playlist
	 */
	private void sharePlaylist() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * crea el playlist 
	 */
	private void createPlaylist() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * registra las canciones
	 */
	private void registerSong() {
		//name, album, duration, solds, urlPicture
		
		
		System.out.println("What is the name");
		String name = reader.nextLine();
		System.out.println("What is the Album");
		String album = reader.nextLine();
		reader.nextLine();
		String duretiontemp = reader.nextLine();
		int duration = Integer.parseInt(duretiontemp);
		System.out.println("Price");
		String pricetemp = reader.nextLine();
		int price = Integer.parseInt(pricetemp);
		System.out.println("paste the url of picture");
		String url = reader.nextLine();
		
		controller.registersong(name, album, duration, price, url);
		
	}
	/**
	 * registra el tipo de usuario
	 */
	private void registerUser() {
		
		System.out.println("What user will be registered\n"
							+"[1] Premium User\n"
							+"[2] Standart User\n"
							+"[3] Artist User\n"
							+"[4] Content Creator User\n");
		
		String optiontemp = reader.nextLine();
		int option = Integer.parseInt(optiontemp);
		
		switch(option) {
		case 1:
			registerPremiumUser();
			break;
		case 2:
			registerStandartUser();
			break;
		case 3:
			registerArtistUser();
			break;
		case 4: 
			registerCCUser();
			break;
		}
		
		
		
	}
	/**
	 * registra el creador de contenido
	 */

	private void registerCCUser() {
		
		System.out.println("What is the NickName?");
		String nickName = reader.nextLine();
		System.out.println("Write the id");
		String id = reader.nextLine();
		
		if (controller.registerCC(nickName, id, null)) {
			
			System.out.println("Registered succesfully");
		} else {
			System.out.println("has an error to register");
		}
	}
	/**
	 * registra el artista
	 */
	private void registerArtistUser() {
		
		System.out.println("What is the NickName?");
		String nickName = reader.nextLine();
		System.out.println("Write the id");
		String id = reader.nextLine();
		
		if (controller.registerArtist(nickName, id, null)) {
			
			System.out.println("Registered succesfuly");
		} else {
			System.out.println("has an error to register");
		}
	}
	/**
	 * registra el usuario standar consumidor
	 */
	private void registerStandartUser() {
		
		System.out.println("What is the NickName?");
		
		String nickName = reader.nextLine();
		
		System.out.println("Write the id");
		
		String id = reader.nextLine();
		
		if (controller.registerStandar(nickName, id, null)) {
			
			System.out.println("Registered succesfuly");
		} else {
			System.out.println("has an error to register");
		}
		
	}
	
	
	/**
	 * registra el usuario premium consumidor
	 */

	private void registerPremiumUser() {
		
		System.out.println("What is the NickName?");
		String nickName = reader.nextLine();
		System.out.println("Write the id");
		String id = reader.nextLine();
		
		if (controller.registerPremiumUser(nickName, id, null)) {
			
			System.out.println("Registered succesfuly");
		} else {
			System.out.println("has an error to register");
		}


		
	}

}


