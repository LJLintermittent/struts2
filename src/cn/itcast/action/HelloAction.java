package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLOutput;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/25 13:28<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class HelloAction extends ActionSupport{

    public String execute() {
        System.out.println("execute()方法执行了...");
        return "success";
    }

    public String add() {
        System.out.println("add()方法执行了...");
        return ActionSupport.NONE;
    }

    public String update() {
        System.out.println("update()方法执行了...");
        return ActionSupport.NONE;
    }


}
