package com.practicaljava.unit2;

/**
 * Created by Nadiya Vidman on 27.01.2017.
 */
public class JamseBondCar extends Car {
    int currentSubmergeDepth;
    boolean isGunOnBoard = true;
    final String MANUFACTURER="OPEL";

    void submerge()
    {
        currentSubmergeDepth = 50;
    }

    void surface()
    {

    };
}
