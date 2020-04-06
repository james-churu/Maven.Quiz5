package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    List<_> group;

    List<_> groupUnsorted;


    @Override
    public void insert(_ value) {
        group = new ArrayList<>();
        groupUnsorted = new ArrayList<>();

        groupUnsorted.add(value);
        Arrays.sort(groupUnsorted.toArray());
        group = groupUnsorted;
    }

    @Override
    public void delete(_ value) {
        group.remove(value);
    }

    public Integer indexOf(_ value) {
        List<_> listy =  new ArrayList<>();


        Integer ans = 0;
        for(int x = 0; x <= listy.size(); x++){
            if(listy.get(x).equals(value)){
                ans = x;
                break;
            }
        }
        return ans;
    }
}
