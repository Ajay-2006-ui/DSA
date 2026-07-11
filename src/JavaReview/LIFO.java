package JavaReview;

public class LIFO {
    int size=10,top=-1;
    int [] stack=new int[size];
    void push(int x){
        if(top==size-1){
            System.out.println("the stack is overflowed");
            return;
        }
        stack[++top]=x;

    }
    int pop(){
        if(top==-1){
            System.out.println("the stack is empty");
            return -1;
        }
        System.out.println("the popped element is : " +stack[top]);
        return stack[top--];
    }
    void peek(){
        if(top==-1){
            System.out.println("the stack is empty");
        }
        System.out.println("The top element is:" + stack[top-1]);
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]+ " ");

        }
    }
    int CountEven(){
        int count=0;
        if(top==-1){
            System.out.println("the stack is empty");
            return 0;
        }
        for(int i=0;i<=top;i++){
            if(stack[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        LIFO st=new LIFO();
        st.push(20);
        st.push(40);
        st.push(60);
        st.push(89);
        st.push(56);

        st.display();
        System.out.println(st.CountEven());

    }
}
