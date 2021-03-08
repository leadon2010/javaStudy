package interfaces;

class OracleDao implements DataAccessObject {
	String db = "Oracle DB";

	@Override
	public void select() {
		System.out.println(db + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(db + "에 삽입");
	}

	@Override
	public void update() {
		System.out.println(db + "를 수정");
	}

	@Override
	public void delete() {
		System.out.println(db + "에서 삭제");
	}
}

class MySqlDao implements DataAccessObject {
	String db = "MySql DB";

	@Override
	public void select() {
		System.out.println(db + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(db + "에 삽입");
	}

	@Override
	public void update() {
		System.out.println(db + "를 수정");
	}

	@Override
	public void delete() {
		System.out.println(db + "에서 삭제");
	}
}

public class DaoExample {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		// 익명구현객체.
		dbWork(new DataAccessObject() {
			String db = "Postgresql";

			@Override
			public void select() {
				System.out.println(db + "에서 검색");
			}
			@Override
			public void insert() {
				System.out.println(db + "에 삽입");
			}
			@Override
			public void update() {
				System.out.println(db + "를 수정");
			}
			@Override
			public void delete() {
				System.out.println(db + "에서 삭제");
			}
		});
	}

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
