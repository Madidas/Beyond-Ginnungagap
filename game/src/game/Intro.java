package game;

public class Intro {
	
	public void beginning() throws Exception {
		int x = 40; //text speed in milliseconds
		
		System.out.println("  ____                             _    _____ _                                                       ");
		System.out.println(" |  _ )                           | |  / ____(_)                                                      ");
		System.out.println(" | |_) | ___ _   _  ___  _ __   __| | | |  __ _ _ __  _ __  _   _ _ __   __ _  __ _  __ _  __ _ _ __  ");
		System.out.println(" |  _ < ( _ ) | | |/ _ )| '_ ) / _` | | | |_ | | '_ )| '_ )| | | | '_ ) / _` |/ _` |/ _` |/ _` | '_ ) ");
		System.out.println(" | |_) |  __/ |_| | (_) | | | | (_| | | |__| | | | | | | | | |_| | | | | (_| | (_| | (_| | (_| | |_) |");
		System.out.println(" |____/ (___||__, ||___/|_| |_|(__,_|  |_____|_|_| |_|_| |_|(__,_|_| |_||__, ||__,_||__, ||__,_| .__/ ");
		System.out.println("              __/ |                                                      __/ |       __/ |     | |    ");
		System.out.println("             |___/                                                      |___/       |___/      |_|    ");
		System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
		Thread.sleep(1500);
		System.out.println();
		
		String text1 = "             You wake up in a bed to a voice talking to you introducing himself as Death.";
		for (int i = 0; i < text1.length(); i++) {
		    System.out.print(text1.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		

		String text2 = "  Understandably you feel confused. Death apologizes for his sudden appearance and tries to calm you down.";
		for (int i = 0; i < text2.length(); i++) {
		    System.out.print(text2.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		

		String text3 = "Before you can put together a coherent thought he asks: “WHAT IS YOUR NAME?”, to which you answer perplexed:";
		for (int i = 0; i < text3.length(); i++) {
		    System.out.print(text3.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		
		String playerName = InputReader.getPlayerInput();


		String text4 = "                 You ask where you are and why are you there talking to Death.";
		for (int i = 0; i < text4.length(); i++) {
		    System.out.print(text4.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		
	
		String text5 = "        Death answers: “You’re on a spaceship " +playerName+ " and I’m here to collect your soul.”";
		for (int i = 0; i < text5.length(); i++) {
		    System.out.print(text5.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		
	
		String text6 = "That information causes even more confusion. That confusion leads you to asking Death more questions.";
		for (int i = 0; i < text6.length(); i++) {
		    System.out.print(text6.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		

		String text7 = "     Death helpfully points out that your current physical well being will end rather soon.";
		for (int i = 0; i < text7.length(); i++) {
		    System.out.print(text7.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		

		String text8 = "     Spaceship that you are currently traveling is collision course with a nearby planet.";
		for (int i = 0; i < text8.length(); i++) {
		    System.out.print(text8.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		

		String text9 = "                 This little snippet of information causes you to panic.";
		for (int i = 0; i < text9.length(); i++) {
		    System.out.print(text9.charAt(i));
		    Thread.sleep(x);
		}
		System.out.println();
		System.out.println();
		
		WorldCreation.main(null);
		GameController gd = new GameController();
		gd.play();
	}
}
