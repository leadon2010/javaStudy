package ch30;

import java.util.Arrays;

class GradeAverage90 {
    public static void main(String[] args) {
        ReportCard[] cards = {
            new ReportCard(98, 84, 90),
            new ReportCard(92, 87, 95),
            new ReportCard(85, 99, 93)
        };       

        boolean b1 = Arrays.stream(cards)
              .mapToDouble(
                  r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0)
              .anyMatch(avg -> avg >= 90.0);
        System.out.println("평균 90 이상이 한 명 이상 존재합니다. " + b1);

        if(b1 == true) {
            boolean b2 = Arrays.stream(cards)
                 .mapToDouble(
                     r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0)
                 .allMatch(avg -> avg >= 90.0);
            System.out.println("모두 평균 90 이상입니다. " + b2);
        }
    }
}