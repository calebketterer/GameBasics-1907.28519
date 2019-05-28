

//Armor Properties


public class Armor extends Main {

    private String SuitName;
    private String ArmorType;
    private int RankReq;
    private int BuyCost;
    private int SellWorth;
    private int ArmorWeight;
    private String ProtType;
    private int ProtValue;  //Negates a percent of Damage Dealt


    Armor (String SuitName, String ArmorType, int RankReq, int BuyCost, int SellWorth, int ArmorWeight, String ProtType, int ProtValue){

        this.SuitName = (SuitName);
        this.ArmorType = (ArmorType);
        this.RankReq = (RankReq);
        this.ArmorWeight = (ArmorWeight);
        this.BuyCost = (BuyCost);
        this.SellWorth = (SellWorth);
        this.ProtType = (ProtType);
        this.ProtValue = (ProtValue);


        }

    private String getSuitName() { return SuitName; }
    private String getArmorType() { return ArmorType; }
    private String getRankReq() { if (RankReq == 0) {return "None";} else return RankReq + " levels"; }
    private int getArmorWeight() { return ArmorWeight; }
    private int getBuyCost() { return BuyCost; }
    private int getSellWorth() { return SellWorth; }
    private String getProtType() { return ProtType; }
    private int getProtValue() { return ProtValue; }

    @Override
        public String toString()
        {
            return "Armor Name: " + this.getSuitName() + " " + this.getArmorType() +
                    "\n" +
                    "\n\tRank Requirement: " + this.getRankReq() +
                    "\n\tCost to Buy: " + this.getBuyCost() + " dollars" +
                    "\n\tSelling Worth: " + this.getSellWorth() + " dollars" +
                    "\n\tArmor Weight: " + this.getArmorWeight() + " kilograms" +
                    "\n\tType of Protection: " + this.getProtType() +
                    "\n\tProtection Value: " + this.getProtValue() + " hp"
                    ;

        }
    }