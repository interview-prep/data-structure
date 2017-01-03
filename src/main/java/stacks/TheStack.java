package stacks;

/**
 * Created by VRAMA1 on 1/2/2017.
 */
public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfTheStack = -1;

    TheStack(int size){
        stackSize =size;
        stackArray = new String[size];
    }
    public void push(String input){

        if(topOfTheStack+1 <stackSize){
            topOfTheStack++;
            stackArray[topOfTheStack] = input;

            System.out.println("Top Of Stack Now Is :" + stackArray[topOfTheStack] );
        }else {
            System.out.println("Sorry But the Stack is Full");
        }
    }

    public String pop(){
        if(topOfTheStack > 0) {
           int returnedTop =topOfTheStack;
            topOfTheStack--;
            System.out.printf("\n Element Popped :" + stackArray[returnedTop]);
            return stackArray[returnedTop];
        }else {
            return "-1";
        }
    }

    public String peek(){
        System.out.printf("\n PEEKING :" + stackArray[topOfTheStack]);
        return stackArray[topOfTheStack];
    }

    public static void main(String[] args) {
        TheStack theStack = new TheStack(10);
        theStack.push("10");
        theStack.push("20");
        theStack.push("30");
        theStack.peek();
        theStack.pop();
        theStack.pop();

        theStack.peek();

    }

}
