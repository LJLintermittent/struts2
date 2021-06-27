package cn.itcast.data;

import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 使用模型驱动获取表单数据
 * Description: <br/>
 * date: 2020/6/30 14:03<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class DataDemo2Action extends ActionSupport implements ModelDriven<User> {

    private  User  user = new User();
    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return  NONE;
    }

    @Override
    public User getModel() {
        return user;
    }
}
