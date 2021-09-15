package com.gxh.natural.modules.ums.service.impl;

import com.gxh.natural.modules.ums.mapper.UmsAdminMapper;
import com.gxh.natural.modules.ums.model.UmsAdmin;
import com.gxh.natural.modules.ums.model.UmsAdminExample;
import com.gxh.natural.modules.ums.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 后台用户ServiceImpl
 * @author: gxh
 * @create: 2021-09-14-23-21
 **/
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    public List<UmsAdmin> getList() {
        UmsAdminExample example = new UmsAdminExample();
        UmsAdminExample.Criteria criteria = example.createCriteria();
        criteria.andCreateTimeIsNotNull();
        List<UmsAdmin> list = umsAdminMapper.selectByExample(example);
        return list;
    }
}
