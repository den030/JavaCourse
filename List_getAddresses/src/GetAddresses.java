import java.util.ArrayList;
import java.util.List;

public class GetAddresses {

    static List<Address> getAddresses (List<Person> persons){
        ArrayList<Address> addressesNew = new ArrayList<>();
        for (Person x: persons){
            addressesNew.add(x.address);

        }
        return  addressesNew;
    }

}
