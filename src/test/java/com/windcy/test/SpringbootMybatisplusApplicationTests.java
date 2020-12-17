package com.windcy.test;

import com.example.mapper.SubsidyRuleDao;
import com.example.model.SubsidyRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author xxx
 * @date 2020/12/16 16:38
 * @package com.windcy.test
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisplusApplicationTests {

    @Autowired
    private SubsidyRuleDao subsidyRuleMapper;

    @Test
    public void testFindAll(){
        List<SubsidyRule> users = subsidyRuleMapper.selectList(null);//参数为空默认查询所有数据
        // lambda表达式
        users.forEach(user -> System.out.println("user = "+ user));
    }
}
