import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true Java Currency Formatter
	
	/**
	 * Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method 
	 * to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

				US: formattedPayment
				India: formattedPayment
				China: formattedPayment
				France: formattedPayment
	 */
	
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
            String us, india, china, france;
        
        us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
		
	}

}
