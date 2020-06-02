package ge.btu.student.DTO.student;

import ge.btu.student.enums.GenderType;
import lombok.Data;

@Data
public class StudentsInput {
    private GenderType genderType;
}
