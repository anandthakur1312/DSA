package algorithms;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MergeTwoSortedList {

    public static void main(String[] args) {
    List<Integer> list1 = List.of(1,2,3,4,5,6,10);
    List<Integer> list2 = List.of(1,3,5,7,9,12,14);
    System.out.println(mergeList(list1, list2));
    }


    private static List<Integer> mergeList(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>(list1.size() + list2.size());

            int j = 0;
            int i = 0;
            while (mergedList.size() <= list1.size() + list2.size()){
                if (i>=list1.size()){
                    mergedList.addAll(list2.subList(j, list2.size()));
                    break;
                }
                if (j>=list2.size()){
                    mergedList.addAll(list1.subList(i, list1.size()));
                    break;
                }
                if (Objects.equals(list1.get(i), list2.get(j))){
                    mergedList.add(list1.get(i));
                    mergedList.add(list2.get(j));
                    j++;
                    i++;
                }
                else if(list1.get(i) < list2.get(j)){
                    mergedList.add(list1.get(i));
                    i++;
                }
                else {
                    mergedList.add(list2.get(j));
                    j++;
                }


        }
        return mergedList;

    }

}
