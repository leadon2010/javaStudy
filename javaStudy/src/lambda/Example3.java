package lambda;

import java.util.function.ToIntFunction;

public class Example3 {
	private static Student[] student = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		double avg = 0;
		for (Student st : student) {
			sum += function.applyAsInt(st);
		}
		avg = (double) sum / student.length;
		return avg;
	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);

		englishAvg = avg(Student::getEnglishScore);
		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
		mathAvg = avg(Student::getMathScore);
		System.out.println("수학 평균 점수: " + mathAvg);
	}// end of main

}
