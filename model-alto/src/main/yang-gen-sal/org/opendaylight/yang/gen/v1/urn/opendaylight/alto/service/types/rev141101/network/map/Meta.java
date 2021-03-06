package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMap;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapMeta;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * container meta {
 *     container vtag {
 *         leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf tag {
 *             type tag-string;
 *         }
 *         uses vtag;
 *     }
 *     uses network-map-meta;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/network-map/meta</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.MetaBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.MetaBuilder
 */
public interface Meta
    extends
    ChildOf<NetworkMap>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>,
    NetworkMapMeta
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","meta");;


}

