package com.control;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/control")
public class doReg {

    /**
     * 请求映射，请求路径为/control/register,只接受post请求
     * User属性名与name匹配时，实现动态绑定注入
     * 结束后由视图解析器自动跳转到success.jsp
     * @param user
     * @return
     */
    @RequestMapping(path = "/register",method = {RequestMethod.POST})
    public String doRegister(User user)
    {
        System.out.println("注册成功！");
        System.out.println(user);
        return "success";
    }
}
