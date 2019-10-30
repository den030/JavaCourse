import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestGetAddresses {

    @Test
        public void getAddresses(){

        ArrayList<Address> addressList = new ArrayList<>();
        ArrayList<Person> personsList = new ArrayList<>();

        addressList.add(new Address("Street1", 44) );
        addressList.add(new Address("Street2", 87) );
        addressList.add(new Address("Street3", 9) );
        addressList.add(new Address("Street4", 6) );
        addressList.add(new Address("Street7", 6) );

        personsList.add(new Person("Andy", addressList.get(0)));
        personsList.add(new Person("Bob", addressList.get(1)));
        personsList.add(new Person("Clinton", addressList.get(2)));
        personsList.add(new Person("Dima", addressList.get(3)));

     //   assertEquals(" ", );
// здесь я не понимаю что с чем нужно сравнивать для теста,

    }
}
