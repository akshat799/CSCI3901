public class Price {
    public Price(){
    }

    private boolean validateEmptyCost(String cost){
        if(cost.trim().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    private boolean validateFloatCost(String cost){
        try{
            float checkCost = Float.parseFloat(cost);
            return checkCost >= 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public float getCost (String cost){
        float newCost = Float.parseFloat(cost);

        return newCost;
    }

    public boolean costValidator (String cost){
        if(validateEmptyCost(cost) && validateFloatCost(cost)){
            return true;
        }

        return false;
    }
}
