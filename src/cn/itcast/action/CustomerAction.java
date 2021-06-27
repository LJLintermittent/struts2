package cn.itcast.action;

import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/1 11:27<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class CustomerAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    //登录方法
    public String login() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("admin".equals(username) && "123456".equals(password)) {

            request.getSession().setAttribute("username", "username");

            return "loginsuccess";
        } else {
            return "defeate";

        }

    }


    @Override
    public String execute() throws Exception {


        return NONE;
    }
}
