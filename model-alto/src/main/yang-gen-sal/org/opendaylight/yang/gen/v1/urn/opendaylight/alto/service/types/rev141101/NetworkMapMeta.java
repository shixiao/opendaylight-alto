package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping network-map-meta {
 *     container vtag {
 *         leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf tag {
 *             type tag-string;
 *         }
 *         uses vtag;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/network-map-meta</i>
 */
public interface NetworkMapMeta
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","network-map-meta");;

    Vtag getVtag();

}

