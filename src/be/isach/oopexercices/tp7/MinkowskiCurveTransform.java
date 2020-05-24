package be.isach.oopexercices.tp7;

public class MinkowskiCurveTransform extends Transformation {

    public MinkowskiCurveTransform() {
        super(4);
        angles = new double[]{-Math.PI / 2, 0, Math.PI / 2, Math.PI / 2, 0, -Math.PI / 2, 0};
    }
}
