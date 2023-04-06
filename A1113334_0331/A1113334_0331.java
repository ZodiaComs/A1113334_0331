import java.util.Scanner;

class animal
{
    String name;
    double height;
    int weight;
    int speed;
    double x;
    double y;
    int z;

    animal(String name, double height, int weight, int speed)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    Scanner sc = new Scanner(System.in);

    double distance()
    {
        System.out.println("enter time (minute) and acceleration = ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        x = x * this.speed * y ;
        System.out.println("distance = " + x + "\n");
        return x;
    }

    int distance2()
    {
        System.out.println("enter only time (minute) = ");
        z = sc.nextInt();

        if (z == 0)
        {
            System.out.println("no \n");
        }

        else
        {
        z = z * this.speed;
        System.out.println("distance (only time) = " + z + "\n");
        }
        return z;
    }

    double distance3()
    {
        System.out.println("(elsa = x2) enter time (minute) and acceleration = ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        x = x * this.speed * y * 2;
        System.out.println("distance = " + x + "\n");
        return x;
    }

    int distance4()
    {
        System.out.println("(elsa = x2) enter only time (minute) = ");
        z = sc.nextInt();

        if (z == 0)
        {
            System.out.println("cannot be processed. \n");
        }

        else
        {
        z = z * this.speed * 2;
        System.out.println("distance (only time) = " + z + "\n");
        }
        return z;
    }

}

public class A1113334_0331 
{
    public static void ShowInfo()
    {
        System.out.println("welcome to the frozen system! \n");
    }
    
    public static void main (String [] args)
    {
        A1113334_0331.ShowInfo();

        snow h1 = new snow("olaf", 1.1, 52, "X", false, 100);
        System.out.println("name: " + h1.name + "\t" + "height: " + h1.height + "\t" + "weight: " + h1.weight + "\t" + "gender: " + h1.gender + "\t" + "ice power: " + h1.frost + "\t" + "speed: " + h1.speed);
        h1.distance();
        h1.distance2();

        snow h2 = new snow("sven", 1.5, 99, "X", false, 200);
        System.out.println("name: " + h2.name + "\t" + "height: " + h2.height + "\t" + "weight: " + h2.weight + "\t" + "gender: " + h2.gender + "\t" + "ice power: " + h2.frost + "\t" + "speed: " + h2.speed);
        h2.distance();
        h2.distance2();
        
        snow h3 = new snow("hans", 1.9, 80, "male", false, 150);
        System.out.println("name: " + h3.name + "\t" + "height: " + h3.height + "\t" + "weight: " + h3.weight + "\t" + "gender: " + h3.gender + "\t" + "ice power: " + h3.frost + "\t" + "speed: " + h3.speed);
        h3.distance();
        h3.distance2();

        snow h4 = new snow("kristoff", 1.8, 78, "male", false, 130);
        System.out.println("name: " + h4.name + "\t" + "height: " + h4.height + "\t" + "weight: " + h4.weight + "\t" + "gender: " + h4.gender + "\t" + "ice power: " + h4.frost + "\t" + "speed: " + h4.speed);
        h4.distance();
        h4.distance2();

        snow h5 = new snow("anna", 1.7, 48, "female", false, 120);
        System.out.println("name: " + h5.name + "\t" + "height: " + h5.height + "\t" + "weight: " + h5.weight + "\t" + "gender: " + h5.gender + "\t" + "ice power: " + h5.frost + "\t" + "speed: " + h5.speed);
        h5.distance();
        h5.distance2();

        snow h6 = new snow("elsa", 1.7, 50, "female", true, 120);
        System.out.println("name: " + h6.name + "\t" + "height: " + h6.height + "\t" + "weight: " + h6.weight + "\t" + "gender: " + h6.gender + "\t" + "ice power: " + h6.frost + "\t\t" + "speed: " + h6.speed);
        h6.distance3();
        h6.distance4();
    }
}
