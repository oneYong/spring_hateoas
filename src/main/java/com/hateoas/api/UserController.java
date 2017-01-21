package com.hateoas.api;

import com.hateoas.entity.SsUser;
import com.hateoas.mapper.UserMapper;
import com.hateoas.resource.Greeting;
import com.hateoas.resource.UserDto;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

import java.util.Date;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by kimwonyong on 2017. 1. 20..
 */
@RestController
@RequestMapping(value="/api/users")
public class UserController {

    private UserMapper userMapper = new UserMapper();

    @RequestMapping(value = "/{source}/{sourceId}", method = RequestMethod.GET)
    public HttpEntity<UserDto> getUser(@PathVariable String source
                                       ,@PathVariable String sourceId ){

        SsUser ssUser = userMapper.getUser(source,sourceId);

        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(ssUser,userDto);

        userDto.add(linkTo(methodOn(UserController.class).getUser(source,sourceId)).withSelfRel());

        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
