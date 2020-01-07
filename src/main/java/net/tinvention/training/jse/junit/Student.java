package net.tinvention.training.jse.junit;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private List<Integer> marks = new ArrayList<Integer>();;

	public void addMark(Integer grade) {
		marks.add(grade);
	}

	/**
	 * 
	 * @return
	 * @return the marks' average
	 * 
	 */
	public double getGrade() {
		double sum = 0;
		if (!marks.isEmpty()) {
			for (Integer mark : marks) {
				sum += mark;
			}
			return sum / marks.size();
		}
		return sum;
	}

}
