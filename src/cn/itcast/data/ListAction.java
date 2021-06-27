package cn.itcast.data;

import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * 封装数据到list集合
 * Description: <br/>
 * date: 2020/6/30 14:48<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class ListAction extends ActionSupport {
    //1.声明一个list变量
    private List<User> list ;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(list);
        return  NONE;

    }
}
