package ge.btu.aop.demo.service.impl;

import ge.btu.aop.demo.service.LecturerService;
import org.springframework.stereotype.Service;

@Service
public class LecturerServiceImpl implements LecturerService {

    @Override
    public String getTask() {
        String task = "Lecturer  getTask";
        System.out.println(task);
        return task;
    }

    @Override
    public void setTask(String task) {
        System.out.println("Lecturer setTask");
    }
}
