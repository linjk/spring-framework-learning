package cn.linjk;

/**
 * Copyright 1990-2020 LinJK
 *
 * @fileName: User
 * @author: linjk
 * @date: 2021/8/10 上午12:32
 * @description:
 */
public class User {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
