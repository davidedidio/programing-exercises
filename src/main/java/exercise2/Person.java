package exercise2;

import common.Color;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Value
public class Person {

    Color eyeColor;
    Color hairColor;
    @Accessors(fluent = true)
    boolean hasGlasses;
    String name;

}
