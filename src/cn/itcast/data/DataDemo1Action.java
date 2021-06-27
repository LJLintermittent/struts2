package cn.itcast.data;

import com.opensymphony.xwork2.ActionSupport;

import java.awt.*;

/**
 * 使用属性封装获取表单数据
 * Description: <br/>
 * date: 2020/6/30 14:03<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class DataDemo1Action extends ActionSupport {
    //1.定义变量
    private String username;
    private String password;
    private String address;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(username +":"+password+":"+address);
        return  NONE;
    }
}
