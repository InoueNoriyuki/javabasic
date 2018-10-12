/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {

	private String student;


public String getStudent() {
	return this.student;
	}
public void setStudent(String student) {
	this.student = student;
}
	/** 受講生ID */
	 private int studentId;

	/** 受講生氏名 */
	 private String studentName;

	/** 会社名 */
	 private String companyName;

	/** 教室名 */
	 private String className;

	/** メールアドレス */
	 private String mail;

	/** パスワード */
	private String password;
}

