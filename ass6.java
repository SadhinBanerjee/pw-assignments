1. What are the conditonal operators in java ?

ans: There are 3 types of conditional operator in java.
     i) Conditional AND
    ii) Conditional OR
   iii) Ternary operator

     (i) Conditional AND : This operator is applied between two boolean expression. It is denoted by two AND operator (&&).

    (ii) Conditional OR : This operator is applied between two boolean expression. It is denoted by two OR operator (||).

   (iii) Ternary operator : The ternary operator (? :) consist of three operands. It is used to evaluate boolean expression.

2. What are the types of operator based on the number of oprerands ?

ans: There are three types of operators based on the number of operands.
     (i) Unary Operator
    (ii) Binary Operator
   (iii) Ternary Operator

     (i) Unary Operator :- These operators take one operand and perform operation on it. 
    (ii) Binary Operator :- These operator takes two operands.
   (iii) Ternary Operator :- These operator takes three operands.

3. What is the use of SWITCH case in java programming ?

ans: The switch case is used to execute different blocks of code depending on the value of expression.
     It is more concise and efficient then if-else statement.

4. What are the priority levels of arithmetic operations in java ?

ans: In java, the priority levels of arithmetic operations are as follows :
     (i) Exponentiation
    (ii) Multiplication and Division
   (iii) Addition and Substraction

5. What are the conditional statements and use of conditional statements in java ?

ans: There are four types of conditional statements in java :
    (i) if statement : It allows us to execute a block of code only if a certain condition is true.
   (ii) if-else statement : The if-else statement allows us to execute two different blocks of code depending on whether a
                            certain condition is true or false.
  (iii) switch statement : The switch statement is used to execute different blocks of code depending on the value of an 
                           expression.

   (iv) Else-if statement : It is used to check multiple condition and execute different blocks of code depending on which 
                            condition is true.

6. What is the syntax of if-else statement in java ?

ans: The syntax of if else statement is :
    
     if (_condition_)
     {
          //code to execute if condition is true
     }
     else
     {
         //code to execute if condition is false
     }

7. What are the three types of iterative statement in java ?

ans: There are three types of iterative statements in java :
     (i) for loop : It is used to iterate over a range of values.
    (ii) while loop : The while loop used to iterate over a range of values.
   (iii) do-while loop : The do-while loop is similar to the while loop, but it always execute at least once, even if the
                         condition is false.

8. What are the difference between for loop and do-while loop ?

ans:     for loop
     
     (i) It only runs when a condition is true.
    (ii) It is a entry controlled loop.
   (iii) It is used when the number of iteration is known.

         do-while loop

    (i) It runs at least once in any condition.
   (ii) It is a exit controlled loop.
  (iii) It is used when the number of iterations is not known.

9. Write a program to print number from 1 to 10.

ans: class sadhin
     {	
	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
     }
