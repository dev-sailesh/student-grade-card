import java.util.Scanner;
public class GradeCard
{
	int mat,phy,che,total;
	float percent;
	String name,grade;

	public void marks()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the name of the Student :");
		name=input.nextLine();
		System.out.println("Physics Marks :");
		phy=input.nextInt();
		System.out.println("Maths Marks :");
		mat=input.nextInt();
		System.out.println("Chemistry Marks :");
		che=input.nextInt();
	}
	void total()
	{
	if(phy<35 || che<35 ||mat<35)
	{ 
		String total="F";
		String percent="F";
		grade="F";
	}
	else
	{
		if(phy<=100 && mat<=100 && che<=100)
		{
			total=phy+mat+che;
			percent=total/3;
			if(percent>=90)
			{
				grade="O";
			}
			else if(percent>=80)
			{
				grade="A+";
			}
			else if(percent>=70)
			{
				grade="A";
			}
			else if(percent>=60)
			{
				grade="B+";
			}
			else if(percent>=50)
			{
				grade="B";
			}
			else if(percent>=40)
			{
				grade="C";
			}
			else{
				grade="F";
			}
		}
		else
		{
			System.out.println("!!****  Enter Marks less than 100  ****!!");
		}
	}
			
	}

	void gradesheet()
	{
		System.out.println("*************************");
		System.out.println("   Name :"+" "+name);
		System.out.println("*******   Marks   *******");
		System.out.println("   Physics     ="+" "+phy);
		System.out.println("   Maths       ="+" "+mat);
		System.out.println("   Chemistry   ="+" "+che);
		System.out.println("*************************");
		System.out.println("   Total       ="+" "+total);
		System.out.println("*************************");
		System.out.println("   Percentage  ="+" "+percent);
		System.out.println("*************************");
		System.out.println("   Grade       ="+" "+grade);
		System.out.println("*************************");
	}

	public static void main(String[]args)
	{
		GradeCard out= new GradeCard();
		out.marks();
		out.total();
		out.gradesheet();
	}
}