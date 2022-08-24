package com.tribble.tribblefast.enums;

import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Test;

import java.util.Set;

/**
 * @author lifan
 * @since 2022/7/21 5:28 PM
 */
public class EnumTest {
    private static final Set<Integer> CAMERA_DETECTOR_TYPE_SET= ImmutableSet.of(
            DetectorTypeEnum.HIGH_CAMERA.type, DetectorTypeEnum.SHORT_CAMERA.type);

    @Test
    void test1() {
        Integer a0 = 0;
        Integer a1 = 1;
        Integer a2 = new Integer(2);
        Integer aNull = null;

        System.out.println(CAMERA_DETECTOR_TYPE_SET.contains(a0)); // false
        System.out.println(CAMERA_DETECTOR_TYPE_SET.contains(a1)); // true
        System.out.println(CAMERA_DETECTOR_TYPE_SET.contains(a2)); // true
        System.out.println(CAMERA_DETECTOR_TYPE_SET.contains(aNull)); // false
    }

}
