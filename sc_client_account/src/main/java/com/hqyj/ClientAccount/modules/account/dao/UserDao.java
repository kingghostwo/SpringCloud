package com.hqyj.ClientAccount.modules.account.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.hqyj.ClientAccount.modules.account.entity.User;

@Mapper
@Repository
public interface UserDao {

	@Select("select * from user where user_id=#{userId}")
	User getUserByUserId(int userId);
}
