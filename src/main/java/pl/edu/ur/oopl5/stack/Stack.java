package pl.edu.ur.oopl5.stack;

import java.util.EmptyStackException;   

/**
 */
public class Stack extends AbstractStack {
    private int[] stos;
    private int n=0,index=-1;
     public   Stack(int a){
       this.stos=new int[a];
    }
    @Override
    public void push(int i) {
        if((stos.length-1)>index) {
      index++; 
      n++;
      stos[index] = i;
   } else {
     throw new StackOverflowError();
     
   }
    }

    @Override
    public int pop() {
    if(!isEmpty()) {
        int i = stos[index];
        index--;
        n--;
        return i;
   } else {
     throw new EmptyStackException(); 
      
   }
}    

    @Override
    public boolean isEmpty() {
    if(index == -1)
        return true;
    else
        return false;
}   

}


