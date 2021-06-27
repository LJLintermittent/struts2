package cn.itcast.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/1 14:17<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class LoginInterceptor extends MethodFilterInterceptor {
    //写拦截器逻辑
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        Object obj = request.getSession().getAttribute("username");
        if(obj != null){
            //登录状态
            //放行操作
            return actionInvocation.invoke();
        }else {
            //非登录状态(不执行aciton里面的方法)
            return  "defeate";
        }
    }
}
