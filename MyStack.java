/*
 *
 * BS-InformatiON System-2
 * Data Structure
 * MyStack.java
 */
/**
 *
 * @author:Melanie Villanueva
 */
public class MyStack {
    int stk[] = new int[10];
    int set;

    Stack() {
        set = -1;
    }

    void push (int item) {
    if ( set == 9)
        System.out.println("My Stack is full.");
    else
        stk[++set] = item;
    }

    int pop() {
    if(set < 0) {
        System.out.println("My Stack is ...");
        return 0;
    }
    else
        return stk[set--];
    }
}
