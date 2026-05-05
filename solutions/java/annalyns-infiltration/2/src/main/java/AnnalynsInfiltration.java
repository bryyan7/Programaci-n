class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake){
            return false;
        }
        else if ((!knightIsAwake || !archerIsAwake || !prisonerIsAwake) || (knightIsAwake && archerIsAwake && prisonerIsAwake)){
        return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!archerIsAwake && prisonerIsAwake){
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (!prisonerIsAwake && !petDogIsPresent && !archerIsAwake && !knightIsAwake){
            return false;
        }
        else if (petDogIsPresent && !archerIsAwake){
            return true;
        }
        else if (!petDogIsPresent && !archerIsAwake && !knightIsAwake){
            return true;
        }
        return false;
    }
}
