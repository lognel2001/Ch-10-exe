package logan3.ch10.classexamples;

public class Knight {
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		if ((myName != null) && (myName.length() > 0))
		{
		this.myName = myName;
		}
	}

	// everyone knows your name!
    public String myName = "Sir Jousts-a-Lot";

    // nobody else needs to know this
    public String horseNickname = "Stinker";

    // knights and anyone else inheriting from this class  
    // will have a skill level
    public int skillLevel = 100;

    // anyone can wake you up, whether you like it or not!
    public void wakeUp()
    {
    }

    // only you can tell if you are hungry!
    public boolean isHungry()
    {
       return true;      // jousting is hard work
    }

    // knights and anyone else inheriting from this class have  
    // the ability to put on armor
    public void donArmor()
    {
    }
}

