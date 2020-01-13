package wcx.lunwen.train_booking.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import wcx.lunwen.train_booking.dao.UserAddLoginDAO;
import wcx.lunwen.train_booking.pojo.UserInfo;

@Scope("singleton")
@Service("useraddloginservice")
public class UserAddLoginServiceImpl implements UserAddLoginService {
    private static final Logger logger = LoggerFactory.getLogger(UserAddLoginServiceImpl.class);
    @Autowired(required=true)
    private UserAddLoginDAO userAddLoginDAO;
    @Override
    public String userLogin(UserInfo userInfo) {
        logger.info("执行方法");
        String  res ;
        if(userAddLoginDAO.userLogin(userInfo)>0){
            res ="验证通过";
        }else{
            res ="用户名密码错误";
        }
        return res;
    }
}
