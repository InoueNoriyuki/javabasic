package practice13.common;


public class Employee extends Person{
	String departmentNm;//部署名
	int departmentCnt;//部署の人数

	public String getDepartmentNm() {
		return this.departmentNm;
	}
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm =departmentNm;
	}
	public int getDepartmentCnt() {
		return this.departmentCnt;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt =departmentCnt;
	}
}
