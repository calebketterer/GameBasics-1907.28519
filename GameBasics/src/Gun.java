

//Gun Properties


public class Gun extends Weapon {


    private int MagSize;
    private double GunRPM;
    private double ReloadS;

    private double GunRPS;
    private double MagDur;

     Gun (String GunName, String DMGType, String GunType, String pMatType, String sMatType, int RankReq, int GunWeight, int GunDMG, double GunRPM, int MagSize, double ReloadS){

        setWeaponName(GunName);
        setDMGType(DMGType);
        setWeaponType(GunType);
        setpMatType(pMatType);
        setsMatType(sMatType);
        setRankReq(RankReq);
        setWeaponWeight(GunWeight);
        setWeaponDMG(GunDMG);

        this.GunRPM = GunRPM;
        this.MagSize = MagSize;
        this.ReloadS = ReloadS;

        GunRPS = GunRPM/60;
        MagDur = MagSize/GunRPS;
        DPS = GunDMG * MagSize / ((MagSize/(GunRPS))+ReloadS);

    }

    private double getGunRPM() { return GunRPM; }
    private int getMagSize() { return MagSize; }
    private double getReloadS() { return ReloadS; }
    private double getGunRPS() { return GunRPS; }
    private double getMagDur() { return MagDur; }


    @Override
    public String toString()
    {
        return "Gun Name: " + this.getWeaponName() +
                "\n" +
                "\n\tDamage Type: " + this.getDMGType() +
                "\n\tGun Type: " + this.getWeaponType() +
                "\n\tPrimary Material: " + this.getpMatType() +
                "\n\tSecondary Material:  " + this.getsMatType() +
                "\n\tRank Requirements: " + this.getRankReq() +
                "\n\tWeight: " + this.getWeaponWeight() + " kilograms" +
                "\n\tDamage: " + this.getWeaponDMG() + " hp per bullet" +
                "\n\tRate of Fire: " + this.getGunRPM() + " rounds per minute" +
                "\n\tMagazine Size: " + this.getMagSize() + " bullets per clip" +
                "\n\tMagazine Duration: " + this.getMagDur() + " seconds per clip" +
                "\n\tReload Speed: " + this.getReloadS() + " seconds per clip" +
                "\n" +
                "\n\tAverage Damage per Second: " + this.getDPS()

                ;

    }

    public String getGunSummary() {

        if (getsMatType() == "None") {
            if (getpMatType() == "None") {

                return this.getWeaponName() +
                        " is a " + this.getDMGType() +
                        " " + this.getWeaponType() + " requiring a rank of " + this.getRankReqNo() + " or greater. " +
                        "\nIt weighs " + this.getWeaponWeight() + ", " +
                        "deals " + this.getWeaponDMG() + " hp per attack, " +
                        "and shoots " + this.getGunRPM() + " times per minute." +
                        "\nThe magazine holds " + this.getMagSize() + " rounds, " +
                        "lasts " + this.getMagDur() + " seconds, " +
                        "and takes " + this.getMagDur() + " seconds to reload. " +

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
                        "and shoots " + this.getGunRPM() + " times per minute." +
                        "\nThe magazine holds " + this.getMagSize() + " rounds, " +
                        "lasts " + this.getMagDur() + " seconds, " +
                        "and takes " + this.getMagDur() + " seconds to reload. " +

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

