package com.hateoas.mapper;

import com.hateoas.entity.SsUser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wonyongkim on 2017. 1. 21..
 */
public class UserMapper {
    private List<SsUser> ssUserList;

    public UserMapper(){
        ssUserList = new ArrayList<>();

        SsUser user = new SsUser();
        user.setBirthYear("19831123");
        user.setGender("male");
        user.setCreateTime(new Date());
        user.setEmail("iersans@naver.com");
        user.setSource("NAVER");
        user.setSourceId("NAVER_SOURCE_ID");
        user.setSourceToken("NAVER TOKEN");
        user.setName("원용이");

        SsUser user1 = new SsUser();
        user1.setBirthYear("19841225");
        user1.setGender("male");
        user1.setCreateTime(new Date());
        user1.setEmail("neutti@naver.com");
        user1.setSource("FACEBOOK");
        user1.setSourceId("FACEBOOK_SOURCE_ID");
        user1.setSourceToken("FACEBOOK TOKEN");
        user1.setName("원용이2");

        ssUserList.add(user);
        ssUserList.add(user1);

    }

    public List<SsUser> getUserList(){
        return ssUserList;
    }

    public SsUser getUser(String source, String sourceId){
        for(int i = 0; i < ssUserList.size(); i++){
            SsUser ssUser = ssUserList.get(i);

            if(ssUser.getSource().equals(source) && ssUser.getSourceId().equals(sourceId))
                return ssUser;
        }
        return null;
    }
}