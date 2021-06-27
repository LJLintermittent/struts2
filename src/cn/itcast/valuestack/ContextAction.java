package cn.itcast.valuestack;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/1 9:32<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class ContextAction  extends ActionSupport {
    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("req", "reqValue");


        return  "success";
    }
}
