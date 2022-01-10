public class Dragon extends Cow
{
    private String name;
    private String image;

    // constructor, creates a new dragon object with a given name and image
    public Dragon(String name, String image)
    {
        super(name);
        super.setImage(image);
    }

    // this method should exist in every dragon class
    // for the default dragon type, it should always return true
    public boolean canBreatheFire()
    {
        System.out.println("This dragon can breathe fire.");
        return true;
    }
}
