package controller;

import jsp.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class RegistrationController {
    @RequestMapping("/registration")
    public String show() {
        return "registration";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request) {
        String name = request.getParameter("name");
        String studentId = request.getParameter("id");
        String department = request.getParameter("department");
        double cgpa = Double.parseDouble(request.getParameter("cgpa"));
        Student student = new Student(name, studentId, department, cgpa);
        jsp.Record.students.add(student);
        return "dashboard";
    }
}
