public class Cow
{
    // declare and initialize variables
    private String name;
    private String image;

    // only constructor for this class
    public Cow(String name)
    {
        this.name = name;
    }

    // returns the name of the cow
    public String getName()
    {
        return this.name;
    }

    // returns the image used to display the cow (after the message)
    public String getImage()
    {
        return this.image;
    }

    // sets the image used to display the cow (after the message)
    public void setImage(String image)
    {
        this.image = image;
    }
}
