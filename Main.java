import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter currency ISO code to convert: ");
		String ISOcode = userInput.next();
		System.out.println("Convert from " + ISOcode + " to: ");
		String DesiredCurrency = userInput.next();
		String DesiredCurrencyUpper = DesiredCurrency.toUpperCase();
		System.out.println("Enter amount: ");
		double CurrencyToConvert = userInput.nextDouble();
		
		CurrencyConverter CC = new CurrencyConverter();
		
		//Currencies
		double NAD; // Namibia dollar
		double USD; // United States dollar
		double EUR; // Euro
		double JPY; // Japanese yen
		double GBP; // British pound
		
		//Conversions for NAD
		if(ISOcode.equalsIgnoreCase("NAD")){
			switch (DesiredCurrencyUpper) {
			case "USD":
				USD = CurrencyToConvert * 0.067;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + USD);
				break;
			case "EUR":
				EUR = CurrencyToConvert * 0.060;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + EUR);
				break;
			case "JPY":
				JPY = CurrencyToConvert * 8.59;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + JPY);
				break;
			case "GBP":
				GBP = CurrencyToConvert * 0.054;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + GBP);
				break;
			}
				
			} 
		else if(ISOcode.equalsIgnoreCase("USD")) {
			switch (DesiredCurrencyUpper) {
			case "NAD":
				NAD = CurrencyToConvert * 15.92;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + NAD);
				break;
			case "EUR":
				EUR = CurrencyToConvert * 0.95;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + EUR);
				break;
			case "JPY":
				JPY = CurrencyToConvert * 127.94;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + JPY);
				break;
			case "GBP":
				GBP = CurrencyToConvert * 0.80;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + GBP);
				break;
			}
		}
		else if(ISOcode.equalsIgnoreCase("EUR")) {
			switch (DesiredCurrencyUpper) {
			case "NAD":
				NAD = CurrencyToConvert * 16.77 ;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + NAD);
				break;
			case "USD":
				USD = CurrencyToConvert * 1.06;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + USD);
				break;
			case "JPY":
				JPY = CurrencyToConvert * 135.06;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + JPY);
				break;
			case "GBP":
				GBP = CurrencyToConvert * 0.85;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + GBP);
				break;
			}
		}
		else if(ISOcode.equalsIgnoreCase("JPY")) {
			switch (DesiredCurrencyUpper) {
			case "NAD":
				NAD = CurrencyToConvert * 0.12;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + NAD);
				break;
			case "USD":
				USD = CurrencyToConvert * 0.0078;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + USD);
				break;
			case "EUR":
				EUR = CurrencyToConvert * 0.0074;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + EUR);
				break;
			case "GBP":
				GBP = CurrencyToConvert * 0.0063;
				System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + GBP);
				break;
			}
		}
		else if(ISOcode.equalsIgnoreCase("GBP")) {
			{
				switch (DesiredCurrencyUpper) {
				case "NAD":
					NAD = CurrencyToConvert * 19.88;
					System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + NAD);
					break;
				case "USD":
					USD = CurrencyToConvert * 1.25;
					System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + USD);
					break;
				case "EUR":
					EUR = CurrencyToConvert * 1.18;
					System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + EUR);
					break;
				case "JPY":
					JPY = CurrencyToConvert * 159.54;
					System.out.println(ISOcode + " to: " + DesiredCurrencyUpper + " = " + JPY);
					break;
				}
			  }
		   } else {
			   System.out.println("Invalid input!");
			   System.out.println("Try again");
			   CC.main(args);
		   }
		
		System.out.println("Return to landing page Y/N?");
		String LandingPage = userInput.next();
		
		if(LandingPage.equalsIgnoreCase("Y")) {
			CC.main(args);
		}
		else if(LandingPage.equalsIgnoreCase("N")) {
			System.out.println("End of program :)");
		}
		else {
			System.out.println("Invalid input!");
			System.out.println("Try again");
			System.out.println("Return to landing page Y/N?");
			String LandingPage2 = userInput.next();
			
			if(LandingPage.equalsIgnoreCase("Y")) {
				CC.main(args);
			}
			else if(LandingPage.equalsIgnoreCase("N")) {
				System.out.println("End of program :)");
			}
			else {
				System.out.println("Invalid input!");
				System.out.println("Try again");
			}
		}
		}

	}
