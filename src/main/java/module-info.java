module com.mycompany.teste_git {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.teste_git to javafx.fxml;
    exports com.mycompany.teste_git;
}
