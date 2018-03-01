package labs;

public class RemoteControlLoop {
	  static String button; 
	  public static void main(String[] args) {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);

	    
	    
	    while (true) {
		    	System.out.println("To begin, please turn the remote on.");
		    	button = scanner.next();
	    		if (button.equals("ON")) {
	    			break;
	    		}
	    		else {
	    			continue;
	    		}
	    }

	    while (true) {
		    	System.out.print("Enter a button to press: ");
		    	button = scanner.next();
		    switch (button) {
		      case "0": case "1": case "2":
		      case "3": case "4": case "5":
		      case "6": case "7": case "8": case "9":
		        pressButton();
		        break;
		      case "ON":
		        System.out.println("Uhhh.. it's already on.");;
		        break;
		      case "OFF":
		        turnOff();
		        scanner.close();
		        return;
		      default:
		        error();
		        break;
		    }
	    }
	  }

	  public static void turnOn() {
	    System.out.println("TURNING ON...");
	  }

	  private static void turnOff() {
	    System.out.println("TURNING OFF...");
	  }

	  public static void pressButton() {
	    System.out.println("BOOP!");
	  }

	  public static void error() {
	    System.out.println("Command not recognized.");
	  }
	}
