package week14;

import java.util.Date;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Class14_7_3_CRM_system_AssertFalse_in_JUnit_Java {
}

class CRM {
    private Date upgradeDate;
    private boolean busy;
    private String version;

    public CRM() {
        this.upgradeDate = null;
        this.busy = false;
        this.version = null;
    }

    public void upgrade(Date upgradeDate) {
        this.upgradeDate = upgradeDate;
        this.busy = true;
        System.out.println("CRM upgrade is scheduled");
    }

    public boolean isBusy() {
        return busy;
    }

    public void occupied() {
        busy = true;
        System.out.println("CRM is now occupied.");
    }

    public void release() {
        busy = false;
        System.out.println("CRM is released.");
    }

    public String version() {
        return version;
    }

    public void updateVersion(String newVersion) {
        if (version == null || !version.equals(newVersion)) {
            version = newVersion;
            System.out.println("CRM version updated");
        } else {
            version = null;
            System.out.println("CRM version set to null (no change).");
        }
    }
}

class MainTest7_3 {
    @Test
    public void testUpgrade(){
        CRM crm = new CRM();
        assertFalse(crm.isBusy());
        Date upgradeData = new Date();
        upgradeData.setTime(1000);
        crm.upgrade(upgradeData);
        assertTrue(crm.isBusy());

    }

    @Test
    public void testIsBusy(){
        CRM crm = new CRM();
        assertFalse(crm.isBusy());

        Date upgradeData = new Date();
        upgradeData.setTime(1000);
        crm.upgrade(upgradeData);
        assertTrue(crm.isBusy());

        crm.release();
        assertFalse(crm.isBusy());

    }

    @Test
    public void testOccupied(){
//        Date upgradeData = new Date();
//        upgradeData.setTime(1000);
        CRM crm = new CRM();
        assertFalse(crm.isBusy());
        crm.occupied();
        assertFalse(crm.isBusy());
    }

    @Test
    public void testRelease(){

        CRM crm = new CRM();
        assertFalse(crm.isBusy());

        Date upgradeData = new Date();
        upgradeData.setTime(1000);
        crm.upgrade(upgradeData);

        assertTrue(crm.isBusy());

        crm.release();
        assertTrue(crm.isBusy());
    }

    @Test
    public void testVersion(){
        CRM crm = new CRM();
        crm.upgrade(new Date());
    }

    @Test
    public void testUpdateVersion(){
    CRM crm = new CRM();
    crm.upgrade(new Date());

    String newVersion = "1.0";
    crm.updateVersion(newVersion);

    assertEquals(newVersion,crm.version());

    crm.updateVersion(newVersion);
    }
}

