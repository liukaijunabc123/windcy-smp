package com.example.controller;


import com.example.entity.ResponseEntity;
import com.example.model.SubsidyRule;
import com.example.service.ISubsidyRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 老年人补贴制度表 前端控制器
 * </p>
 *
 * @author liukj
 * @since 2020-12-16
 */
@RestController
@RequestMapping("/subsidy-rule")
public class SubsidyRuleController {

    @Autowired
    private ISubsidyRuleService iSubsidyRuleService;


    @PostMapping("/query")
    public ResponseEntity query(){
        List<SubsidyRule> list =new ArrayList<>();
        return ResponseEntity.success(list);
    }

}
