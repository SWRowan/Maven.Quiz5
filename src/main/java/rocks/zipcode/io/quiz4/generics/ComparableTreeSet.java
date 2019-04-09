package rocks.zipcode.io.quiz4.generics;

import apple.laf.JRSUIUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T> implements Comparable<T> {

    private Set<T> set;


    public ComparableTreeSet(T... arr) {
        set = new TreeSet<>();
        for(T type : arr){
            set.add(type);
        }
    }

    public ComparableTreeSet() {

    }


    public int compareTo(ComparableTreeSet<T> o) {

        return 0;
    }




    public int compareTo(T o) {
        return 0;
    }

    public Set<T> getSet() {
        return set;
    }
}
