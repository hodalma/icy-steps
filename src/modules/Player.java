package modules;

public abstract class Player
{
    protected int Id;
    protected int energy;
    protected int lives;
    protected boolean hasDivingSuit;
    protected Tile position;

    public int getId(){
        return Id;
    }

    public Player()
    {

    }

    public Player getPlayer()
    {
        System.out.println( this.toString() + " getPlayer was called");
        onFood();
        return this;
    }


    private void addItemToInventory(Item i)
    {
        System.out.println( this.toString() + " addItemToInventory was called with param: " + i.toString());
    }

    public void work()
    {
        System.out.println( this.toString() + " work was called");
    }

    public void turn()
    {
        System.out.println( this.toString() + " turn was called");
    }

    public void step(Tile t)
    {
        System.out.println( this.toString() + " step was called with param: " + t.toString());
        t.onPlayerStep(this);
    }

    public void pass()
    {
        System.out.println( this.toString() + " pass was called");
    }

    public void pickUpItem()
    {
        System.out.println( this.toString() + " pickUpItem was called");
        addItemToInventory(position.item);

    }

    public void useItem(Item i)
    {
        System.out.println( this.toString() + " useItem was called with param: " + i.toString());
    }

    public void useAbility(Tile t)
    {
        System.out.println( this.toString() + " useAbility was called with param: " + t.toString());
    }

    public void onStorm()
    {
        System.out.println( this.toString() + " onStorm was called");
    }

    public void onFood()
    {
        System.out.println( this.toString() + " onFood was called");
    }

    public void onHole()
    {
        System.out.println( this.toString() + " onHole was called");
    }

    public void getPulledTo(Tile t)
    {
        System.out.println( this.toString() + " getPulledTo was called with param: " + t.toString());
        t.onPlayerStep(this);
    }

    public void clearSnow()
    {
        System.out.println( this.toString() + " clearSnow was called");
    }

    public void setDivingSuit()
    {
        System.out.println( this.toString() + " setDivingSuit was called");
    }


}