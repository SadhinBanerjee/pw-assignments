1. What is statically typed and dynamic typed programming languages ?

ans: Statically typed programming language are those language in which the programmer have to specify the type of data
     even before we compile the code. java, c, c++ are some programming languages which are statically typed
     programming language.

     Dynamically typed programming language is the opposite of statically typed programming language in which 
     there is no need to specify the type of data we used in programming. Programming languages like 
     python, javascript are dynamically typed programming languages.

2. What is the variable in java ?

ans: In java, Variable is the name given to the storage location. It is used to store values that can be used
     throught the program. When we declare variable we also have to define it's type by the help of which the 
     compiler know that which type of data variable is store and how much memory the variable required.	

3. How to assign a value to variable ?

ans: For assign a value to variable we use assignment operator. Here, the syntax of variable
     (data-type variableName = value;)

     data-type:- Here, we define the type of data. Ex:- int, float, char etc.
     variableName:- Here, we give a name to the variable, here we give any type of random name except the 
                    reserved word used in java. Ex:- sum, total, ram etc.
     = :- It is the assignment operator which is used to assign the value to a variable.
     value:- Here, we put the data which we given to the variable which can be used throught the program.	 

4. What are primitive data types in java ?

ans: So, data types are divided into two categories :- (1) primitive data type (2) non-primitive data type
     and there are 8 primitive data types which are :- byte, short, int, long int, float, double, char, string.
     here, byte, short, int and long data types is used to store integer type data.float and double is used to 
     store decimal numbers and lastly char and string is used to store characters. 

5. What are the identifiers in java ? 

ans: Identifiers are the name given to a package, class, interface, method or variable. All identifiers must have
     different names.

6. List the operators in java ?

ans: There are multiple types of operators in Java all are mentioned below:

     Arithmetic Operators
     Unary Operators
     Assignment Operator
     Relational Operators
     Logical Operators
     Ternary Operator
     Bitwise Operators

7. Explain the increment and decrement operators and gives an example ?

ans: The increment and decrement operators are unary operators. These operator is used to increase and decrease the value
     of integer, floating-point and character by 1. These operators can be applied in two ways: prefix and postfix.
     In the prefix form, the increment and decrement unary operators appear before the operand and in the postfix form,
     the increment and decrement unary operators appear after the operand.  
     
     example:
		class incrementdecrement
		{
			public static void main(String[] args)
			{
				int a=10;
				int b=20;
				a= a++;
				b= --b;

				System.out,println(a);
				System.out.println(b);
			}
		}


     output:
              11
              19