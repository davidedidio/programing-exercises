package common.exercise3;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class FurnaceBot {

    int shellSerialNumber;
    int furnaceNumber;
}
