package artur.sharafutdinov.controllers;

import artur.sharafutdinov.exceptions.UserDaoException;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import artur.sharafutdinov.services.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.management.FileSystem;

import javax.sound.midi.Patch;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.nio.file.*;

/**
 * Created by tatar on 06.03.17.
 */

@Controller
public class UserController {
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showStart(){
        return "/index";
    }
    @RequestMapping(value="/index", method = RequestMethod.POST)
    public String ShowAuth(Model model){
        model.addAttribute("переход на страницу авторизации");
        return "redirect:/login";
    }

    @RequestMapping(value = "/chart", method = RequestMethod.GET)
    public String chartImage(Model model){
        model.addAttribute("assc");
        return "/chart";
    }

    @RequestMapping(value = "/data.json", method = RequestMethod.GET)
    public String chartShow(Model model) {
        try {
            File fromXml1 = new File("/home/tatar/Yandex.Disk/Java_study/market3/data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(fromXml1);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("doc");

            Node node = nodeList.item(0);
            Element element = (Element) node;
            double amount = Double.parseDouble(element.getElementsByTagName("field1").item(0).getTextContent());
            double amount2 = Double.parseDouble(element.getElementsByTagName("field2").item(0).getTextContent());
            String amount3= element.getElementsByTagName("field3").item(0).getTextContent();
            String amount4 = element.getElementsByTagName("field4").item(0).getTextContent();
            System.out.println(amount);
            logger.trace("ddddd"+amount);
            model.addAttribute("errorAndOmissions1", amount);
            model.addAttribute("errorAndOmissions", amount2);
            model.addAttribute("capitalAndFlight", amount3);
            model.addAttribute("growthAndFall", amount4);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/data";


    }



    @Autowired
    private UserService userService;


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationForm(){
        logger.info("форма регистрации");

        return "/registration";
    }

    @RequestMapping(value="/registration", method = RequestMethod.POST)
    public String registration(Model model,
                               @RequestParam String login,
                               @RequestParam String password,
                               @RequestParam String lastName,
                               @RequestParam String firstName,
                               @RequestParam String email,
                               @RequestParam String phone) {
        if (!userService.registration(login, password, lastName, firstName, email, phone)) {
            logger.trace("true");
            return "/login";
        } else {
            model.addAttribute("msg", "Ошибка регистрации");
            return "/error";
        }
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error)
                              ///@RequestParam(value = "logout", required = false) String logout)
    {
        ModelAndView modelAndView = new ModelAndView();
        if(error!=null){
            modelAndView.addObject("error");
        }
        /*if(logout!=null){
            modelAndView.addObject("msg");
        }
        logger.info("страница логина и пароля");*/
        modelAndView.setViewName("login");
        //model.addAttribute("msg", "Добро пожаловать!");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String autorize(Model model,
                           @RequestParam String login,
                           @RequestParam String password) throws UserDaoException {
        model.addAttribute("Ура!");
        if(userService.authorize(login, password)){return "redirect:/chart";}
        return "/error";


    }


}
