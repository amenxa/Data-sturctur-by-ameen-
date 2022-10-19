
package amen.s.data.structure;


public class ArrayLista <G>{
    private int size ;
    private G arr [];
    private int capacity ;
    public ArrayLista ()
    {
        this(0); 
    }
    //Expected size
    public ArrayLista (int capacity)
    {
    arr = (G[])new Object [capacity];
    this. capacity =capacity ;
     size = 0 ;
    }
    void ModifyCapacity ()
    {
    G arr1[] =(G[])new Object [capacity*=2];
     for (int i = 0; i<size ;i++)
         arr1[i]=arr[i];
     arr = arr1 ;
    }
    void add (G value)
    {
     if (size==capacity)
         ModifyCapacity ();
     
     arr[size++]= value ;
    }
    
}
