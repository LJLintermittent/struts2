package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;
import freemarker.template.utility.Execute;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/27 10:15<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class PersonAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return "success";
    }
}
