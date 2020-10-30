package com.company;

import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] startTime = {9,8,7,6,5,4,3,2,1};
        int [] endTime = {10,10,10,10,10,10,10,10,10};
        int queryTime = 5;
        int result=0;

        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                result++;
            }
        }

        System.out.println(result);
    }
}
