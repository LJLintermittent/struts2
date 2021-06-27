package cn.itcast.data;

import cn.itcast.entity.Book;
import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 使用表达式封装数据到实体类对象
 * Description: <br/>
 * date: 2020/6/30 14:03<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class DataDemo3Action extends ActionSupport {
    //使用表达式封装 数据到不同的实体类中
    private  User user;
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        System.out.println(book);
        return  NONE;
    }

}
