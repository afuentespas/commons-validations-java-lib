package afuentes.validations.commonsvalidations.utils;

public class NumberUtils {
	
	private NumberUtils() {}

	public static int parseStringToInteger(String number) {
		int intNumber = 0;
		intNumber = Integer.parseInt(number);
		return intNumber;
	}
	
}
