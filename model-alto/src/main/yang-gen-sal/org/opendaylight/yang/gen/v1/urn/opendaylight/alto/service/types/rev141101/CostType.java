package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMetric;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMode;


/**
 * Cost type. RFC7285 Sec. 10.7. object { CostMetric cost-metric; CostMode 
 * cost-mode; [JSONString description;] } CostType;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping cost-type {
 *     leaf cost-mode {
 *         type cost-mode;
 *     }
 *     leaf cost-metric {
 *         type cost-metric;
 *     }
 *     leaf description {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/cost-type</i>
 */
public interface CostType
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","cost-type");;

    /**
     * Cost mode.
     */
    CostMode getCostMode();
    
    /**
     * Cost metric.
     */
    CostMetric getCostMetric();
    
    /**
     * Optional description field.
     */
    java.lang.String getDescription();

}

