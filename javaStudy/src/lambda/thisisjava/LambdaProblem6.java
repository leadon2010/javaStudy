package lambda.thisisjava;

import java.util.function.ToIntFunction;

public class LambdaProblem6 {
	private static Student[] students = { new Student("홍길동", 90, 60), new Student("박길동", 80, 87) };

	public static double avg(ToIntFunction<Student> fun) {
		int sum = 0, cnt = 0;
		for (Student st : students) {
			cnt++;
			sum += fun.applyAsInt(st);
		}
		return (double) sum / cnt;
	}

	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEnglistScore());
		System.out.println("영어 평균 점수: " + engAvg);

		double matAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + matAvg);

		System.out.println("==============");
		engAvg = avg(Student::getEnglistScore);
		System.out.println(engAvg);
		matAvg = avg(Student::getMathScore);
		System.out.println(matAvg);

	}
}
