package telran.exceptions;

public class RangeExceptions {
	private int min;
	private int max;
	private RangeExceptions(int min,int max) {
		if(max <= min) {
			throw new IllegalArgumentException
			(String.format("max(%d) less or equal min (%d) ",max, min));
		}
		this.min = min ;
		this.max = max ;
	}
	public static RangeExceptions getRangeExceptions(int min ,int max) {
		if(max <= min) {
			throw new IllegalArgumentException
			(String.format("max(%d) less or equal min (%d) ",max, min));
		}
		return new RangeExceptions(min, max);
	}
	public void checkNumber (int number) throws NumberGreaterRangeMaxExceptions, NumberLessrRangeMinExceptions{
		if(number >max) {
			throw new NumberGreaterRangeMaxExceptions(max, number);
		}
		if (number <min) {
			throw new NumberLessrRangeMinExceptions(min, number);
		}
	}
}
