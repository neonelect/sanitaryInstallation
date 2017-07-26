package main.bean.base;

import main.enums.Unit;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Depth object - if different units are used, units must be enclosed with value.
 *
 * Created by neonelect <neonelect91@gmail.com>
 */
public class Depth {

    private double depth;
    private Unit unit;

    private Depth() {
    }

    public Depth(double depth, Unit unit) {
        this.depth = depth;
        this.unit = unit;
    }

    public double getDepth() {
        return depth;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        Depth other = (Depth) o;
        return new EqualsBuilder()
                .append(this.depth, other.getDepth())
                .append(this.unit, other.getUnit())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.depth)
                .append(this.unit)
                .hashCode();
    }
}
