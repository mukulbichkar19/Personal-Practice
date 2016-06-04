import java.lang.*;

public class test{
	


	public static void main(String args[]){


			java.util.Scanner scan = new java.util.Scanner(System.in);
			int n = scan.nextInt();
			String[] str = new String[n];
			char[] temp = new char[1000];
			String fse="";
			String fso="";

			for(int i=0;i<n;i++){
				str[i]=scan.next();
			}
						

			for(int i=0;i<str.length;i++)
			{
				for(int j=0;j<str[i].length();j++)
				{
					temp = str[i].toCharArray();
				}
				for(int k=0;k<temp.length;k++)
				{
					if(k%2 == 0)
					{
						fse+=temp[k];
					}
					else{
						fso+=temp[k];
					}
				}
				System.out.println(fse+" "+fso);
				fse="";fso="";	
			}
			
	}

}