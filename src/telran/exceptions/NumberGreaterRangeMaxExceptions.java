package telran.exceptions;

@SuppressWarnings("serial")
public class NumberGreaterRangeMaxExceptions extends Exception {
	public NumberGreaterRangeMaxExceptions(int max,int number) {
		super(String.format("Number (%d) greater than range max (%d)",number,max));
	}
}
