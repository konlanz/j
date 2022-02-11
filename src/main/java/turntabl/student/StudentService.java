package turntabl.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(1L,"Konlan Mikpekoah",23, "konlan@gmai.com", LocalDate.of(2000, 12, 26)),
                new Student(1L,"Abigial",20, "abi@gmai.com", LocalDate.of(2002, 2, 16)));
    }
}
