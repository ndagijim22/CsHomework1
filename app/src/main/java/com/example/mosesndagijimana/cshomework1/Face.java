package com.example.mosesndagijimana.cshomework1;
/**
 * @Author: Moses Ndagijimana
 *
 * Class name: Face
 * Properties: skinColor: int, eyeColor: int, hairColor: int, hairstyle: int
 * methods: a constructor which initiate the object of the class.
 */


public class Face {
    int skinColor;
    int eyeColor;
    int hairColor;

    /**
     * Construct to initialize the object of the class
     * parameter:
     *          -skinColor: type int: identifies the color of the skin
     *          -eyeColor: type int: identifies the color of the eye
     *          -hairColor: type int: identifies the color of the hair
     *          -hairStyle: type int: identifies which eye style the face has.
     */
    public Face(int skinColor, int eyeColor, int hairColor){
        skinColor = skinColor;
        eyeColor = eyeColor;
        hairColor = hairColor;
    }
}




