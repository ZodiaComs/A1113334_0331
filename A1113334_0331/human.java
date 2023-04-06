public class human extends animal
{
    String gender;

    human(String name, double height, int weight, String gender, int speed)
    {
        super(name, height, weight, speed);
        this.gender = gender;
    }
    
}
