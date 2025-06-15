module ph.edu.dlsu.lbycpei.loginexample {
    requires javafx.controls;
    requires javafx.fxml;

    opens ph.edu.dlsu.lbycpei.loginexample to javafx.fxml;
    exports ph.edu.dlsu.lbycpei.loginexample;
}
