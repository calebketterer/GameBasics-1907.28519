

//All Weapon Properties


public class Weapon extends Main {

    Weapon() { }

    private String WeaponName;
    private String DMGType;
    private String WeaponType;
    private String pMatType;
    private String sMatType;
    private int RankReq;
    private int WeaponWeight;
    private double WeaponDMG;
    private double WeaponAPM;

    double DPS;

    Weapon(String WeaponName, String DMGType, String WeaponType, String pMatType, String sMatType, int RankReq, int WeaponWeight, double WeaponDMG, double WeaponAPM) {
        this.WeaponName = WeaponName;
        this.DMGType = DMGType;
        this.WeaponType = WeaponType;
        this.pMatType = pMatType;
        this.sMatType = sMatType;
        this.RankReq = RankReq;
        this.WeaponWeight = WeaponWeight;
        this.WeaponDMG = WeaponDMG;
        this.WeaponAPM = WeaponAPM;

        DPS = WeaponDMG * WeaponAPM / 60;

    }

    String getWeaponName() { return WeaponName; }
    String getDMGType() { return DMGType; }
    String getWeaponType() { return WeaponType; }
    String getpMatType() { return pMatType; }
    String getsMatType() { return sMatType; }
    int getRankReqNo() { return RankReq; }
    String getRankReq() { if (RankReq == 0) {return "None";} else return RankReq + " levels"; }
    String getWeaponWeight() { if (WeaponWeight == 0) {return "nothing";} else return WeaponWeight + " kilograms"; }
    double getWeaponDMG() { return WeaponDMG; }
    double getWeaponAPM() { return WeaponAPM; }
    double getDPS() { return DPS; }

    void setWeaponName(String weaponName) { WeaponName = weaponName; }
    void setDMGType(String DMGType) { this.DMGType = DMGType; }
    void setWeaponType(String weaponType) { WeaponType = weaponType; }
    void setpMatType(String pMatType) { this.pMatType = pMatType; }
    void setsMatType(String sMatType) { this.sMatType = sMatType; }
    void setRankReq(int rankReq) { RankReq = rankReq; }
    void setWeaponWeight(int weaponWeight) { WeaponWeight = weaponWeight; }
    void setWeaponDMG(int weaponDMG) { WeaponDMG = weaponDMG; }
    void setWeaponAPM(int weaponAPM) { WeaponAPM = weaponAPM; }

    @Override
    public String toString()
    {
        return "Weapon Name: " + this.getWeaponName() +
                "\n" +
                "\n\tDamage Type: " + this.getDMGType() +
                "\n\tWeapon Type: " + this.getWeaponType() +
                "\n\tPrimary Material Type: " + this.getpMatType() +
                "\n\tSecondary Material Type: " + this.getsMatType() +
                "\n\tRank Requirements: " + this.getRankReq() +
                "\n\tWeight: " + this.getWeaponWeight() + " kilograms" +
                "\n\tDamage: " + this.getWeaponDMG() + " hp per attack" +
                "\n\tRate of Attack: " + this.getWeaponAPM() + " attacks per minute" +
                "\n" +
                "\n\tDamage per Second: " + this.getDPS()

                ;

    }
    public String getSummary() {

        if (obj instanceof Gun) { }
        if (getsMatType() == "None") {
            if (getpMatType() == "None") {

                return this.getWeaponName() +
                        " is a " + this.getDMGType() +
                        " " + this.getWeaponType() + " requiring a rank of " + this.getRankReqNo() + " or greater. " +
                        "\nIt weighs " + this.getWeaponWeight() + ", " +
                        "deals " + this.getWeaponDMG() + " hp per attack, " +
                        "and attacks " + this.getWeaponAPM() + " times per minute." +
                        "\nThis averages out to " + this.getDPS() + " hp per second.";
            }
            else {

                return this.getWeaponName() +
                        " is a " + this.getDMGType() +
                        " " + this.getWeaponType() +
                        " made of " + this.getpMatType() +
                        " requiring a rank of " + this.getRankReqNo() + " or greater. " +
                        "\nIt weighs " + this.getWeaponWeight() + ", " +
                        "deals " + this.getWeaponDMG() + " hp per attack, " +
                        "and attacks " + this.getWeaponAPM() + " times per minute." +
                        "\nThis averages out to " + this.getDPS() + " hp per second.";
            }
        }
        else {

            return this.getWeaponName() +
                    " is a " + this.getDMGType() +
                    " " + this.getWeaponType() +
                    " made of " + this.getpMatType() +
                    " and " + this.getsMatType() +
                    " requiring a rank of " + this.getRankReqNo() + " or greater. " +
                    "\nIt weighs " + this.getWeaponWeight() + ", " +
                    "deals " + this.getWeaponDMG() + " hp per attack, " +
                    "and attacks " + this.getWeaponAPM() + " times per minute." +
                    "\nThis averages out to " + this.getDPS() + " hp per second.";
        }
    }
}

/*

//BaseDPS = GunRPM*GunDMG/60

DMG Types:
    Physical, Impact        Rep: (Gray)     Weak Against: Carbon Fiber, Metal       Strong Against: Glass, Rubber, Plastic
    Thermal,  Burning       Rep: (Red)      Weak Against: Carbon Fiber, Metal       Strong Against: Glass, Rubber, Plastic
    Chemical, Decay         Rep: (Green)
    Electric, Stun          Rep: (Blue)
    Magic                   Rep: (Purple)

*/