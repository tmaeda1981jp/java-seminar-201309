package jp.co.jjs.seminar.s004_2.composition;

import java.util.*;

public class InstrumentedHashSet<E> extends ForwardingSet<E>{

    public InstrumentedHashSet(Set<E> s) {
        super(s);
    }

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
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>(new HashSet<String>());
        s.addAll(Arrays.asList("AAA", "BBB", "CCC"));
        System.out.println(s.getAddCount());
    }
}
