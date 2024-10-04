import java.util.*;
public class Stack1
{
	public static void main(String[] args)
	{
		String s = "34+2-";
		Stack<Integer> st = new Stack<>();
		for (Character ch : s.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				int x = ch - '0';
				st.push(x);
			}
			else if( ch == '+')
			{
				int a1 = st.pop();
				int a2 = st.pop();
				int res = a2+a1;
				st.push(res);
			}
			else if( ch == '-')
			{
				int a1 = st.pop();
				int a2 = st.pop();
				int res = a2-a1;
				st.push(res);
			}
			else if( ch == '*')
			{
				int a1 = st.pop();
				int a2 = st.pop();
				int res = a2*a1;
				st.push(res);
			}
			else if( ch == '/')
			{
				int a1 = st.pop();
				int a2 = st.pop();
				int res = a2/a1;
				st.push(res);
			}
		}
		System.out.println(st.pop());
	}
}