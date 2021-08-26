package StudentAndClassroom.controller;

import StudentAndClassroom.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/student")
public class HomeController {
    @Autowired
    IStudentService iStudentService;

    @RequestMapping("/show")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("postStudent", iStudentService.finAll(PageRequest.of(3,2, Sort.by("name"))));
        return modelAndView;
    }

}
