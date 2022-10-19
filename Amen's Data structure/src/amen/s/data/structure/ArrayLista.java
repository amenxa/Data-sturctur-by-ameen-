
package amen.s.data.structure;


public class ArrayLista <G>{
    private int size ;
    private G arr [];
    private int capacity ;
    public ArrayLista ()
    {
        this(1); 
    }
    //Expected size
    public ArrayLista (int capacity)
    {
    arr = (G[])new Object [capacity];
    this. capacity =capacity ;
     size = 0 ;
    }
    // helping methods ______________________
    // modify the capacity
   private void ModifyCapacity ()
    {
    G arr1[] =(G[])new Object [capacity*=2];
     for (int i = 0; i<size ;i++)
         arr1[i]=arr[i];
     arr = arr1 ;
   
    }
   
   // get the size 
     public int size ()
    {
     return size ;
    }
    // to shift to the right or left 
   private void shift (int index,char c)
   {
   if (c=='R')
   for (int i = size-1;i>=index;i--)
   arr[i+1]=arr[i];
   else 
     for (int i = index ;i<size-1;i++)
         arr[i]=arr[i+1];
   }
   // get elment
   public G get (int index )
    {
    return arr[index];
    }
   // set value of elment 
   public void set (int index,G value)
   {
    arr[index]=value ;
   }
           
   // adding _____________________
   // add at the back 
   public void add (G value)
    {
     if (size==capacity)
         ModifyCapacity ();
     
     arr[size++]= value ;
    }
   
    // add at the index 
   public void add (int index , G value)
   {
     if (size==capacity)
         ModifyCapacity ();
     
   }
   // add array to this array 
    public void addAll (ArrayLista a)
    {
    for (int i =0 ;i<a.size();i++)     
        this.add((G) a.get(i));
    }

   // REMOVE _____________________________________
    // remove at back 
    public void remove ()
    {
      arr[--size]=null ;
      
    }
    
    // remove at index
    public void remove (int index)
    {
      shift (index,'L');
      size -- ;
        System.out.println(index +" removed");
    }
    
    // remove all elments that in array a
    public void removeAll(ArrayLista  a)
    {
     for (int i = 0 ;i<a.size() ;i++)
     {
      for (int j = 0 ;j<size;j++)
      {
      if (a.get(i).equals(arr[j]))
         this. remove(j);
      }
     }
    }

    @Override
    public String toString() {
        String s = "";
        s+='[';
        for (int i =0 ;i<size;i++)
            s+=arr[i]+" ";
        s+=']';
        return s ;
    }
       
    
 
 
}
