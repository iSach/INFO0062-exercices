package be.isach.oopexercices.tp7;

public abstract class Transformation {

    protected double ratio;
    // angles between each new sub segment and the initial segment.
    protected double[] angles;

    public Transformation(double ratio) {
        this.ratio = ratio;
        this.angles = null;
    }

    public Segment transform(Segment in) {
        double length = in.getLength() / ratio;
        double angle = in.getAngle();

        in.scale(1 / ratio);

        Segment currSeg = in;
        for(int i = 0; i < angles.length; i++) {
            Segment nextSeg = new Segment(length, angle + angles[i]);
            currSeg.setNext(nextSeg);
            currSeg = nextSeg;
        }
        return currSeg;
    }

}
