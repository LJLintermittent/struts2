package cn.itcast.form;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/29 10:51<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Form1DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        Map<String, Object> map = context.getParameters();
        Set<String> Keys = map.keySet();
        for(String key : Keys){
            Object[] obj = (Object[]) map.get(key);
            System.out.println(Arrays.toString(obj));
        }


        return NONE;
    }
}
