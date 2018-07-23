package com.gw.utils;


import java.util.Arrays;

public class ArrayList<E> implements List<E> {
    //默认容量
    private static final int DEFAULT_CAPACITY = 10;
    //实际元素大小，默认为0
    private int size;
    //空数组对象
    private static final Object [] EMPTY_ELEMENTDATA = {};
    //缺省的空数组对象，与EMPTY_ELEMENTDATA数组的区别在于当第一个元素被加入进来的时候它知道如何扩张，可见于add(E e)方法中
    private static final Object [] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    //元素数组，transient修饰后不进行序列化
    transient Object [] elementData;
    //数组最大大小
    //为什么减8：由于一些java虚拟机会存储一些头部信息在数组之中，为了减少内存溢出的几率，所以减了8
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public ArrayList(){
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    public ArrayList(int initCapacity){
        if(initCapacity > 0 ){
            this.elementData = new Object[initCapacity];
        }else if(initCapacity == 0){
            this.elementData = EMPTY_ELEMENTDATA;
        }else{
            throw new IllegalArgumentException("非法的初始空间");
        }
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean clear() {
        return false;
    }

    public boolean contains(E e) {
        return false;
    }
    //向末尾添加元素
    public boolean add(E e) {
        //确保数组容量足够
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;
        return true;
    }
    //确保数组容量足够
    private void ensureCapacityInternal(int minCapacity){
        //当数组被扩容后，elementData所指向的数组引用不再是DEFAULTCAPACITY_EMPTY_ELEMENTDATA
        if(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA){
            minCapacity = Math.max(DEFAULT_CAPACITY,minCapacity);
        }
        //确定明确的数组容量
        ensureExplicitCapacity(minCapacity);
    }
    //确认实际的容量，上面只是将minCapacity=10，这个方法就是真正的判断elementData是否够用
    private void ensureExplicitCapacity(int minCapacity){
        //minCapacity如果大于了实际elementData的长度，那么就说明elementData数组的长度不够用，不够用那么就要增加elementData的length。这里有的同学就会模糊minCapacity到底是什么呢，这里给你们分析一下

        /*第一种情况：由于elementData初始化时是空的数组，那么第一次add的时候，minCapacity=size+1；也就minCapacity=1，在上一个方法(确定内部容量ensureCapacityInternal)就会判断出是空的数组，就会给
        　将minCapacity=10，到这一步为止，还没有改变elementData的大小。
        　第二种情况：elementData不是空的数组了，那么在add的时候，minCapacity=size+1；也就是minCapacity代表着elementData中增加之后的实际数据个数，拿着它判断elementData的length是否够用，如果length
          不够用，那么肯定要扩大容量，不然增加的这个元素就会溢出。
        */
        if(minCapacity - elementData.length > 0){
            grow(minCapacity);
        }
    }
    //扩展数组的核心方法
    private void grow(int minCapacity){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);//变为原来的1.5倍
        //此种情况是数组为空时，oldCapacity=0,newCapacity=0时，数组大小便为默认大小10
        if(newCapacity - minCapacity < 0){
            newCapacity = minCapacity;
        }
        if(newCapacity - MAX_ARRAY_SIZE > 0){
            newCapacity = hugeCapacity(minCapacity);
        }
        //此处返回的数组是一个新的数组，与DEFAULTCAPACITY_EMPTY_ELEMENTDATA的地址不同
        elementData = Arrays.copyOf(elementData,newCapacity);
    }
    //确定数组最大容量
    private int hugeCapacity(int minCapacity){
        if(minCapacity < 0){
            throw new OutOfMemoryError();
        }
        return (minCapacity > Integer.MAX_VALUE)?Integer.MAX_VALUE:MAX_ARRAY_SIZE;
    }

    public boolean remove(E e) {
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public E set(int index, E e) {
        rangeCheck(index);
        E oldValue = (E)elementData[index];
        elementData[index] = e;
        return oldValue;
    }

    public E get(int index) {
        rangeCheck(index);
        return (E)elementData[index];
    }
    //将元素添加到指定位置
    public void add(int index, E e) {
        rangeCheckForAdd(index);
        ensureCapacityInternal(size+1);
        //arraycopy为浅拷贝，第一个参数为源数组，第二个参数为源数组要复制的起始位置，第三个参数为目的数组，第四个参数为目的数组放置的起始位置，第五个参数为要复制的长度。
        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index] = e;
        size++;
    }
    private void rangeCheck(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
    }
    //插入时检查，如果插入位置大于数组实际元素个数或者插入位置小于0，抛出数组越界异常
    private void rangeCheckForAdd(int index){
        if(size<index || index < 0){
            throw new IndexOutOfBoundsException();
        }
    }

    public void remove(int index, E e) {

    }
}
