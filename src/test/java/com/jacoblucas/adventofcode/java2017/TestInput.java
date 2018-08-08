package com.jacoblucas.adventofcode.java2017;

import lombok.Data;
import lombok.NonNull;

@Data
class TestInput<T, U> {
    @NonNull T input;
    @NonNull U output;
}
