package Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentmarkscarddto {
	@Id
	private String usn;
	private String name;
	private String fathername;
	private String college;
	@Column(unique = true)
	private int slno;
	private String coursecode1;
	private String coursename1;
	private int gradepoints1;
	private String coursecode2;
	private String coursename2;
	private int gradepoints2;
	private String coursecode3;
	private String coursename3;
	private int gradepoints3;
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getCoursecode1() {
		return coursecode1;
	}
	public void setCoursecode1(String coursecode1) {
		this.coursecode1 = coursecode1;
	}
	public String getCoursename1() {
		return coursename1;
	}
	public void setCoursename1(String coursename1) {
		this.coursename1 = coursename1;
	}
	public int getGradepoints1() {
		return gradepoints1;
	}
	public void setGradepoints1(int gradepoints1) {
		this.gradepoints1 = gradepoints1;
	}
	public String getCoursecode2() {
		return coursecode2;
	}
	public void setCoursecode2(String coursecode2) {
		this.coursecode2 = coursecode2;
	}
	public String getCoursename2() {
		return coursename2;
	}
	public void setCoursename2(String coursename2) {
		this.coursename2 = coursename2;
	}
	public int getGradepoints2() {
		return gradepoints2;
	}
	public void setGradepoints2(int gradepoints2) {
		this.gradepoints2 = gradepoints2;
	}
	public String getCoursecode3() {
		return coursecode3;
	}
	public void setCoursecode3(String coursecode3) {
		this.coursecode3 = coursecode3;
	}
	public String getCoursename3() {
		return coursename3;
	}
	public void setCoursename3(String coursename3) {
		this.coursename3 = coursename3;
	}
	public int getGradepoints3() {
		return gradepoints3;
	}
	public void setGradepoints3(int gradepoints3) {
		this.gradepoints3 = gradepoints3;
	}
	@Override
	public String toString() {
		return "Studentmarkscarddto [usn=" + usn + ", name=" + name + ", fathername=" + fathername + ", college="
				+ college + ", slno=" + slno + ", coursecode1=" + coursecode1 + ", coursename1=" + coursename1
				+ ", gradepoints1=" + gradepoints1 + ", coursecode2=" + coursecode2 + ", coursename2=" + coursename2
				+ ", gradepoints2=" + gradepoints2 + ", coursecode3=" + coursecode3 + ", coursename3=" + coursename3
				+ ", gradepoints3=" + gradepoints3 + "]";
	}




}
