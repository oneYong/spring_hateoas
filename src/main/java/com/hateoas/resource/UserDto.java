package com.hateoas.resource;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;

/**
 * Created by kimwonyong on 2017. 1. 20..
 */
@Data
public class UserDto extends ResourceSupport{

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
    public Date createTime;
    public String email;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
    public Date lastTime;
    public String name;
    public String birthYear;
    public String interest;
    public String gender;
    public String source;
    public String sourceId;
    public String sourceToken;

}
