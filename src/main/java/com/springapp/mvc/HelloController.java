package com.springapp.mvc;

import com.springapp.mvc.domain.Student;
import com.springapp.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private StudentService studentService;

	@RequestMapping(method = RequestMethod.GET)
    @Transactional
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    @RequestMapping(value="/insert/{name}/{age}", method=RequestMethod.GET)
    @Transactional
    public String insert(@PathVariable String name, @PathVariable String age){
        studentService.insert(new Student(name, age));
        return "hello";
    }


}