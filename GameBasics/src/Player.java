

//Player Properties


public class Player extends Main {

    //public Player() {} //Default Constructor

    final private static double dMaxHealth = 100,
    dMaxMovement = 1.5, //in m/s
    dCarryCap = 15, //when fWeight = MaxCarryCap, fMovement = 0% .idealCarryCap = MaxCarryCap/2, is where fMovement = 100%,
    dWeight = 0,
    dArmor = 0,
    dDMGReceived = 0,
    dRegenRate = 1,
    dValue = 0,
    dBal = 0
    ;

    private double fHealth, fMovement, fWeight, fArmor;             //final or actual values
    private double MaxHealth, MaxMovement, MaxCarryCap;              //Max values after modding without taking away other variables
    private int HealthModLevel, MovementModLevel, CarryCapModLevel, RankNo;

    private String PlayerName, PlayerStatus;
    private double HealthMod = .25,
    MovementMod = .25,
    CarryCapMod = .25,
    WeightRatio,
    ArmorMod = 0,
    DMGRecieved = 0;


    protected Player(String PlayerName, int HealthModLevel, int MovementModLevel, int CarryCapModLevel, int Weight, int RankNo) {
        this.PlayerName = PlayerName;
        this.HealthModLevel = HealthModLevel;
        this.MovementModLevel = MovementModLevel;
        this.CarryCapModLevel = CarryCapModLevel;
        this.RankNo = RankNo;

        //Health Calculations
        HealthMod = (HealthMod * HealthModLevel);
        MaxHealth = dMaxHealth + (dMaxHealth * HealthMod);
        fHealth = MaxHealth;

        //Status Calculations
        if (fHealth <= 0){PlayerStatus = "Dead";}
        else {PlayerStatus = "Alive";}

        //Weight Calculations
        CarryCapMod = (CarryCapMod * CarryCapModLevel);
        MaxCarryCap = dCarryCap + (dCarryCap * CarryCapMod);
        fWeight = Weight;

        //Movement Calculations
        MovementMod = (MovementMod * MovementModLevel);
        MaxMovement = dMaxMovement + (dMaxMovement * MovementMod);
        fMovement = MaxMovement;

        //Decreases Player's velocity if weight is greater than idealCarryCap
        if (fWeight <= MaxCarryCap /2 && fWeight >= 0) WeightRatio = 0;
        else {
            WeightRatio = ((MaxCarryCap - fWeight) / (MaxCarryCap / 2));
            fMovement = (MaxMovement * (WeightRatio));
            if (fMovement < 0) { fMovement = 0; }
        }



    }


    private String getPlayerName() { return "Player Name: " + PlayerName; }
    private String getPlayerID() { return "Player Name: " + PlayerName + ", Rank No " + RankNo; }
    private String getPlayerStatus() { return "Status: " + PlayerStatus; }
    private double getHealthMod() { return HealthMod; }
    private double getMovementMod() { return MovementMod; }
    private double getCarryCapMod() { return CarryCapMod; }
    private double getMaxHealth() { return MaxHealth; }
    private double getMaxMovement() { return MaxMovement; }
    private double getMaxCarryCap() { return MaxCarryCap; }

    @Override
    public String toString()
    {
        return this.getPlayerID() +

                "\n" +
                "\n\t" + this.getPlayerStatus() +
                "\n" +
                "\n\tMax Health: " + this.getMaxHealth() +
                "\n\tMax Speed: " + this.getMaxMovement() + " meters per second" +
                "\n\tMax Capacity: " + this.getMaxCarryCap() + " kilograms" +
                "\n" +
                "\n\tCurrent Health: " + fHealth +
                "\n\tActual Speed: " + fMovement + " meters per second" +
                "\n\tHeld Weight: " + fWeight + " kilograms" +
                "\n" +
                "\n\tHealth Mod: " + this.getHealthMod() +
                "\n\tMovement Mod: " + this.getMovementMod() +
                "\n\tWeight Mod: " + this.getCarryCapMod()
                ;
    }

    public String getPlayerStorage(){
        return this.getPlayerName() +
                "\n" +
                "\n\tStorage Info" +
                "\n" +
                "\n\tCapacity: " + fWeight + "/" + MaxCarryCap +
                "\n\tContains: " + "...Nothing..."
                ;
    }

    public String getPlayerLevels()
    {
        return this.getPlayerName() +

                "\n" +
                "\n\tMaximum Health Level: " + HealthModLevel +
                "\n\tMovement Speed Level: " + MovementModLevel+
                "\n\tCarry Capacity Level: " + CarryCapModLevel
                ;

    }

    }
/*


        //Health Calculations
        if ((DMGReceived - Armor) <= 0) {
            Health = dMaxHealth + HealthMod;
        } else {
            Health = dMaxHealth + HealthMod - (DMGReceived - Armor);
        }


        //Movement Calculations: 1.5 m/s dwalk 3 m/s drun       force walk if weight > CarryCap, < MaxCarryCap = 2*dCarryCap


        */


