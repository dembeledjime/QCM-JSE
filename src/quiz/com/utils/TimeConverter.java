package quiz.com.utils;

public class TimeConverter {
	 public static int toSeconds(long timeInMilliSeconds) {
		return (int) (timeInMilliSeconds / 1000);
	}
}
