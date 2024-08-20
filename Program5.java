class MyClass{
    public static void main(String[] args){
        int RoyaleM = 286;
        int KKingM = 412;
        int PFrameM = 361;
        int BadwagonM = 161;
        int RoyaleG = 9;
        int KKingG = 40;
        int PFrameG = 18;
        int BadwagonG = 11;
        double RoyaleMPG;
        double KKingMPG;
        double PFrameMPG;
        double BadwagonMPG;
        
        RoyaleMPG = ((double) RoyaleM / RoyaleG);
        KKingMPG = ((double) KKingM / KKingG);
        PFrameMPG = ((double) PFrameM / PFrameG);
        BadwagonMPG = ((double) BadwagonM / BadwagonG);
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        RoyaleMPG = ((double)((int)((RoyaleMPG * 100) + 0.5)))/100.0;
        System.out.println("Royale averaged "+ RoyaleMPG);
        KKingMPG = ((double)((int)((KKingMPG * 100) + 0.5)))/100.0;
        System.out.println("Koopa King averaged "+ KKingMPG);
        PFrameMPG = ((double)((int)((PFrameMPG * 100) + 0.5)))/100.0;
        System.out.println("Pipe Frame averaged "+ PFrameMPG);
        BadwagonMPG = ((double)((int)((BadwagonMPG * 100) + 0.5)))/100.0;
        System.out.println("Badwagon averaged "+ BadwagonMPG);
    }
}
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.78
Koopa King averaged 10.3
Pipe Frame averaged 20.06
Badwagon averaged 14.64

*/
