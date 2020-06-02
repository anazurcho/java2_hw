package ge.btu.student.service.impl;

import ge.btu.student.DTO.student.StudentsInput;
import ge.btu.student.DTO.student.StudentsOutput;
import ge.btu.student.enums.GenderType;
import ge.btu.student.model.Student;
import ge.btu.student.service.StudentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Primary
@Service
public class StudentServiceIml implements StudentService {

    List<Student> students = new ArrayList<>();

    public StudentServiceIml() {

        students = new ArrayList<>();
        students.add(new Student(1L, "Nika", "Nikashvili", GenderType.MALE));
        students.add(new Student(2L, "Mari", "Marishvili", GenderType.FEMALE));
        students.add(new Student(3L, "Dato", "Datoshvili", GenderType.MALE));
        students.add(new Student(4L, "Ani", "Anadze", GenderType.FEMALE));

    }

    @Override
    public List<Student> students() {
        return students;
    }

    @Override
    public StudentsOutput studentsGender(StudentsInput studentsInput) {

        List<Student> nList = new ArrayList<>();
        for (Student student : students) {
            if (student.getGenderType().equals(studentsInput.getGenderType())) {
                nList.add(student);
            }
        }
        StudentsOutput studentsOutput = new StudentsOutput();
        studentsOutput.setStudents(nList);
        return studentsOutput;

    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(Long id, Student student) {
        for (Student currentStudent : students) {
            if (currentStudent.getId().equals((id))) {
                currentStudent.setFirstName(student.getFirstName());
                currentStudent.setLastName(student.getLastName());
                currentStudent.setGenderType(student.getGenderType());
                currentStudent.setId(student.getId());
            }
        }
    }

    @Override
    public void deleteStudent(Long id) {
        for (Student currentStudent : students) {
            if (currentStudent.getId().equals((id))) {
                students.remove(currentStudent);
            }
        }
    }
}
