import java.util.*;
public class StackBalance
{
    public boolean isbalanced(String ss)
    {
      Stack<Character> st=new Stack<>();
      for(int i=0;i<ss.length();i++)
      { 
          
          char ch=ss.charAt(i);
          if(  ch =='{'|| ch=='[' || ch=='(')
            {
                        st.push(ch);
                        continue;
            }
          if(ch==')')
           {
                       if(st.peek()=='(')
                       st.pop();
           }
          if(ch==']')
          {
            if(st.peek()=='[')
                st.pop();                  
          }    
         if(ch=='}')
         {
          if(st.peek()=='{')
              st.pop();                 
         }
      }
      return st.empty();
    }
    public static void main(String[] args)
    {
        String ss= "{[]}";
        System.out.println(new StackBalance().isbalanced(ss));  
    }
}
