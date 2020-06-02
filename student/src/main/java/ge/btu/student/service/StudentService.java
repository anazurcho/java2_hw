package ge.btu.student.service;

import ge.btu.student.DTO.student.StudentsInput;
import ge.btu.student.DTO.student.StudentsOutput;
import ge.btu.student.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> students();
//    List<Student> students(StudentsInput);

    StudentsOutput studentsGender(StudentsInput studentsInput);

    void addStudent(Student student);

    void updateStudent(Long id, Student student);

    void deleteStudent(Long id);

}
