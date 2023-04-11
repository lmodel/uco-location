package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  A lat long coordinates facet is a grouping of characteristics unique to the expression of a geolocation as the intersection of specific latitude, longitude, and altitude values.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class LatLongCoordinatesFacet extends Facet {

  private BigDecimal altitude;
  private BigDecimal latitude;
  private BigDecimal longitude;

}