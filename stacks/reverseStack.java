import java.util.Stack ;



public class reverseStack {
    public static void main(String[] args) {
        
    
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    
    Stack<Integer> rt = new Stack<>();
    while(st.size()>0) {
        rt.push(st.pop());
    }
    System.out.println(rt);
    Stack<Integer> temp = new Stack<>();
    while(rt.size()>0) {
        temp.push(rt.pop());
    }
    System.out.println(temp);
    while(temp.size()>0) {
        st.push(temp.pop());
    }
    System.out.println(st);
    
}
}
