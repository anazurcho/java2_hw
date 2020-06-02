package ge.btu.student.controller;

import ge.btu.student.DTO.student.StudentsInput;
import ge.btu.student.DTO.student.StudentsOutput;
import ge.btu.student.model.Student;
import ge.btu.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentController {

//    @Qualifier("studentServiceMockIml")
    @Autowired
    StudentService studentService;

//    @Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @Autowired
//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }

//    @RequestMapping(value = "/students", method = RequestMethod.GET)


    @GetMapping("students")
    public List<Student> students(){
        return studentService.students();
    }

    @PostMapping("studentsGender")
    public StudentsOutput studentsGender(@RequestBody StudentsInput studentsInput) {
        return studentService.studentsGender(studentsInput);
    }

    @PostMapping("addStudents")
    public void addStudents(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("updateStudent/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student){
        studentService.updateStudent(id, student);
    }

    @DeleteMapping("deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

}
