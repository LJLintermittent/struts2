package cn.itcast.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/30 17:49<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class ValueStackDemoAction extends ActionSupport {

    private  String name;
    public String getName() {
        return name;
    }

    @Override
    public String execute() throws Exception {

//        name = "xuxinyu";
        //获取值栈对象
        ActionContext context = ActionContext.getContext();
        ValueStack valueStack = context.getValueStack();
        //调用set方法
        valueStack.set("username","lijiale");
        //调用push方法
        valueStack.push("xxxx");

        return "success";

    }
}
