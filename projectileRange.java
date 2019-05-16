// Jaidon Lybbert
// May 11, 2019
// Range of projectile

import java.text.DecimalFormat;

class RangeCalc {

    RangeCalc(double speed, double angleInDegrees, double time) {
        double g, angleInRads, distance;
        String range, maxHeight, height;

        DecimalFormat twoDec = new DecimalFormat("0.00");
        g = 9.8;
        angleInRads = angleInDegrees * Math.PI / 180;

        distance = 2 * speed * speed *
            Math.sin(angleInRads) * Math.cos(angleInRads) / g;
        range = twoDec.format(distance);
        System.out.println("Range = " + range + " meters");

        maxHeight = twoDec.format(Math.tan(angleInRads) * distance / 4);
        System.out.println("Max height = " + maxHeight + " meters");

        height = twoDec.format(speed * Math.sin(angleInRads) * time -
            .5 * g * Math.pow(time, 2));
        System.out.println("Position = " + height + " meters");
    }

    public static void main(String[] arg) {
        new RangeCalc(20,45, .34);
        new RangeCalc(40,17.5,.76);
    }
}
