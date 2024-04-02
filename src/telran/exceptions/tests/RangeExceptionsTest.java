package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.NumberGreaterRangeMaxExceptions;
import telran.exceptions.NumberLessrRangeMinExceptions;
import telran.exceptions.RangeExceptions;

class RangeExceptionsTest {

	@Test
	void factoryMethodTest() throws NumberGreaterRangeMaxExceptions, NumberLessrRangeMinExceptions {
		RangeExceptions range = RangeExceptions.getRangeExceptions(3, 30);
		assertThrowsExactly(IllegalArgumentException.class, 
				()-> RangeExceptions.getRangeExceptions(30, 3));
		range.checkNumber(5);
		assertThrowsExactly(NumberGreaterRangeMaxExceptions.class,
				()-> range.checkNumber(35));
		assertThrowsExactly(NumberLessrRangeMinExceptions.class, 
				()-> range.checkNumber(2));
	}


}
