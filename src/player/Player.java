package player;

public class Player 
{
  String name;
  int age;

  public Player(String name)
  {
    this.name=name;
  }

  public void setPlayerDetails(String name,int age)
  {
    this.name=name;
    this.age=age;
  }

  public String getPlayerName()
  {
    return this.name;
  }
}
