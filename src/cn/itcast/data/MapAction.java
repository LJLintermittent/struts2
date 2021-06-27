package cn.itcast.data;

import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 * 封装数据到Map集合
 * Description: <br/>
 * date: 2020/6/30 14:48<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class MapAction extends ActionSupport {
    private Map<String,User> map;

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(map);
        return  NONE;

    }
}
