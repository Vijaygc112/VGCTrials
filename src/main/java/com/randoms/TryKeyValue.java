package com.randoms;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TryKeyValue {
    private static final List<String> keys = new ArrayList<String>();
    private static final List<Object> values = new ArrayList<Object>();

    public static void main(String[] args) throws IOException {
        File file = new File("src/test/resources/json.json");

        ObjectMapper mapper = new ObjectMapper();

       List<Map<String, Object>> list = mapper.readValue(file, new TypeReference<List<Map< String, Object>>>(){});
        for (Map<String, Object> map: list) {
                findKeyValue(map);
        }
        System.out.println(keys);
        System.out.println(values);


    }

    private static void findKeyValue(Map<String, Object> map) {

        for(Map.Entry entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
        }

        map.forEach((key, value) -> {
            if(value instanceof LinkedHashMap){
                findKeyValue((LinkedHashMap) value);
            } else {
                values.add(value);
            }
                keys.add(key);
                }

        );


    }


}
