package com.vnk.record;

public class StudentMain {

	public static void main(String[] args) {
		Student st=new Student("Ravana", 21, "SV");
		System.out.println(st.age()+" "+st.name()+" "+st.collegeName());

	}

}
