import org.testng.annotations.Test;

import java.io.*;
import java.util.*;
import java.lang.*;

public class stringParser
    {
        static String reverseString(String str)
        {
            //null check
            if (str == null || str.length() == 0) {
                return "";
            }

            Stack stack = new Stack();
            String[] strArray = str.split(" ");

            for (String s : strArray) {
                stack.push(s);
            }

            StringBuilder sb = new StringBuilder();
            while (!stack.empty()) {
                sb.append(stack.pop()).append(" ");
            }

            return sb.toString();

        }


        public static void main(String[] args)
        {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a string: ");
            String str = scanner.nextLine();

            System.out.print(reverseString(str));
        }
    }
