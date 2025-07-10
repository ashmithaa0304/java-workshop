package com.vetias.java;

import com.vetias.java.WordCount.Count;

public class WordCountTest {

    public WordCountTest() {
    }
    @Test
    public void testwordcount() {
    WordCount wordcount = newWordCount.Count();
     int count = WordCount.Count("this program shows" );
    Assertions.assertEquals(10); 
}
@Test
public void testAnotherString() {
    WordCount wordCount = new WordCount();
    int count = wordCount.Count("Ashmitha");
    Assertions.assertEquals(3, count);
}
}
