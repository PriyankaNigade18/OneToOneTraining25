package com.JavaBasics;

public class OpeartorDemo 
{
		
	public static void main(String args[])
	{
		int a=20,b=10;
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
		
		/*
		 * Unary operators
		 * Increment(++)    Decrement (--)
		 * post increment   post Decrement
		 * a++	 a=a+1				a--   a=a-1
		 * pre Increment    pre Decrement 
		 * ++a					--a
		 */
		
		int x=100;
		System.out.println(x);//100
		System.out.println(x++);//100
		System.out.println(x);//101
		
		
		int y=200;
		System.out.println(y);//200
		System.out.println(++y);//201
		
		
		int c=90;
		System.out.println(c);//90
		System.out.println(c--);//90
		System.out.println(c);//89
		
		System.out.println(--c);//88
		
		
		int p=80;
		int q=p++;
		System.out.println(p);//81
		System.out.println(q);//80

		int i=890;
		int j=i++;
		System.out.println(j);//890
		System.out.println(i);//891
		
		int d=78;
		int e=++d;
		System.out.println(d);//79
		System.out.println(e);//79
		
		int k=56;
		int l=k--;
		System.out.println(l);//56
		System.out.println(k);//55
		
		int u=900;
		int v=--u;
		System.out.println(u);//899
		System.out.println(v);//899
		
		System.out.println("*******Relational Operator*******");
		/*
		 * p=81 q=80 l=56 k=55 u=v=899 e=d=79
		 */
		
		System.out.println("Less than <: "+(l<d));//true
		System.out.println("greater than >: "+(e>l));//true
		System.out.println("less than equal to: <=: "+(q<=p));//true
		System.out.println(e<=d);//true
		System.out.println("greater than equal to: >=:"+(l>=k));//true
		System.out.println(e>=u);//false
		System.out.println("Equal to(Comaparison operator) == : "+(e==d));//true
		System.out.println(u==v);//true
		System.out.println(p==q);//false
		System.out.println(p!=q);//true
		
		System.out.println("*******Logical Operator*******");

		/*
		 *  c1   	c2        c1&&(AND)c2   c1||(OR)c2   !(NOT)c1!
		 * true   	true		true		true			false
		 * true 	false		false		true			false
		 * false 	true		false		true			true			
		 * false 	false		false		false			true
		 * 
		 * 
		 */
		
		System.out.println((u==v) && (l>k));//true
		System.out.println((p==q) && (e==d));//false
		System.out.println((p!=q) && (e>v));//false
		System.out.println((p==q) && (e>u));//false
		
		System.out.println((u==v) || (l>k));//true
		System.out.println((p==q) || (e==d));//true
		System.out.println((p!=q) || (e>v));//true
		System.out.println((p==q) || (e>u));//false
		
		//Not
		System.out.println(p>e);//true
		System.out.println(!(p>e));//false
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
