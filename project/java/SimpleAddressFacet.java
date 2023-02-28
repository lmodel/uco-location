package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  A simple address facet is a grouping of characteristics unique to a geolocation expressed as an administrative address.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class SimpleAddressFacet extends Facet {

  private String addressType;
  private String country;
  private String locality;
  private String postalCode;
  private String region;
  private String street;

}