package ge.btu.aop.demo.service.impl;

import ge.btu.aop.demo.aspect.Loggable;
import ge.btu.aop.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Loggable
    @Override
    public String getTask() {
        System.out.println("returns getTask()");
        return "getTask()";
    }

    @Override
    public void setTask(String task) {
        System.out.println("setTask " + task);
    }

    @Override
    public void exc() {
        System.out.println("exc");
        throw new RuntimeException();
    }
}
