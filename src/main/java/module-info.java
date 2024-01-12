module br.com.ferdbgg {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.ferdbgg to javafx.fxml;
    exports br.com.ferdbgg;
}
