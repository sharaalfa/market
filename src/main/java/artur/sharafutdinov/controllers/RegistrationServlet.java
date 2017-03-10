package artur.sharafutdinov.controllers;

import javax.servlet.http.HttpServlet;

/**
 * Created by tatar on 05.03.17.
 */
public class RegistrationServlet extends HttpServlet {/*




    private static Logger logger = Logger.getLogger(RegistrationServlet.class);
    @Autowired
    private UserService userService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(
                this, getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.trace("REG on post");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String lastName = req.getParameter("last_name");
        String firstName = req.getParameter("first_name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        if(userService.registration(login, password, lastName,
                firstName, email, phone)){
            logger.trace("true");
            resp.sendRedirect("/students/login");
        }else{
            logger.trace("false");
            req.getRequestDispatcher("/error.jsp").forward(req, resp);
        }
    }*/

}
