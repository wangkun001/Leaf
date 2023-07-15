package com.sankuai.inf.leaf.snowflake;

import com.sankuai.inf.leaf.IDGen;
import com.sankuai.inf.leaf.common.PropertyFactory;
import com.sankuai.inf.leaf.common.Result;
import org.junit.Test;

import java.util.Properties;

public class SnowflakeIDGenImplTest {
    @Test
    public void testGetId() {
        Properties properties = PropertyFactory.getProperties();

        SnowflakeIDGen idGen = new SnowflakeIDGen(0, 8080);
        for (int i = 1; i < 1000; ++i) {
            long r = idGen.nextId();
            System.out.println(r);
        }
    }
}
