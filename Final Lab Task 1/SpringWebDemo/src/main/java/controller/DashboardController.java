package controller;

import jsp.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class DashboardController {
    @RequestMapping("/dashboard")
    public String show() {
        return "dashboard";
    }

    @RequestMapping("/filter")
    public String filter(HttpServletRequest request, Model model) {
        ArrayList<Student> filteredStudents = new ArrayList<Student>();
        int filterCgpa = Integer.parseInt(request.getParameter("select"));
        for (Student student : jsp.Record.students) {
            if(filterCgpa == 0 && student.getCgpa() < 3.0){
                filteredStudents.add(student);
            }else if (filterCgpa == 3 && student.getCgpa() >= 3.0) {
                filteredStudents.add(student);
            }
        }
        model.addAttribute("students", filteredStudents);
        return "filter";
    }
}
