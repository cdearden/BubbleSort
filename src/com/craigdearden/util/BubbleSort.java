
package com.craigdearden.util;

import java.util.ArrayList;

/**
 * The <code>BubbleSort</code> takes in an <code>ArrayList</code> of comparable
 * objects and then sorts them via the bubble method.
 *
 * @param <T> An object which extends <code>Comparable</code>.
 */
public final class BubbleSort<T extends Comparable<T>> {

  /**
   * The list of items to sort.
   */
  private ArrayList<T> sortedList;

  public BubbleSort() {
    sortedList = new ArrayList();
  }

  /**
   * @param list a list of elements to sort.
   * @throws IllegalArgumentException if the list is null.
   */
  BubbleSort(ArrayList<T> list) throws IllegalArgumentException {
    if (list == null) {
      throw new IllegalArgumentException("List is null.");
    }

    sortedList = sort(list);
  }

  /**
   * A sort is performed each time one or more elements is added maintaining a
   * sorted list.
   *
   * @param items An <code>ArrayList</code> of items to add to the sorted
   * list.
   * @throws NullPointerException if <code>items</code> is null.
   */
  public void add(ArrayList<T> items) throws NullPointerException {
    sortedList.addAll(items);
    sortedList = sort(sortedList);
  }

  /**
   * The bubble sort algorithm which moves through the arraylist comparing the
   * current object to the next object. If the current object is larger than
   * the next object the two objects swap positions. It may take many
   * iterations through the list before it is sorted.
   *
   * @param <T> An object that extends comparable.
   * @param list The list to be sorted.
   * @return A sorted <code>ArrayList</code>.
   */
  public <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> list) {
    boolean sorted = false;
    int numSwaps = 0;

    while (!sorted) {
      for (int i = 0; i < (list.size() - 1); i++) {
        if (list.get(i).compareTo(list.get(i + 1)) > 0) {
          list = swap(list, i, i + 1);
          numSwaps++;
        }
      }

      if (numSwaps == 0) {
        sorted = true;
      }

      numSwaps = 0;
    }

    return list;
  }

  /**
   *
   * @param <T> An object that extends comparable.
   * @param list The list to be sorted.
   * @param first First element to be swapped.
   * @param second Second element to be swapped.
   * @return An <code>ArrayList</code> with the first and second elements
   * swapped.
   */
  private <T extends Comparable<T>> ArrayList<T> swap(ArrayList<T> list,
      int first, int second) {
    T temporary = list.get(first);
    list.set(first, list.get(second));
    list.set(second, temporary);

    return list;
  }

  /**
   * Prints all the elements in the {@link BubbleSort#sortedList}.
   */
  public void print() {
    sortedList.stream().forEach(s -> System.out.print(s + " "));
  }
}
