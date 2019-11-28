package se.lexicon.skovde.models;

public class MyList<T> {// stat of ArrayList in the making

    private T[] list = (T[])new Object[10];
    private int indexCounter = 0;

    public void add(T item)
    {
        list[indexCounter++] = item;
    }

    //..
}
