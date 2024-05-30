package curriculum_C;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Greeting {
	 private String helloMessage;
	    private String sushiMessage;
	    private String sushiFact;
	    private String currentDateTime;

	    public Greeting() {
	        this.helloMessage = "こんにちは！ここは日本です！";
	        this.sushiMessage = "この寿司はうまい";
	        this.sushiFact = "寿司は和食です";
	        this.currentDateTime = getCurrentDateTime();
	    }

	    private String getCurrentDateTime() {
	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        return now.format(formatter);
	    }

	    public void printGreetings() {
	        System.out.println(this.helloMessage);
	        System.out.println(this.sushiMessage);
	        System.out.println(this.sushiFact);
	        System.out.println("今の現在日時は" + this.currentDateTime + "です");
	    }
}
