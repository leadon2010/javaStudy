package employee;

public class Department {
	private int departmentId;
	private String departmentName;
	private int managerId;
	private String managerName;
	private int locationId;
	private String locationName;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "[부서번호=" + departmentId + ", 부서명=" + departmentName + ", 매니저=" + managerId + ", 매니저이름=" + managerName
				+ ", 지역코드=" + locationId + ", 지역명=" + locationName + "]";
	}

}
