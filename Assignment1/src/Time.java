import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    SimpleDateFormat dateChecker = new SimpleDateFormat("yyyy/MM/dd");

    public Time(){
        this.dateChecker.setLenient(false);
    }

    private boolean validateEmptyDate(String date){
        if(date.trim().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    private boolean validateDateFormat(String date){
        try{
            Date newDate = this.dateChecker.parse(date);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Date getDate (String date){
        try{
            Date newDate = this.dateChecker.parse(date);
            return newDate;
        }catch(Exception e){
            return null;
        }
    }

    public boolean dateValidator (String date){
        if(validateEmptyDate(date) && validateDateFormat(date)){
            return true;
        }

        return false;
    }
}
