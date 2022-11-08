package com.testingapplication.testingapplication.controller;

import com.testingapplication.testingapplication.service.ComparisionService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ComparisionsTest {

    @Autowired
    Comparisions comparisions;

    @MockBean
    ComparisionService comparisionService;

    @Test
    void findGreaterValue() {

        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(5);
        n.add(25);
        n.add(21);
        n.add(14);

        Mockito.when(comparisionService.findGreaterValue(n)).thenReturn(25);
        assertEquals(25, comparisions.findGreaterValue(n));
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

        Mockito.when(comparisionService.findSmallerValue(n)).thenReturn(1);
        assertEquals(1, comparisions.findSmallerValue(n));
    }

    @Test
    void compare() {
        Mockito.when(comparisionService.compare(1, 2)).thenReturn("2 is greater");
        assertEquals("2 is greater", comparisions.compare(1,2));
    }
}