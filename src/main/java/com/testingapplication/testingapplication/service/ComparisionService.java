package com.testingapplication.testingapplication.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComparisionService {

    public int findGreaterValue(List<Integer> numbers){
        int greaterValue = 0;
        for(int n : numbers){
            if(n > greaterValue){
                greaterValue = n;
            }
        }
        return greaterValue;
    }


    public int findSmallerValue(List<Integer> numbers){
        int smallerValue = Integer.MAX_VALUE;
        for(int n : numbers){
            if(n < smallerValue){
                smallerValue = n;
            }
        }
        return smallerValue;
    }


    public String compare(int a, int b){
        if(a > b){
            return a+" is greater";
        }else if (b > a){
            return b+" is greater";
        }else {
            return "Both are equal";
        }
    }
}
