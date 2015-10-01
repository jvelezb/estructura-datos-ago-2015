package semana4;

import java.util.Arrays;

public class StackDS {
    private int top;
    int size;
    int[] stack ;

    public StackDS(int arraySize){
        size=arraySize;
        stack= new int[size];
        top=-1;
    }

    public void push(int value){
        if(top==size-1){
            System.out.println("La pila esta llena no se pueden ingresar mas elementos");
        }
        else{

            top=top+1;
            stack[top]=value;
        }
    }

    public void pop(){
        if(!isEmpty())
            top=top-1;
        else{
            System.out.println("No se puede realizar pop...la pila esta vacia");
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void display(){

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }
}