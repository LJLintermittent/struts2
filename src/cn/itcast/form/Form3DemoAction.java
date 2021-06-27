package cn.itcast.form;

import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/29 10:51<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Form3DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //1.获取表单数据
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        //2.封装到实体类对象中
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);

        System.out.println(user);

        return NONE;

    }
}
