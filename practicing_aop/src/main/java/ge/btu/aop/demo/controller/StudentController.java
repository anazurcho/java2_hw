package ge.btu.aop.demo.controller;

import ge.btu.aop.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("test")
    public void test(){
        studentService.getTask();
    }
    @GetMapping("test2")
    public void test2(){
        studentService.setTask("სატესტო ცვლადი");
    }
    @GetMapping("exc")
    public void test3(){
        studentService.exc();
    }
}
