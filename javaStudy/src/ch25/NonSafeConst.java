package ch25;

interface Animal {
	int DOG = 1;
	int CAT = 2;
}

interface Person1 {
	int Man = 1;
	int Woman = 2;
}

public class NonSafeConst {
	public static void main(String[] args) {
		who(Person1.Man);
		who(Animal.DOG);
	}

	public static void who(int i) {
		switch (i) {
		case Person1.Man:
			System.out.println("남성손님입니다.");
			break;
		case Person1.Woman:
			System.out.println("여성손님입니다.");
			break;
		}
	}
}
