package com.pluralsight.optionals;

import java.util.Optional;

public class NewMath {

    public static Optional<Double> sqrt (Double d) {
        //Square root is not defined for negative numbers
        return d > 0d ? Optional.of(Math.sqrt(d))
                      : Optional.empty();
    }

    public static Optional<Double> inv (Double d) {
        // Inverse is not defined for 0
        return d != 0d ? Optional.of(1d/d)
                       : Optional.empty();
    }
}
