package genericutility;

import java.time.LocalDateTime;
import java.util.Random;


public class JavaUtility {
	/**
	 * This method will give the current data and time  
	 * @return String
	 */
	
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method will Generated and return random number within 1000 
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran = new Random();
		return ran.nextInt(1000);
	}

}
