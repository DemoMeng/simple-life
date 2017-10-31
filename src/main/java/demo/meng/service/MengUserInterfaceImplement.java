package demo.meng.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demo.meng.dao.UserMapper;
import demo.meng.model.User;

@Service("userService")
public class MengUserInterfaceImplement implements MengUserInterface {

	@Resource
    private UserMapper userDao;
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
