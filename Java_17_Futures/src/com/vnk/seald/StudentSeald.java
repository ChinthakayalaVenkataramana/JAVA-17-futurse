package com.vnk.seald;

public sealed class StudentSeald permits Address,Subjects {
public StudentSeald() {
	System.out.println("StudentSeald.StudentSeald()");
}
}
