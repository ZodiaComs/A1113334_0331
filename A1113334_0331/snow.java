public class snow extends human 
{
    boolean frost;

    snow(String name, double height, int weight, String gender, boolean frost, int speed)
    {
        super(name, height, weight, gender, speed);
        this.frost = frost;
    }
}
