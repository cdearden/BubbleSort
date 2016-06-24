/* Author:      Craig Dearden
 * Date:        Jun 23, 2016
 * Name:        BubbleSort.java
 * Description: 
 */


package com.craigdearden.util;

import java.util.ArrayList;

public class BubbleSort<T extends Comparable<T>> {
    private ArrayList<T> sortedList;

    public BubbleSort() {
        sortedList = new ArrayList();
    }
    
    BubbleSort(ArrayList<T> list) {
        sortedList = sort(list);
    }
    
    public void add(ArrayList<T> toadd) {
        sortedList.addAll(toadd);
        sortedList = sort(sortedList);
    }
    
    public <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> list) {
        boolean sorted = false;
        int numSwaps = 0;
        
        while(!sorted) {
            for(int i = 0; i < (list.size() - 1); i++) {
                if(list.get(i).compareTo(list.get(i+1)) > 0) {
                    list = swap(list,i,i+1);
                    numSwaps++;
                }
            }
            
            if(numSwaps == 0)
                sorted = true;
            
            numSwaps = 0; 
        }
        
        return list;
    }
    
    private <T extends Comparable<T>> ArrayList<T> swap(ArrayList<T> list, int first, int second) {
        T temporary = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temporary);
        
        return list;
    }
    
    public void print() {
        for(T element : sortedList) 
            System.out.printf("%s ", element);
    }
    
}
