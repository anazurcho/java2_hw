package ge.btu.student.DTO.student;

import ge.btu.student.model.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentsOutput {
    List<Student> students = new ArrayList<>();
}
