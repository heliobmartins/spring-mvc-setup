package br.com.helio.templatespringmvc.web;

import br.com.helio.templatespringmvc.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Hélio
 */
@Controller
public class HomeController {

    @Autowired
    private CalculateService helloService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("hello", "Hello World");
        modelAndView.addObject("sum", helloService.addTwoNumbers(1, 2));
        return modelAndView;
    }
}
