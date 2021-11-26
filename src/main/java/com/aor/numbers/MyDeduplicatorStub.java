package com.aor.numbers;

import java.util.Arrays;
import java.util.List;

public class MyDeduplicatorStub implements GenericDeduplicator{
    public List<Integer> deduplicate(List<Integer> list){
        return Arrays.asList(1,2,4);
    }
}
