package cn.tycoding.mapper;

import cn.tycoding.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author tycoding
 * @date 18-4-7下午9:10
 */
public interface UserMapper {

    User login(@Param("username") String username);
}
