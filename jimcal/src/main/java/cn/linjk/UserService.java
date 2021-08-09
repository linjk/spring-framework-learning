package cn.linjk;

/**
 * Copyright 1990-2020 LinJK
 *
 * @fileName: UserService
 * @author: linjk
 * @date: 2021/8/10 上午12:32
 * @description:
 */
public class UserService implements IUserService {
	@Override
	public User getUserById(int id) {
		User user = new User();
		user.setName("linjk");
		user.setAge(30);
		return user;
	}
}
