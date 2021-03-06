package ic.unicamp.splm.core.data.graph;

import ic.unicamp.splm.core.data.types.VertexType;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Vertex {

    @Getter
    @Setter
    String id;
    @Getter
    @Setter
    VertexType type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        return new EqualsBuilder().append(id, vertex.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).toHashCode();
    }
}
