package com.luan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/luan/fxml/cadastro.fxml"));
        BorderPane root = fxmlLoader.load();
        
        Scene scene = new Scene(root, 600, 400);
        
        // Carregar CSS (opcional)
        String css = getClass().getResource("/com/luan/css/app.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Sistema de Cadastro");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
