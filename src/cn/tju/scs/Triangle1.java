package cn.tju.scs;

public class Triangle1 {
	public boolean istriangle(int a,int b,int c){
		 if(a+b>c&&a+c>b&&b+c>a){
		     return true;
		     }
		 else
		     return false;
		}

		public String form(int a ,int b, int c){
		       if(istriangle(a,b,c)){
		           if(a==b&&b==c){
		            return "equilateral";
		            }
		           else if((a==b)||(a==c)||(b==c)){         
		             return "isosceles";
		}
		         else
		          return "scalene";
		}
		else 
		           return "not a triangle";
		}

}
