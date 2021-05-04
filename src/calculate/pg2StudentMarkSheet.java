package calculate;

import java.util.Scanner;
//2. Re write the student mark sheet programme using if else and while loop
/*
 _______________________________
|                               |
| Mark Sheet                    |
|_______________________________|
| Name : Jay                    |
| Roll No: 08                   |
|_______________________________|
| Subjects : Marks              |
|_______________________________|
| Math : 98                     |
| Science : 90                  |
| English : 85                  |
|_______________________________|
| Total : 273                   |
|_______________________________|
| Percentage : 91.0             |
| Result : Pass                 |
| Grade : A+                    |
|_______________________________|

 */
public class pg2StudentMarkSheet {
    public void mark()
    {
        int RollNo;
        int Math;
        int Science;
        int English;
        int Total=0;
        float Percentage;
        boolean Result;
        char Grade;

        System.out.println(" -----------------------------------");
        System.out.println("|                                   |");
        System.out.println("| Mark Sheet                        |");
        System.out.println("|___________________________________|");
        Scanner scan = new Scanner(System.in);
        System.out.println("|Enter your Name:                   |");
        String name = scan.next();
        System.out.println("|Enter your Roll No:                |");
        RollNo = scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("| Subjects : Mark                   |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter mark of Math :               |");
        Math = scan.nextInt();
        System.out.println("|Enter mark of Science :            |");
        Science=scan.nextInt();
        System.out.println("|Enter mark of  English :           |");
        English=scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("|Enter your Total :                 |");
        Total=Math+Science+English;
        System.out.println(Total);
        System.out.println("|___________________________________|");
        System.out.println("| Percentage :                      |");
        Percentage=Total/3;
        System.out.println(Percentage);
        System.out.println("| Result :                          |");
        while(Percentage>45) {
            System.out.println("Pass");
            break;
        }
         while (Percentage < 45)
        {
            System.out.println("Fail");
            break;
        }
        while (Percentage<35)
        {
            System.out.println("Try next time");
            break;
        }
        System.out.println("| Grade :                           |");
        if (Percentage>90){
            System.out.println(" A+ ");
        }
        else if(Percentage>85)
        {
            System.out.println(" A ");
        }
        else if((Percentage<85)&&(Percentage>75))
        {
            System.out.println(" B ");
        }
         else if ((Percentage>50)&&(Percentage<75))
        {
            System.out.println(" C ");
        }
       else if ((Percentage>35)&&(Percentage<45))
        {
            System.out.println(" D");
        }
       else
            System.out.println("Fail");
        System.out.println("|___________________________________|");
    }
}
