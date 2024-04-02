package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.BallBrokenFloor;

class BallBrokeFloorTest {

	private static final int N_FLOORS = 100;

	@Test
	void test() {
		BallBrokenFloor bbf = new BallBrokenFloor(N_FLOORS);
		assertEquals(bbf.getBrokenFloor(), getMintBrokenFloor(bbf));
	}

	private int getMintBrokenFloor(BallBrokenFloor bbf) {
		// using binary search algorithm and only method checkFloor
		// of the classBrokenFloor
		// you should find minimal floor,from which ball will be broken
		int low = 1;
		int high = N_FLOORS;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			try {
				bbf.checkFloor(mid);
				low = mid + 1;
			} catch (Exception e) {
				high = mid - 1;
			}
		}

		return low;

	}
}
