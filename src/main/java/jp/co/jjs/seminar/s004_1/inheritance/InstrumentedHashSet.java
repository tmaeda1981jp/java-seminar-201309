package jp.co.jjs.seminar.s004_1.inheritance;

import java.util.*;

@SuppressWarnings("serial")
public class InstrumentedHashSet<E> extends HashSet<E>{

    private int addCount = 0;
    
    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
    
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(Arrays.asList("AAA", "BBB", "CCC"));
        System.out.println(s.getAddCount());
    }
}
