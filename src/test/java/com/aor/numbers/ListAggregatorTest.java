package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    @Test
    public void sum() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        aggregator.helper(list);

        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();

        aggregator.helper(list);

        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();

        aggregator.helper(list);

        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();

        aggregator.helper(list);

        int distinct = aggregator.distinct(list,new ListDeduplicator());

        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void max_bug_7263(){
        List<Integer> list = Arrays.asList(-1,-4,-5);

        ListAggregator aggregator = new ListAggregator();

        aggregator.helper(list);

        int max = aggregator.max(list);

        Assertions.assertEquals(-1, max);
    }

    @Test
    public void distinct_bug_8726(){
        List<Integer> list = Arrays.asList(1,2,4,2);

        ListAggregator aggregator = new ListAggregator();

        aggregator.helper(list);

        int distinct = aggregator.distinct(list,new MyDeduplicatorStub());

        Assertions.assertEquals(3, distinct);
    }
}
