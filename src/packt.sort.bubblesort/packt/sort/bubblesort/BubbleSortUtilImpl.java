package packt.util.impl.bubblesort;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import packt.util.SortUtil;

public class BubbleSortUtilImpl implements SortUtil {

    public int getIdealMaxInputLength() {
        return 4;
    }

    public <T extends Comparable> List<T> sortList(List<T> list) {
        for (int outer = 0; outer < list.size() - 1; outer++) {
                for (int inner = 0; inner < list.size()-outer-1; inner++) {
                    if (list.get(inner).compareTo(list.get(inner + 1)) > 0)  {
                        swap(list, inner);
                    }
                }
        }
        return list;
    }

    private <T> void swap(List<T>list, int inner) {
            T temp = list.get(inner);
            list.set(inner, list.get(inner + 1));
            list.set(inner + 1, temp);
    }
}