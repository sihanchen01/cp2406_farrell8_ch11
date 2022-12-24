import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) throws WrongAddressException{
        //Parameter address must contain at least one digit (\\d);
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(address);

        if(matcher.find()){
            this.rate = 15;
            this.address = address;
        }else{
            this.rate = 0;
            throw new WrongAddressException("Address must include at least one digit");
        }
    }
}
