
package amen.s.data.structure;


public class AmenSDataStructure {

   
    public static void main(String[] args) {
       ArrayLista <Integer> a = new ArrayLista ();
       ArrayLista <Integer> a1 = new ArrayLista ();
       a.add(5);
       a.add(6);
       a.add(7);
       a.add(8);
       a1.add(5);
       a1.add(6);
       a1.add(7);
       a1.add(8);
       a.removeAll(a1);
        System.out.println(a);
    }
    
}
