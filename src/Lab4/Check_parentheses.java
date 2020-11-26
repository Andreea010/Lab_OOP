package Lab4;

import java.util.Stack;

public class Check_parentheses
{

    public static boolean is_open_parenthesis( char c )
    {
        if ( c=='(' || c=='[' || c=='{' )
            return true;
        else
            return false;
    }

    public static boolean is_closed_parenthesis( char c )
    {
        if ( c==')' || c==']' || c=='}' )
            return true;
        else
            return false;
    }

    private static boolean parentheses_match( char open, char closed )
    {
        if ( open=='(' && closed==')' )
            return true;
        else if ( open=='[' && closed==']' )
            return true;
        else if ( open=='{' && closed=='}' )
            return true;
        else
            return false;
    }

    public static boolean parentheses_valid( String exp )
    {
        Stack s = new Stack();
        int i;
        char current_char;
        Character c;
        char c1;
        boolean ret=true;

        for (i=0; i < exp.length(); i++)
        {
            current_char=exp.charAt(i);
            if ( is_open_parenthesis(current_char) )
            {
                c=new Character(current_char);
                s.push( c );
            }
            else if (is_closed_parenthesis(current_char))
            {
                if (s.isEmpty())
                {
                    ret=false;
                    break;
                }
                else
                {
                    c=(Character)s.pop();
                    c1=c.charValue();
                    if (!parentheses_match(c1, current_char))
                    {
                        ret=false;
                        break;
                    }
                }
            }
        }

        if (!s.isEmpty())
            ret=false;

        return ret;
    }

    public static void main(String[] args)
    {
        String expr1 = "2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) -14";
        if (parentheses_valid(expr1))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

        String expr2 = "2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12";
        if (parentheses_valid(expr2))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

        String expr3 = "((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))";
        if (parentheses_valid(expr3))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
