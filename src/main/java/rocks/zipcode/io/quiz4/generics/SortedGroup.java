package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> {


    @Override
    public void insert(T value) {
        super.insert(value);
    }

    @Override
    public void delete(T value) {
        super.delete(value);
    }

    public Integer indexOf(T value) {
        Set<T> set = new TreeSet<>();
        set.addAll(super.getList());
        super.getList().clear();
        super.getList().addAll(set);

        return super.getList().indexOf(value);
    }

}
