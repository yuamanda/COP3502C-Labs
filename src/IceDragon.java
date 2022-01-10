public class IceDragon extends Dragon
{
    private String name;
    private String image;

    // constructor, creates a new iceDragon object with a given name and image
    public IceDragon(String name, String image)
    {
        super(name, image);
    }

    // for the iceDragon type, this method should always return false
    public boolean canBreatheFire()
    {
        System.out.println("This dragon cannot breathe fire.");
        return false;
    }
}
