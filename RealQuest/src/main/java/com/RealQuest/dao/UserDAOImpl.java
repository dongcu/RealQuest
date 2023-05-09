package com.RealQuest.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSession sql;
	private static String namespace = "com.RealQuest.mapper.user";
	
}
