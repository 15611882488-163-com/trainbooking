package wcx.lunwen.train_booking.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import wcx.lunwen.train_booking.pojo.UserInfo;


@Repository
public interface UserAddLoginDAO {

    @Select("select id  from   users  where  username = #{userInfo.username,jdbcType=VARCHAR}   and   password = #{userInfo.password,jdbcType=VARCHAR}")
    @Results({
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR)
    })
    Integer userLogin(@Param("reqDTO")UserInfo userInfo);
}
