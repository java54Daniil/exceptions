package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.RangeExceptions;
import telran.exceptions.RangeExceptionsProcessor;

class RangeExceptionsProcessorTest {

	private static final int MIN = 10;
	private static final int MAX = 20;
	private static final int N_RANGE_NUMBERS = 10;
	private static final int RANGE_GREATER_NUMBER = 25;
	private static final int RANGE_NUMBERS = 15;
	private static final int N_GREATER_MAX_NUMBERS = 30;
	private static final int N_LESS_MIN_NUMBERS = 3;
	private static final int RANGE_LESS_NUMBER = 8;

	@Test
	void test() {
		RangeExceptions rangeExceptions = 
				RangeExceptions.getRangeExceptions(MIN, MAX);
		RangeExceptionsProcessor  rangeExceptionProcessor =
				new RangeExceptionsProcessor(rangeExceptions);
		processNumber(rangeExceptionProcessor, N_RANGE_NUMBERS, RANGE_NUMBERS);
		processNumber(rangeExceptionProcessor, N_GREATER_MAX_NUMBERS, RANGE_GREATER_NUMBER);
		processNumber(rangeExceptionProcessor, N_LESS_MIN_NUMBERS, RANGE_LESS_NUMBER);
		assertEquals(N_RANGE_NUMBERS, rangeExceptionProcessor.getCounterRange());
		assertEquals(N_GREATER_MAX_NUMBERS, rangeExceptionProcessor.getCounterGreaterMax());
		assertEquals(N_LESS_MIN_NUMBERS, rangeExceptionProcessor.getCounterLesMin());
	}
	private void processNumber(RangeExceptionsProcessor rangeExceptionProcessor,
			int nNumbers,int number) {
		for(int i = 0;i<nNumbers;i++) {
			rangeExceptionProcessor.numberProcessor(number);
		}
	}
}
