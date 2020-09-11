package com.example.facemaker;
import java.util.Random;
/**
 * Class to create a face
 * @author Lindsey Warren
 */
public class Face {
        private int skinColor;
        private int eyeColor;
        private int hairColor;
        private int hairStyle;

        Face(int skinColor, int eyeColor, int hairColor, int hairStyle) {
            randomize();
        }

        /**
         * Method to initialize variables to random values
         */
        public void randomize() {
            Random random = new Random();
            skinColor = random.nextInt(255);
            eyeColor = random.nextInt(255);
            hairColor = random.nextInt(255);
            hairStyle = random.nextInt(3) + 1;
        }
}
