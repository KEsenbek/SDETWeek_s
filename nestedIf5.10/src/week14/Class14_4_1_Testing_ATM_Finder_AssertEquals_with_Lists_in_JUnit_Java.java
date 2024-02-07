package week14;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Class14_4_1_Testing_ATM_Finder_AssertEquals_with_Lists_in_JUnit_Java {
}

class ATM {
    private String location;
    private String city;
    private String zipCode;

    public ATM(String location, String city, String zipCode) {
        this.location = location;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getLocation() {
        return location;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public static List<ATM> findATMsNearZipCode(String zipCode, List<ATM> allATMs) {
        List<ATM> atmsNearZipCode = new ArrayList<>();

        for (ATM atm : allATMs) {
            if (atm.getZipCode().equals(zipCode)) {
                atmsNearZipCode.add(atm);
            }
        }

        if(atmsNearZipCode.isEmpty()){
            System.out.println("No Matching ATMs found");
        }
        else if(atmsNearZipCode.size() == 1) {
            System.out.println("1 matching atm found");
        }
        else if(atmsNearZipCode.size() > 1) {
            System.out.println("multiple matching atms found");
        }
        else if(allATMs.isEmpty()){
            System.out.println("Empty ATM list provided");
        }

        return atmsNearZipCode;
    }
}



class MainTest4_1 {
    @Test
    public void testFindATMsNearZipCode_SingleMatchingATM() {
        //for when there's only one ATM that matches the zip code.
        List<ATM> allATMs = new ArrayList<>();
        allATMs.add(new ATM("Location1", "City1", "12345"));
        allATMs.add(new ATM("Location2", "City2", "67890"));
        allATMs.add(new ATM("Location3", "City3", "54321"));
        String targetZipCode = "12345";
        List<ATM> atmsNearZipCode = ATM.findATMsNearZipCode(targetZipCode, allATMs);
        assertEquals(1, atmsNearZipCode.size());
        assertEquals(targetZipCode, atmsNearZipCode.get(0).getZipCode());
    }
    @Test
    public void testFindATMsNearZipCode_MultipleMatchingATMs(){
        //for when there are multiple ATMs that match
        List<ATM> atmList = new ArrayList<>();
        atmList.add(new ATM("Kyrgyzstan", "Bishkek","720001"));
        atmList.add(new ATM("Kyrgyzstan", "Bishkek","720001"));
        atmList.add(new ATM("Kyrgyzstan", "Bishkek","720002"));

        String zipCode = "720001";
        List<ATM> atmsNearZipCode = ATM.findATMsNearZipCode(zipCode,atmList);

        assertEquals(2,atmsNearZipCode.size());
    }

    @Test
    public void testFindATMsNearZipCode_NoMatchingATMs (){
        // for when there are no matching ATMs.
        List<ATM> atmList = new ArrayList<>();
        atmList.add(new ATM("Kyrgystan","Bishkek","720001"));
        atmList.add(new ATM("Kyrgystan","Bishkek","720001"));
        atmList.add(new ATM("Kyrgystan","Bishkek","720001"));

        String zipCode = "720000";
        List <ATM> answer = new ArrayList<>();
        assertEquals(answer, ATM.findATMsNearZipCode(zipCode,atmList));
    }

    @Test
    public void testFindATMsNearZipCode_EmptyATMList(){
        //for when there are no ATMs at all
        List<ATM> atmList = new ArrayList<>();

        List<ATM> atms = new ArrayList<>();

        assertEquals(atms, ATM.findATMsNearZipCode("720001",atmList) );

    }
}
