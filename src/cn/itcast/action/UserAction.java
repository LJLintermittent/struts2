package cn.itcast.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import jdk.nashorn.internal.ir.ReturnNode;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/27 10:10<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class UserAction  extends ActionSupport {
//    public UserAction() {
//        System.out.println("action创建了....");
//    }
    @Override
    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        //得到值栈对象
        ValueStack valueStack1 = context.getValueStack();
        ValueStack valueStack2 = context.getValueStack();
        System.out.println(valueStack1==valueStack2);

        return  NONE;

    }
}
