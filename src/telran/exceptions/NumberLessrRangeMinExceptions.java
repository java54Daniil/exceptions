package telran.exceptions;

@SuppressWarnings("serial")
public class NumberLessrRangeMinExceptions extends Exception {
	public NumberLessrRangeMinExceptions(int min,int number) {
		super(String.format("Number (%d) greater than range max (%d)",number,min));
	}
}
