

//Blade Properties


public class Blade extends Weapon {

    private double BladeLength;

    public Blade (String BladeName, String DMGType, String BladeType, int RankReq, int BladeWeight, int BladeDMG, int BladeAPM, int BladeLength){

        setWeaponName(BladeName);
        setDMGType(DMGType);
        setWeaponType(BladeType);
        setRankReq(RankReq);
        setWeaponWeight(BladeWeight);
        setWeaponDMG(BladeDMG);
        setWeaponAPM(BladeAPM);

        this.BladeLength = BladeLength;

        DPS = BladeDMG * BladeAPM/60;

    }

    private double getBladeLength() { return BladeLength; }

    @Override
    public String toString()
    {
        return "Gun Name: " + this.getWeaponName() +
                "\n" +
                "\n\tDamage Type: " + this.getDMGType() +
                "\n\tBlade Type: " + this.getWeaponType() +
                "\n\tRank Requirements: " + this.getRankReq() +
                "\n\tWeight: " + this.getWeaponWeight() + " kilograms" +
                "\n\tDamage: " + this.getWeaponDMG() + " hp per hit" +
                "\n\tRate of Attack: " + this.getWeaponAPM() + " swings a minute" +
                "\n\tLength of Blade: " + this.getBladeLength() + " centimeters" +
                "\n" +
                "\n\tDamage per Second: " + this.getDPS()

                ;

    }
}
