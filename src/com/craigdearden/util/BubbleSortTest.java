
package com.craigdearden.util;

import java.util.ArrayList;


public class BubbleSortTest
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
