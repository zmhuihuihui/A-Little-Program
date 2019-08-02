package com.control;


import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(path = "/test")
@SessionAttributes({"abc","def"})
public class controller {

    /**
     * 与name名相同实现动态绑定
     * 前台只绑定了username和password,age为0
     * 可以通过ModelAttribute给age赋值
     * @param user
     * @return
     */
    @RequestMapping(path = "/testInject")
    public String testInject(User user)
    {
        System.out.println("动态绑定成功...");
        System.out.println(user);
        return "success";
    }


    /**
     * ModelAttribute总是优先执行
     * 可以通过数据库，查询未赋值属性的默认值
     * 返回相同name的实体类，可以与之后实体类动态绑定
     * @return
     */
    @ModelAttribute
    public User testModelAttribute()
    {
        System.out.println("ModelAttribute先执行了...");
        User user =new User();
        user.setAge(10);
        return user;
    }


    /**
     * PathVariable实现RESTful风格的编程
     * 通过PathVariable指定注入age
     * @param age
     * @return
     */
    @RequestMapping(path = "/testPathVariable/{age}")
    public String testPathVariable(@PathVariable("age") int age)
    {
        System.out.println("PathVariable执行了...");
        System.out.println("age=" + age);
        return "success";
    }


    /**
     * 通过查询数据库，可以将数据存入Model
     * Model底层会将数据存入Request对象中
     * 类上配置@SessionAttributes注解，可将直接name存入Session中
     * @param model
     * @return
     */
    @RequestMapping(path = "/testSaveSession")
    public String testSaveSession(Model model)
    {
        System.out.println("SaveSession执行了...");
        User user=new User();
        model.addAttribute("abc",user);
        return "success";
    }


    /**
     * 测试ModelAndView对象
     * addObject添加数据到Model对象
     * setViewName设置跳转页面
     * @return
     */
    @RequestMapping(path = "/testModelAndView")
    public ModelAndView testModelAndView()
    {
        System.out.println("ModelAndView执行了...");
        ModelAndView mav =new ModelAndView();
        User user=new User();
        mav.addObject("def",user);
        mav.setViewName("success");
        return mav;
    }


    /**
     * 返回值关键字forward实现请求转发
     * @return
     */
    @RequestMapping(path = "/testForward")
    public String testForward()
    {
        System.out.println("Forward执行了...");
        return "forward:/success.jsp";
    }


    /**
     * 返回值关键字redirect实现重定向
     * 相当与一次请求，无法访问WEB-INF文件
     * 包含ContextPath路径
     * @return
     */
    @RequestMapping(path = "/testRedirect")
    public String testRedirect()
    {
        System.out.println("Redirect执行了...");
        return "redirect:/success.jsp";
    }

}
