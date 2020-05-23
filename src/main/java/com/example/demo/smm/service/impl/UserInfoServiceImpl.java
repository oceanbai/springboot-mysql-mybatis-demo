package com.example.demo.smm.service.impl;

import com.example.demo.smm.mapper.entity.UserInfo;
import com.example.demo.smm.service.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户信息业务实现类
 *
 * @author longzhang.wang
 * @Date 2019年11月5日
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

//    @Autowired
//    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfoById(Long id) throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(10L);
        userInfo.setCreateDate(new Date());
        userInfo.setUserName("小红");
        return userInfo;
    }

}
