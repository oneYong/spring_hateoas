package com.hateoas.resource;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by kimwonyong on 2017. 1. 20..
 */
@Data
public class CmmDto extends ResourceSupport{
    private Map<String, Object> objectMap;

    @JsonAnyGetter
    public Map<String,Object> getObjectMap(){
        return objectMap;
    }

}
