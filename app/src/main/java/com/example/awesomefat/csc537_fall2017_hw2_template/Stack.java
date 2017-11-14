package com.example.awesomefat.csc537_fall2017_hw2_template;


public class Stack
{
    private int[] a;
    private int top,m;
    public Stack(int max)
    {
        m=max;
        a=new int[m];
        top=-1;
    }
    public void push(int key)
    {
        a[++top]=key;
    }
    public int pop()
    {
        return(a[top--]);
    }
}