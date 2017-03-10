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

/**
 * Created by tatar on 06.03.17.
 */

@Controller
public class UserController {
    private static final String REDIRECT_TO_LIST = "redirect:/users/list";
    private  static final String USER_LIST_VIEW = "userList";
    private static final String USER_EDIT_VIEW = "userEdit";
    public static final int DEFAULT_SPLITTERS_PER_PAGE = 25;

    private final Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);


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
        if (userService.registration(login, password, lastName, firstName, email, phone)) {
            return "redirect:/login";
        } else {
            model.addAttribute("msg", "Ошибка регистрации");
            return "/error";
        }
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String autorizeForm(Model model)
    {
        logger.info("страница логина и пароля");
        model.addAttribute("msg", "Добро пожаловать!");
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String autorize(Model model,
                           @RequestParam String login,
                           @RequestParam String password) throws UserDaoException {
        model.addAttribute(userService.authorize(login, password));

        return "redirect:/index";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.POST)
    public String welcome(Model model) {
        return "welcome";
    }

}
