package com.hugh.java17.pJdk08Or9TryCatch;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class jdk8T3D extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. 创建 3D 立方体（Box）
        Box cube = new Box(100, 100, 100); // 长宽高均为 100

        // 2. 设置立方体材质（颜色、反光等）
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLUE); // 漫反射颜色
        material.setSpecularColor(Color.WHITE); // 高光颜色
        cube.setMaterial(material);

        // 3. 将立方体放入 3D 场景容器
        Group root = new Group(cube);
        Scene scene = new Scene(root, 800, 600, true); // 第三个参数为 true 启用 3D 效果

        // 4. 设置场景相机（默认相机视角可能看不到 3D 效果，需调整）
        scene.setCamera(new javafx.scene.PerspectiveCamera());

        // 5. 添加旋转动画
        RotateTransition rotate = new RotateTransition(Duration.seconds(5), cube);
        rotate.setAxis(Rotate.Y_AXIS); // 绕 Y 轴旋转
        rotate.setByAngle(360); // 旋转 360 度
        rotate.setCycleCount(RotateTransition.INDEFINITE); // 无限循环
        rotate.play();

        // 6. 显示窗口
        primaryStage.setTitle("JavaFX 3D 示例");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // 启动 JavaFX 应用
    }
}