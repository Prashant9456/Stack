/*package Array2;

import java.util.EmptyStackException;

public class Stack<C> {
    private ListNode top;
    private int length;
    private class ListNode{
        private int data;//can be a generic type
        private ListNode next;//Reference to next ListNode in list
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Stack(){
        top=null;
        length=0;

    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();

        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    public class StringReverse{
        public static String reverse(String str){
            Stack<Character> stack=new Stack<>();
            char[] chars =str.toCharArray();
            for(char c:chars){
                stack.push(c);
            }
            for (int i = 0; i < str.length(); i++) {
                chars[i] =stack.pop();


            }
            return new String(chars);

        }
    }



public static void main(String[] args){
    Stack<C> stack=new Stack<C>();
    stack.push(10);
    stack.push(15);
    stack.push(20);
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    String str="ABCD";
    System.out.println("Before reverse"+str);
    System.out.println("After reverse"+reverse(str));
}
}
*/