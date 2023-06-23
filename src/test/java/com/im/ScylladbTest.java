package com.im;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-23
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ScylladbTest {

    @Resource
    private CqlSession cqlSession;

    @Test
    public void client() {
        ResultSet resultSet = cqlSession.execute("desc tables");
        int i = 0;
        List<Row> all = resultSet.all();
        System.out.println(all);
    }
}
