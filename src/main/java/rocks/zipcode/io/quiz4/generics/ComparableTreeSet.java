package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<_> {

    TreeSet tree;

    public ComparableTreeSet(_... arr) {
        tree = new TreeSet();
        tree.add(arr);
    }


    public ComparableTreeSet() {
        tree = new TreeSet();
    }
    public TreeSet getTree(){
        return this.tree;
    }

    public int compareTo(ComparableTreeSet<_> o) {

        TreeSet one = this.getTree();
        TreeSet two = o.getTree();

        if(one. equals(two)){
            return 0;
        }else{
            return -1;
        }
    }
}
