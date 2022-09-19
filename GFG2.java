


import java.io.*;

class GFG2{

static String removeOuterParentheses(String S)
{

String res = "" ;

int count = 0 ;

for ( int c = 0 ;
c < S.length(); c++)
{

if (S.charAt(c) == '(' &&
count++ > 0 )

res += S.charAt(c);

if (S.charAt(c) == ')' &&
count-- > 1 )

res += S.charAt(c);
}

return res;
}

public static void main(String[] args)
{
String S = "(()())(())()" ;
System.out.print(removeOuterParentheses(S));
}
}

