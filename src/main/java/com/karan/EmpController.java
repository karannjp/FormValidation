package com.karan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class EmpController {
@RequestMapping("/hello")
public String display(Model model){

    model.addAttribute("emp",new Emp());
    return  "view";

}
@RequestMapping("/helloagain")
public String submitform(@Valid @ModelAttribute("emp") Emp emp, BindingResult bindingResult){

    if (bindingResult.hasErrors()){

        return  "view";
    }
    else {
        return  "final";
    }


}



}
