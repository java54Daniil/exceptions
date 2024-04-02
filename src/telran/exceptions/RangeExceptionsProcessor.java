package telran.exceptions;

public class RangeExceptionsProcessor {
	private RangeExceptions rangeExceptions;
	private int counterGreaterMax; //How many numbers have been greater than max range
	private int counterLesMin; //How many numbers have been less than min range
	private int counterRange; // //How many numbers have into  range
	public RangeExceptionsProcessor (RangeExceptions rangeExceptions) {
		this.rangeExceptions = rangeExceptions;
	}
	public void numberProcessor(int number) {
		try {
			rangeExceptions.checkNumber(number);
			counterRange++;
		} catch (NumberGreaterRangeMaxExceptions e) {
			counterGreaterMax++;
			
		} catch (NumberLessrRangeMinExceptions e) {
			counterLesMin++;
			
		}
	}
	public RangeExceptions getRangeExceptions() {
		return rangeExceptions;
	}
	public int getCounterGreaterMax() {
		return counterGreaterMax;
	}
	public int getCounterLesMin() {
		return counterLesMin;
	}
	public int getCounterRange() {
		return counterRange;
	}
	
}
