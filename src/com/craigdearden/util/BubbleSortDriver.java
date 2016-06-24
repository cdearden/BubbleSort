/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.craigdearden.util;

import java.util.ArrayList;

/**
 *
 * @author C1
 */
public class BubbleSortDriver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] intArr = {2,7,73,43,9,6,2,1,5,3,8,3,3,6,8,34,21,1,5,};
        String[] stringArr = {"afsgdasdg", "is", "This"};
        ArrayList<Integer> ial = new ArrayList<>();
        ArrayList<String> sal = new ArrayList<>();
        
        for(int i = 0; i < intArr.length; i++)
            ial.add(intArr[i]);
        
        for(int i = 0; i < stringArr.length; i++)
            sal.add(stringArr[i]);
            
        
        BubbleSort intSort = new BubbleSort(ial);
        BubbleSort stringSort = new BubbleSort(sal);
        intSort.print();
        stringSort.print();
    }
    
}
