package artur.sharafutdinov.controllers;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;

/**
 * Created by tatar on 04.03.17.
 */
public class LoginServlet extends HttpServlet {

    /**
     * Логгеры
     */
    Logger logger = Logger.getLogger(LoginServlet.class);

    /**
     *
     */

   /* @Autowired
    private UserService userService;


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(
                this, getServletContext());
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.trace("onget");
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.trace("on post");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        try {
            if(userService.authorize(login, password)){
                logger.trace("true");
                resp.sendRedirect("/registration.jsp");
            }else{
                logger.trace("false");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
            }
        } catch (UserDaoException e) {
            logger.error(e);
            resp.sendRedirect("/error.jsp");
        }
    }*/
}
