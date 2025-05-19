package curriculum_B;

public class Qes5 {
	   public static void main(String[] args) {
	        for (int base = 1; base <= 9; base++) {
	            for (int multiplier = 1; multiplier <= 20; multiplier++) {
	                int result = base * multiplier;
	                String formattedBase = String.format("%03d", base);
	                String formattedMultiplier = String.format("%03d", multiplier);
	                String formattedResult = String.format("%03d", result);
	                System.out.print(formattedMultiplier + " * " + formattedBase + " = " + formattedResult);

	                if (multiplier < 20) {
	                    System.out.print(" || ");
	                }
	            }

	            
	            System.out.println();
	        }
	    }
	}

