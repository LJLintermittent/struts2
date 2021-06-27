package cn.itcast.action;

import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/30 20:52<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class ListDemoAction extends ActionSupport {
    private List<User> list = new ArrayList<User>();

    public List<User> getList() {
        return list;
    }

    @Override
    public String execute() throws Exception {
        User user1 = new User();
        user1.setUsername("xxx");
        user1.setPassword("123");
        user1.setAddress("西安");

        User user2 = new User();
        user2.setUsername("李佳乐");
        user2.setPassword("123");
        user2.setAddress("西安");

        list.add(user1);
        list.add(user2);

        return "success";
    }
}
