package wcx.lunwen.train_booking.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wcx.lunwen.train_booking.pojo.UserInfo;
import wcx.lunwen.train_booking.service.UserAddLoginService;

@RestController
public class UserAddLogin {
    private static final Logger logger = LoggerFactory.getLogger(UserAddLogin.class);
    @Autowired
    @Qualifier("useraddloginservice")
    private UserAddLoginService userAddLoginService;
    private String response;
    @SuppressWarnings("rawtypes")
    @RequestMapping("/login")
    public String userLogin(@RequestBody UserInfo userInfo) throws Exception {

        try {
            response = userAddLoginService.userLogin(userInfo);
        } catch (Exception e) {
            logger.error("queryBatch exception: {}", userInfo, e);
            new String("用户名密码不正确");
        }

        return response;
    }

    @RequestMapping("/add")
    public String userAdd() {
        return "This door is closed!";
    }

}
