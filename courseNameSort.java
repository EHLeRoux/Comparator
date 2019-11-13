package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class courseNameSort implements Comparator<Course> {

	/*
	 * compares objects with one another and sorting them by courseName
	 */
	@Override
	public int compare(Course o1, Course o2) {

		return o1.courseName.compareTo(o2.courseName);
	}

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

	/*
	 * Overloaded find method, one to find the object with specific course name; and
	 * the other to find the object with a certain number of students.
	 */

	public static Object find(ArrayList<Course> list, String name) {
		for (Course course : list) {
			if (course.courseName == name) {
				return "Index: " + list.indexOf(course);
			}
		}
		return null;
	}

	public static Object find(ArrayList<Course> list, int numberOfStudents) {
		for (Course course : list) {
			if (course.numberOfStudents == numberOfStudents) {
				return course;
			}
		}
		return null;
	}

	/*
	 * 
	 * These two methods (max and min) find the max and min amount of students from
	 * the list and returns the integer value.
	 * 
	 * The find method must be used in conjunction with these methods to find that
	 * specific course with the number of students.
	 */
	public static int max(ArrayList<Course> list) {
		int max;
		max = 0;
		for (Course course : list) {
			if (course.numberOfStudents > max) {
				max = course.numberOfStudents;
			}

		}
		return max;
	}

	public static int min(ArrayList<Course> list) {
		int min;
		min = Integer.MAX_VALUE;
		for (Course course : list) {
			if (course.numberOfStudents < min) {
				min = course.numberOfStudents;
			}

		}
		return min;
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
		ArrayList<Course> courses3 = new ArrayList<Course>();
		courses3.add((new Course("Visual Art", 50, "A. Zenemax")));
		courses3.add((new Course("Psychology", 70, "B. Pinky")));
		courses3.add((new Course("Anthropology", 10, "C. Darren")));
		courses3.add((new Course("Sociology", 90, "M. Colonel")));
		courses3.add((new Course("Arithmetic", 20, "P. Tereke")));
		System.out.println("\nTemporary courses3 created: ");
		print(courses3);
		ArrayList<Course> courses2 = new ArrayList<Course>();
		System.out.println("\naddAll Method used to add courses3 to courses2: ");
		courses2.addAll(courses3);
		System.out.println("\ndeleting courses3: ");
		courses3.clear();
		print(courses3);
		System.out.println("\nCourses2 include the following: ");
		print(courses2);
		System.out.println("\nAdding courses from courses1 to courses2: ");
		courses2.addAll(courses1);
		System.out.println("\nCourses2 include the following: ");
		print(courses2);
		System.out.println("\nAdding two new elements: ");
		courses2.add((new Course("Java 101", 85, "Dr. P Green")));
		courses2.add((new Course("Advanced Programming", 93, "Prof. M Milton")));
		Collections.sort(courses2, new courseNameSort());
		System.out.println("\nSorted courses2 (Sorted by Course Name): ");
		print(courses2);

		System.out.println("\nJava 101 is located at: ");
		System.out.println(find(courses2, "Java 101"));

		System.out.println("\nUsing the disjoint function to see if the two lists are disjoint: ");
		System.out.println(Collections.disjoint(courses2, courses1));
		System.out.println("\nCourse with the most students is: ");
		System.out.println(find(courses2, max(courses2)));
		System.out.println("\nCourse with the least students is: ");
		System.out.println(find(courses2, min(courses2)));

	}

}
