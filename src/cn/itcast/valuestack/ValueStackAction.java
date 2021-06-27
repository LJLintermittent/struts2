package cn.itcast.valuestack;

import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/30 21:03<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class ValueStackAction extends ActionSupport {
//    private  String username;
//
//    public String getUsername() {
//        return username;
//    }
//    private User user = new User();
//
//    public User getUser() {
//        return user;
//    }
 private List<User> list = new ArrayList<User>();

    public List<User> getList() {
        return list;
    }
    
    @Override
    public String execute() throws Exception {
//        username = "lijiale";

//        user.setUsername("lijiale");
//        user.setPassword("123456");
//        user.setAddress("xian");
        User user1 = new User();
        user1.setUsername("zzz");
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
