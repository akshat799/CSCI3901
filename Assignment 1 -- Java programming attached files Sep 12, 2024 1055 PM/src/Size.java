import java.util.ArrayList;
import java.util.Arrays;

public class Size {

    private ArrayList<String> units = new ArrayList<>(Arrays.asList("g", "kg", "ml", "l"));
    public Size(){
    }

    private boolean validateSpaceinSize(String size){
        String[] values = size.split(" ");

        if(values.length == 2 && units.contains(values[1])){
            return true;
        }else{
            return false;
        }
    }

    private boolean validateEmptySize(String size){
        if(size.trim().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    private boolean validateFloatSize(String size){
        String[] values = size.split(" ");
        try{
            float checkSize = Float.parseFloat(values[0]);
            return checkSize > 0;
        }catch(Exception e){
            return false;
        }

    }

    public float getSize (String size){
        String[] values = size.split(" ");
        float newSize = Float.parseFloat(values[0]);

        if(values[1].toLowerCase() == "kg" || values[1].toLowerCase() == "l"){
            newSize *= 1000;
        }

        return newSize;
    }

    public String getUnit (String size){
        String[] values = size.split(" ");
        if(values[1].toLowerCase() == "kg"){
            return "g";
        }
        return "ml";
    }

    public boolean sizeValidator (String size){
        if(validateEmptySize(size) && validateSpaceinSize(size) && validateFloatSize(size)){
            return true;
        }

        return false;
    }
}
