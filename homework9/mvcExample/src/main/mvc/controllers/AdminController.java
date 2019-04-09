package mvc.controllers;

import mvc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import mvc.services.StudentsService;

@Controller
public class AdminController {

    private final StudentsService studentsService;


    @Autowired
    public AdminController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @RequestMapping({"/admin"})
    public ModelAndView workWithStudents(){
        ModelAndView model = new ModelAndView("/admin/main");
        model.addObject("mainText","Admin part of work with students");
        model.addObject("studentsList",studentsService.getAllStudents());
        return model;
    }

    @RequestMapping(name = "/admin", method = RequestMethod.POST)
    public ModelAndView createStudent(@RequestParam String pib, @RequestParam int course) {
        Student student = new Student();
        student.setPib(pib);
        student.setCourse(course);
        studentsService.addStudent(student);
        ModelAndView model = new ModelAndView("/admin/main");
        model.addObject("mainText", "Student Added");
        model.addObject("studentsList", studentsService.getAllStudents());
        return model;
    }

}
