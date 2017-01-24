package com.hateoas.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WYKIM on 2017-01-20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CmmDtoTest {

    @Test
    public void test() throws JsonProcessingException {
        List<CmmDto> cmmDtoList = new ArrayList<>();
        List<Map<String,Object>> infos = new ArrayList<>();

        Map<String,Object> info1 = new HashMap<>();
        info1.put("userName","kim");

        Map<String,Object> info2 = new HashMap<>();
        info2.put("userName","park");
        Map<String,Object> info3 = new HashMap<>();
        info3.put("userName","jun");

        infos.add(info1);
        infos.add(info2);
        infos.add(info3);

        for(int i = 0; i < infos.size(); i++){
            Map<String,Object> map = infos.get(i);
            CmmDto cmmDto = new CmmDto();
            cmmDto.setObjectMap(map);

            cmmDtoList.add(cmmDto);
        }

        String result = new ObjectMapper().writeValueAsString(cmmDtoList);
        System.out.println(result);
    }

}
