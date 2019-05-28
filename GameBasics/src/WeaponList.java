

// List of Weapons

class WeaponList {

    //Misc
    static Weapon Punch1 = new Weapon(  "Quick Punch",  "Physical", "Human Movement","None","None", 0, 0, 5,  120);
    static Weapon Punch2 = new Weapon(  "Heavy Punch",  "Physical", "Human Movement","None","None", 0, 0, 20, 30);
    static Weapon Punch3 = new Weapon(  "Stun Chop",    "Physical", "Human Movement","None","None", 10,0, 50, 60);
    static Weapon Kick1 = new Weapon(   "Kick",         "Physical", "Human Movement","None","None", 0, 0, 10, 60);
    static Weapon Kick2 = new Weapon(   "Curb Stomp",   "Physical", "Human Movement","None","None", 0, 0, 40, 15);
    static Weapon Kick3 = new Weapon(   "Execution",    "Physical", "Human Movement","None","None", 10,0, 300,10);
    static Weapon HeadButt = new Weapon("Head Butt",    "Physical", "Human Movement","None","None", 5, 0, 90, 30);

    //Guns
    static Weapon dPistol = new Gun(    "Default Pistol",       "Physical", "Pistol", "None","None",0,  0,  20,   60, 10, 2.5 );
    static Weapon dARifle = new Gun(    "Default Assault Rifle","Physical", "Rifle",  "None","None",0,  5,  15,   120,20, 5 );
    static Weapon dHRifle = new Gun(    "Default Heavy Rifle",  "Physical", "Rifle",  "None","None",0,  15, 60,   30, 5,  5 );
    static Weapon Jupiter = new Gun(    "Jupiter",              "Electric", "Sniper", "Glass","Plastic",10, 20, 1000, 30, 5,  30 ); // Can either be 'shocking' and hit up to 5 targets or deal all damage in one bullet
    static Weapon Stripper = new Gun(   "Stripper",             "Toxic",    "Shotgun","None","None",10, 20, 150,  120,8,  4 );
    static Weapon FThrower = new Gun(   "Flame Thrower",        "Thermal",  "Gun",    "None","None",10, 20, 75,   240,40,  10 );


    /*
Guns have a primary and secondary DMG type based on initial effect and bullets loaded, having pDMGType = sDMGType does critical chance damage

Make shotguns good against low armor, bad against good armor. (Low peirce? If pierce, then armor resistance. More peirce negates armor resistance
 */

    //Blades
    static Weapon dKnife = new Blade( "Default Knife", "Physical", "Knife", 0, 0, 25, 120,25);
    static Weapon dDagger = new Blade("Default Dagger","Physical", "Dagger",0, 0, 50, 90, 15);
    static Weapon dSword = new Blade( "Default Sword", "Physical", "Sword", 0, 0, 50, 30, 90);
    static Weapon dAxe = new Blade(   "Default Axe",   "Physical", "Axe",   0, 0, 100,15,90);

    static Weapon Excalibur = new Blade (   "Excalibur",    "Physical", "Sword", 10,20,500,30, 100);           //High Impact, DMG, and mid pierce
    static Weapon KorekMachete = new Blade ("Korek's Machete","Thermal","Sword", 10,20,500,30, 100);
    static Weapon Zulfiqar = new Blade (    "Zulfiqar",     "Thermal",  "Sword", 10,20,500,30, 100);      //Explodes on impact, looks pretty, two points (double parry damage?)
    //static Weapon OPToxicBlade = new Blade ("idk","Electric", " ",   10,20,500,30, 100);
    static Weapon Durandal = new Blade (    "Durandal",     "Toxic",    "Sword", 10,20,500,30, 100);      //Med Impact, High Dmg and Pierce
    static Weapon StormBreaker = new Blade ("Storm Breaker","Electric", "Axe",   10,20,500,30, 100);


}

/*  Other Mythological Weapons:

        Harpē, (Sword, Greek Mythology where Cronus, son of Uranus, used it to castrate his father. The sword is recognizable by the curved sickle protruding near the tip of the blade. Perseus also used a harpē to decapitate Medusa.)
        Gram, (Sword forced into the tree Barnstokkr by Odin, Sigmund the Völsung pulled the sword from the tree and used it to defeat the dragon Fáfnir. Then used it to cut an anvil in half)
        Carnwennan, (Dagger which was reputed to cast its master (King Arthur )into shadow. )
        Rhongomiant, (Spear)
        Varunastra, (Created by Varuna, the god of water able to assume any shape. Made from water, the versatile weapon was said to instantly kill any inexperienced warrior who used it incorrectly.)
        Fragarach,  (Sword used by Manannán mac Lir, the guardian of the Otherworld and pilot of the boat ferrying souls to the afterlife. The sword was reputed to cut through any armor, give the user control of the winds, and force the truth out of whomever’s throat it was on.)
        Taming Sari, (Sword grants invulnerability to whomever wields it. This kris – an asymmetrical, wavy dagger – plays a major part in Malaysian mythology, often attributed to the admiral Hang Tuah. The sword could independently shoot out of its sheathe to protect its wielder.)
        Muramasa Sengo, (Swords made by Muramasa Sengo were imbued with violent qualities, especially the ability to possess their wielders.
        Green Dragon Crescent, (a guandao (a heavy, curved blade with a spike on the back attached to a pole) wielded by the general Guan Yu. The blade was so deadly that it was also known as the Frost Fair Blade since during battles in the snow, the blade would be consistently coated in blood which would freeze into a layer of frost.
        Mjölnir, (The hammer was created when Loki challenged two dwarves, Brokkr and Eitri, to create items more beautiful than those created by the Sons of Ivaldi.
        Shamshir-e Zomorrodnegār, (originally property of King Solomon. The sword was said to be guarded by Fulad-zereh, a witch and mother of a ferocious horned demon. She protected it so carefully because this legendary mythological weapon was the only thing capable of killing her son. If a person was wounded by Shamshir-e Zomorrodnegār, the wound could only be treated by a potion made from, among other things, Fulad-zereh’s brain.)
        Ruyi Jingu Bang (magical staff of the immortal monkey king Sun Wukong. The Monkey King went to the underwater kingdom of the Dragon King looking for a weapon to match his strength. After failing to find one, the Dragon Queen suggested to give him a seemingly-useless rod in their treasury which began producing “heavenly light” in the days before his arrival. The rod, weighing 17,550 pounds (7,960 kg), shrank or grew according to Sun Wukong’s will. When unused, the Monkey King shrank it to needle-size and kept it behind his ear.
        link: https://list25.com/25-legendary-mythical-weapons-which-shaped-history/5/
     */