package com.xuker.controller;

import com.xuker.po.User;
import com.xuker.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:XuKe
 * @CreateOn:2019-01-15 14:03
 * @Email ：wxk1035@gmail.com
 */
@Controller
@RequestMapping("/user")
@Api("用户管理相关的api")//用在类上，说明该类的作用。
public class UserController {
    @Autowired
    private UserService userService;
    private static final Logger logger= LoggerFactory.getLogger(UserController.class);
    //注解来给API增加方法说明。
    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中指定ID的学生信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/showUser/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model, @PathVariable int id){
        int userId = id;
        logger.info("开始根据id查询某个学生信息");
        User user = this.userService.getUserById(userId);
        return user;
    }
    @ApiOperation(value = "新增学生信息", notes = "插入学生信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public String addUser(HttpServletRequest request, Model model){
        User user =new User();
        user.setId(4);
        user.setAge(18);
        user.setPassword("000");
        user.setUserName("222");
        Map map=new HashMap();
        map.put("id",1);
        map.put("userName","wxk111");
        userService.updateUser(user,map);
        return "";
    }
}
/**
 *   @Api：用在类上，说明该类的作用。
 *   ApiOperation：注解来给API增加方法说明。
 *   ApiImplicitParams : 用在方法上包含一组参数说明。
 *   ApiImplicitParam：用来注解来给方法入参增加说明。
 *   ApiResponses：用于表示一组响应
 *   ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
 *         code：数字，例如400
 *         message：信息，例如"请求参数没填好"
 *         response：抛出异常的类
 *   @ApiModel：描述一个Model的信息（一般用在请求参数无法使用@ApiImplicitParam注解进行描述的时候）
 *   @ApiModelProperty：描述一个model的属性
 */

/*
* @ApiImplicitParam的参数说明：
*
*paramType会直接影响程序的运行期，如果paramType与方法参数获取使用的注解不一致，会直接影响到参数的接收。
*                                          header：请求参数放置于Request Header，使用@RequestHeader获取
*                                          query：请求参数放置于请求地址，使用@RequestParam获取
*    paramType：指定参数放在哪个地方
*                                          path：（用于restful接口）-->请求参数的获取：@PathVariable
*                                          body：（不常用）
*                                          form（不常用）
*    name：参数名
*    dataType：参数类型
*    required：参数是否必须传               true | false
*    value：说明参数的意思
*    defaultValue：参数的默认值
* */
