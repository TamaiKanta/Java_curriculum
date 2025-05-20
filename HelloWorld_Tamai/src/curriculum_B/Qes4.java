 package curriculum_B;

public class Qes4{
    public static void main(String[] args) {
        
        for (int base = 1; base <= 9; base++) {
           
            for (int multiplier = 1; multiplier <= 9; multiplier++) {
                
                System.out.printf("%02d * %02d = %02d", base, multiplier, (base * multiplier));

                if (multiplier < 9) {
                    System.out.print(" || ");
                }
            }

            System.out.println();
        }
    }
}
