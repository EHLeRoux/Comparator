package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class numberOfStudentsSort implements Comparator<Course> {

	/*
	 * Compares objects and sorts them by course Name
	 */
	@Override
	public int compare(Course o1, Course o2) {

		if (o1.numberOfStudents == o2.numberOfStudents) {
			return 0;
		} else if (o1.numberOfStudents > o2.numberOfStudents) {
			return 1;
		} else {
			return -1;
		}
	}

	/*
	 * This method swaps two objects in the arraylist by creating a temp holder.
	 * Takes the arraylist and the index numbers of the two objects as parameters.
	 */
	public static void swap(ArrayList<Course> list, int index1, int index2) {
		Course tempCourse = list.get(index1);
		Course tempCourse2 = list.get(index2);
		list.set(index2, tempCourse);
		list.set(index1, tempCourse2);

	}

	/*
	 * This method simply prints out the items of the course
	 */
	public static void print(ArrayList<Course> list) {

		if (list.isEmpty()) {
			System.out.println("Your Course list is empty :( ");
		}

		for (Course course : list) {
			System.out.println(course.numberOfStudents + " " + course.courseName + " " + course.courseLecturer + " ");
		}

	}

	public static void main(String[] args) {

		ArrayList<Course> courses1 = new ArrayList<Course>();
		courses1.add((new Course("Mathematics", 20, "Z. Howell")));
		courses1.add(new Course("Computer Science", 15, "B. Baxter"));
		courses1.add(new Course("Physics", 30, "D. Gray"));
		courses1.add(new Course("English", 5, "T. Entinia"));
		courses1.add((new Course("Mathematical statistics", 40, "S. Ableton")));
		System.out.println("\nCourses1 include the following: ");
		print(courses1);
		Collections.sort(courses1, new numberOfStudentsSort());
		System.out.println("\nAfter sorting by amount of students: ");
		print(courses1);
		System.out.println("\nSwapping two objects... ");
		swap(courses1, 0, 1);
		print(courses1);

	}
}
