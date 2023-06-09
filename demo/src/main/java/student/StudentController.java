package student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;


@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    @GetMapping
    public Student getStudents() {
        return
                new Student(1L, "Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21);
    }
}
