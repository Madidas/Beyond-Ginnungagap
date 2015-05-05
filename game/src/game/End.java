package game;

public class End {
	
	public static void ending() throws Exception{
		
	
	int x = 40; //text speed in milliseconds
	
	System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
	String text1 = "            You see the escape shuttle in front of you and quickly enter it."; 
	for (int i = 0; i < text1.length(); i++) {
	    System.out.print(text1.charAt(i));
	    Thread.sleep(x);
	}
	System.out.println();
	System.out.println();
	Thread.sleep(500); //small pause
	
	String text2 = "         You start randomly hitting different buttons on the control panel and "; 
	for (int i = 0; i < text2.length(); i++) {
	    System.out.print(text2.charAt(i));
	    Thread.sleep(x);
	}
	System.out.println();
	
	String text3 = "           before long a text appears on the screen: “Turn on auto-pilot”."; 
	for (int i = 0; i < text3.length(); i++) {
	    System.out.print(text3.charAt(i));
	    Thread.sleep(x);
	}
	System.out.println();
	System.out.println();
	Thread.sleep(500); //small pause
	
	String text4 = "    You press a green button below the screen and suddenly the shuttle starts moving."; 
	for (int i = 0; i < text4.length(); i++) {
	    System.out.print(text4.charAt(i));
	    Thread.sleep(x);
	}
	System.out.println();
	System.out.println();
	Thread.sleep(500); //small pause
	
	String text5 = "                 As you are taking off Death appears before you again:"; 
	for (int i = 0; i < text5.length(); i++) {
	    System.out.print(text5.charAt(i));
	    Thread.sleep(x);
	}
	System.out.println();
	System.out.println();
	Thread.sleep(500); //small pause
	
	String text6 = "     “You may have gotten off the spaceship, but that doesn’t mean that you’re safe.”"; 
	for (int i = 0; i < text6.length(); i++) {
	    System.out.print(text6.charAt(i));
	    Thread.sleep(x);
	}
	System.out.println();
	System.out.println();
	System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

	}
}
	