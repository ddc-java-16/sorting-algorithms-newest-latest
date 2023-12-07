package edu.cnm.deepdive.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class QuickSorterTest {
  Random rng;
  int[] data;
QuickSorter sorter;

@BeforeEach

void setUp() {
  rng = new Random();
  data = IntStream.generate(rng::nextInt).limit(10_000_000).toArray();
  sorter = new QuickSorter();
}
  @Test
  void sort() {
  sorter.sort(data);
  IntStream.of(data).reduce(Integer.MIN_VALUE, (a, b) -> {
    if(a > b) {
      fail();
    }
    return  b;
  });
  }
}