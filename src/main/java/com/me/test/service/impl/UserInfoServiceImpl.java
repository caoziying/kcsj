package com.me.test.service.impl;

import com.me.test.mapper.UserInfoMapper;
import com.me.test.pojo.UserInfo;
import com.me.test.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void add(UserInfo userInfo) {
        userInfoMapper.add(userInfo);
    }

    @Override
    public void delete(Integer id) {
        userInfoMapper.delete(id);
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.update(userInfo);
    }

    @Override
    public UserInfo queryById(Integer id) {
        return userInfoMapper.queryById(id);
    }

    @Override
    public List<UserInfo> queryAll() {
        return userInfoMapper.queryAll();
    }
}
