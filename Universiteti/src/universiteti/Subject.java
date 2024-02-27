package universiteti;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a subject to represent a subject of school
 * Subject should has 
 * id - unique - type int
 * name - type string
 * teacher - type Teacher A subject is taught by a teacher
 * student lis - List<Student> A subject is followed by many students
 */

public class Subject {
   private int id;
   private String name; 
   private Teacher teacher; 
   private static final List<Integer> SUBJECTIDLIST = new ArrayList<>();
   private static final List<Student>  studentList = new ArrayList<>();
/**
 * @param id
 * @param name
 * @param teacher
 */
public Subject(int id, String name) {
	setId(id);
	setName(name);
	
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	if(id <= 0) throw new IllegalArgumentException("Error, negative ID");
	if(SUBJECTIDLIST.contains(id)) throw new 
	IllegalArgumentException("Error, ID" + id + " exists!");
	else { // good to go
		SUBJECTIDLIST.add(id);
	this.id = id;
  }
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the teacher
 */
public Teacher getTeacher() {
	return teacher;
}
/**
 * @param teacher the teacher to set
 */
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
   
   public void addStudent(Student student) {
	   if(!Student.STUDENTIDLIST.contains(student.getId())) 
	   studentList.add(student);
	   }
   /**
    * Get students of the subject
    */
   public List<Student> getStudents() {
	   return studentList;
   }
@Override
public String toString() {
	// TODO Auto-generated method stub
	String output = String.format("Subject ID: %d, Name: %s, Teacher: %s\n ", id, name, getTeacher().getName());
    output += "Subject followed by: \n";
    for (Student student : getStudents())
    	output += "ID:" +student.getId() + ", Name:" + student.getName() + "\n";
      return output; 
   }
}

