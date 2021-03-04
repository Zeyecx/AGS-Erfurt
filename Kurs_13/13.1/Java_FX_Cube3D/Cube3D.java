
package cube3d;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.DepthTest;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.RectangleBuilder;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Cube3D extends Application {

    private Timeline animation;

    private void init(Stage primaryStage) {
        Group root = new Group();
        root.setDepthTest(DepthTest.ENABLE);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 400, 150, true));
        primaryStage.getScene().setCamera(new PerspectiveCamera());
        root.getTransforms().addAll(
            new Translate(400 / 2, 150 / 2),
            new Rotate(180, Rotate.X_AXIS)
        );
        root.getChildren().add(create3dContent());
    }

    public Node create3dContent() {
        Cube c = new Cube(50,Color.RED,1);
        c.rx.setAngle(45);
        c.ry.setAngle(45);
        Cube c2 = new Cube(50,Color.GREEN,1);
        c2.setTranslateX(100);
        c2.rx.setAngle(45);
        c2.ry.setAngle(45);
        Cube c3 = new Cube(50,Color.ORANGE,1);
        c3.setTranslateX(-100);
        c3.rx.setAngle(45);
        c3.ry.setAngle(45);

        animation = new Timeline();
        animation.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(c.ry.angleProperty(), 0d),
                        new KeyValue(c2.rx.angleProperty(), 0d),
                        new KeyValue(c3.rz.angleProperty(), 0d)
                ),
                new KeyFrame(Duration.seconds(1),
                        new KeyValue(c.ry.angleProperty(), 360d),
                        new KeyValue(c2.rx.angleProperty(), 360d),
                        new KeyValue(c3.rz.angleProperty(), 360d)
                ));
        animation.setCycleCount(Animation.INDEFINITE);

        return new Group(c,c2,c3);
    }

    public void play() {
        animation.play();
    }

    @Override public void stop() {
        animation.pause();
    }

    public class Cube extends Group {
        final Rotate rx = new Rotate(0,Rotate.X_AXIS);
        final Rotate ry = new Rotate(0,Rotate.Y_AXIS);
        final Rotate rz = new Rotate(0,Rotate.Z_AXIS);
        public Cube(double size, Color color, double shade) {
            getTransforms().addAll(rz, ry, rx);
            boolean addAll = getChildren().addAll(
                    RectangleBuilder.create()
                            .width(size).height(size)
                            .fill(color.deriveColor(0.0, 1.0, (1 - 0.5*shade), 1.0))
                            .translateX(-0.5*size)
                            .translateY(-0.5*size)
                            .translateZ(0.5*size)
                            .build(),
                    RectangleBuilder.create()
                            .width(size).height(size)
                            .fill(color.deriveColor(0.0, 1.0, (1 - 0.4*shade), 1.0))
                            .translateX(-0.5*size)
                            .translateY(0)
                            .rotationAxis(Rotate.X_AXIS)
                            .rotate(90)
                            .build(),
                    RectangleBuilder.create()
                            .width(size).height(size)
                            .fill(color.deriveColor(0.0, 1.0, (1 - 0.3*shade), 1.0))
                            .translateX(-1*size)
                            .translateY(-0.5*size)
                            .rotationAxis(Rotate.Y_AXIS)
                            .rotate(90)
                            .build(),
                    RectangleBuilder.create()
                            .width(size).height(size)
                            .fill(color.deriveColor(0.0, 1.0, (1 - 0.2*shade), 1.0))
                            .translateX(0)
                            .translateY(-0.5*size)
                            .rotationAxis(Rotate.Y_AXIS)
                            .rotate(90)
                            .build(),
                    RectangleBuilder.create()
                            .width(size).height(size)
                            .fill(color.deriveColor(0.0, 1.0, (1 - 0.1*shade), 1.0))
                            .translateX(-0.5*size)
                            .translateY(-1*size)
                            .rotationAxis(Rotate.X_AXIS)
                            .rotate(90)
                            .build(),
                    RectangleBuilder.create()
                            .width(size).height(size)
                            .fill(color)
                            .translateX(-0.5*size)
                            .translateY(-0.5*size)
                            .translateZ(-0.5*size)
                            .build()
            );
        }
    }

    @Override public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
        play();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
}
