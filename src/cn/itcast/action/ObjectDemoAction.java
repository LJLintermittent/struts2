package cn.itcast.action;

import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import freemarker.core.ReturnInstruction;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/30 20:44<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class ObjectDemoAction extends ActionSupport {
    private User user = new User();

    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        user.setUsername("xuxinyu");
        user.setPassword("123456");
        user.setAddress("西安");


        return "success";
    }
}
