package org.weshzhu.service.impl;

import org.springframework.stereotype.Service;
import org.weshzhu.service.DataProcessService;

@Service
public class DataProcessServiceImpl implements DataProcessService {
    @Override
    public void test() {
        System.out.println("this is DataProcessServiceImpl method");
    }
}
