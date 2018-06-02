/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.app;

import com.akhilesh.util.Subset;

/**
 *
 * @author Akhilesh
 */
public class Main {

    public static void main(String[] args) {
        int k = 14;
        int[] s = {12, 1, 61, 5, 9, 2};

//        Subset subset = new Subset();
//        for (int i : subset.subset(s, k)) {
//            System.out.println(i);
//        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 1; j < s.length-1; j++) {
                System.out.println(s[i]+","+s[j]);
            }
        }
    }
}
