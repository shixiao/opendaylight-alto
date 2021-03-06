package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput
 */
public class FilteredCostMapServiceOutputBuilder {

    private FilteredCostMapService _filteredCostMapService;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>> augmentation = new HashMap<>();

    public FilteredCostMapServiceOutputBuilder() {
    } 

    public FilteredCostMapServiceOutputBuilder(FilteredCostMapServiceOutput base) {
        this._filteredCostMapService = base.getFilteredCostMapService();
        if (base instanceof FilteredCostMapServiceOutputImpl) {
            FilteredCostMapServiceOutputImpl _impl = (FilteredCostMapServiceOutputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public FilteredCostMapService getFilteredCostMapService() {
        return _filteredCostMapService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FilteredCostMapServiceOutputBuilder setFilteredCostMapService(FilteredCostMapService value) {
        this._filteredCostMapService = value;
        return this;
    }
    
    public FilteredCostMapServiceOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FilteredCostMapServiceOutput build() {
        return new FilteredCostMapServiceOutputImpl(this);
    }

    private static final class FilteredCostMapServiceOutputImpl implements FilteredCostMapServiceOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput.class;
        }

        private final FilteredCostMapService _filteredCostMapService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>> augmentation = new HashMap<>();

        private FilteredCostMapServiceOutputImpl(FilteredCostMapServiceOutputBuilder base) {
            this._filteredCostMapService = base.getFilteredCostMapService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public FilteredCostMapService getFilteredCostMapService() {
            return _filteredCostMapService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_filteredCostMapService == null) ? 0 : _filteredCostMapService.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput)obj;
            if (_filteredCostMapService == null) {
                if (other.getFilteredCostMapService() != null) {
                    return false;
                }
            } else if(!_filteredCostMapService.equals(other.getFilteredCostMapService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FilteredCostMapServiceOutputImpl otherImpl = (FilteredCostMapServiceOutputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("FilteredCostMapServiceOutput [");
            boolean first = true;
        
            if (_filteredCostMapService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_filteredCostMapService=");
                builder.append(_filteredCostMapService);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
