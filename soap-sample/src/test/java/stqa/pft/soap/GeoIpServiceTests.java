package stqa.pft.soap;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Andrii.Fiedosieiev on 7/19/2017.
 */
public class GeoIpServiceTests {

    @Test
    public void testMyIp(){
        GeoIP geoIP = new GeoIPService().getGeoIPServiceSoap12().getGeoIP("96.89.234.105");
        Assert.assertEquals(geoIP.getCountryCode(), "USA");
    }

    @Test
    public void testInvalidIp(){
        GeoIP geoIP = new GeoIPService().getGeoIPServiceSoap12().getGeoIP("96.89.234.xxx");
        Assert.assertEquals(geoIP.getCountryCode(), "USA");
    }
}
