package streams.collect.connectdb;

import java.text.DecimalFormat;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

import database.common.EmpDAO;
import database.common.Employee;

public class Example01 {
	public static void main(String[] args) {
		List<Employee> employees = EmpDAO.getEmpList();
		DecimalFormat df = new DecimalFormat("#,###.00");

		// [직무별 사원목록]
//		Map<Jobs, List<Employee>> empsByJob = employees.stream()
//				.collect(Collectors.groupingBy(new Function<Employee, Jobs>() {
//					@Override
//					public Jobs apply(Employee t) {
//						return t.getJobId();
//					}
//				}, Collectors.toList()));
//
//		Set<Jobs> set = empsByJob.keySet();
//		Iterator<Jobs> iter = set.iterator();
//		while (iter.hasNext()) {
//			Jobs job = iter.next();
//			System.out.println("직무: " + job);
//			for (Employee emp : empsByJob.get(job)) {
//				System.out.println("  " + emp.getInfo());
//			}
//		}

		// [직무별 급여평균]
//		Map<Jobs, Double> avgByJob = employees.stream().collect(Collectors.groupingBy(new Function<Employee, Jobs>() {
//			@Override
//			public Jobs apply(Employee t) {
//				return t.getJobId();
//			}
//		}, Collectors.averagingDouble(new ToDoubleFunction<Employee>() {
//			@Override
//			public double applyAsDouble(Employee e) {
//				return e.getSalary();
//			}
//		})));
//
//		for (Map.Entry<Jobs, Double> ent : avgByJob.entrySet()) {
//			System.out.println("직무: " + ent.getKey() + ", 평균: " + format.format(ent.getValue()));
//		}
	}
}
