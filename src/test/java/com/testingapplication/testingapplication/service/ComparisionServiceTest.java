package com.testingapplication.testingapplication.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class ComparisionServiceTest {

    @Autowired
    ComparisionService comparisionService;

    @Test
    void findGreaterValue() {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(5);
        n.add(15);
        n.add(21);
        n.add(14);

        assertEquals(21, comparisionService.findGreaterValue(n));
    }

    @Test
    void findSmallerValue() {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(5);
        n.add(15);
        n.add(21);
        n.add(14);
        assertEquals(1, comparisionService.findSmallerValue(n));
    }

    @Test
    void compare() {
        assertEquals("2 is greater", comparisionService.compare(1,2));
        assertEquals("3 is greater", comparisionService.compare(3,2));
        assertEquals("10 is greater", comparisionService.compare(10,5));
        assertEquals("Both are equal", comparisionService.compare(20,20));
    }
}