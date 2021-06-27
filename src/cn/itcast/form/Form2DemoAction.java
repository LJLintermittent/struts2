package cn.itcast.form;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/29 11:04<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Form2DemoAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
//        HttpServletRequest request = ServletActionContext.getRequest();
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String address = request.getParameter("address");
//        System.out.println(username+":" +password+":" +address);
        //1.request域
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("req", "reqValue");
        //2.session域
        HttpSession session = request.getSession();
        session.setAttribute("sess", "sessValue");
        //3.servletContext域
        ServletContext context = ServletActionContext.getServletContext();
        context.setAttribute("contextName","contextValue");


        return NONE;
    }
}
