package com.alibaba.fastjson2.issues_1000;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Issue1401 {
    public static class Bean {
        Map<Object, Object> map = new HashMap<>();

        public Bean() {
            map.put(0L, "Test");
            map.put(null, -1);
            map.put(2020, 2021);
            map.put(2022L, 2023L);
            map.put(Long.MIN_VALUE, Long.MIN_VALUE);
            map.put(Long.MAX_VALUE, Long.MAX_VALUE);
        }

        public Map<Object, Object> getMap() {
            return map;
        }
    }

    @Test
    public void test() throws JSONException {
        Bean bean = new Bean();
        JSONAssert.assertEquals("{\"map\":{\"0\":\"Test\",\"null\":-1,\"-9223372036854775808\":\"-9223372036854775808\",\"9223372036854775807\":\"9223372036854775807\",\"2020\":2021,\"2022\":2023}}", JSON.toJSONString(bean, JSONWriter.Feature.BrowserCompatible), true);
        JSONAssert.assertEquals("{\"map\":{\"0\":\"Test\",\"null\":-1,\"-9223372036854775808\":-9223372036854775808,\"9223372036854775807\":9223372036854775807,\"2020\":2021,\"2022\":2023}}", JSON.toJSONString(bean, JSONWriter.Feature.WriteNonStringKeyAsString), true);
    }
}
