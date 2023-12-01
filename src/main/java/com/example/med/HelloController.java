package com.example.med;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.sql.*;
import java.util.Date;

public class HelloController {

    @FXML
    private Button DelDiagnoz;

    @FXML
    private Button DelPatient;

    @FXML
    private Button DelVrach;

    @FXML
    private Button DiagDel;

    @FXML
    private Button DiagDob;

    @FXML
    private TableView<?> Diagnoz;

    @FXML
    private TableColumn<?, ?> DiagnozData;

    @FXML
    private TableColumn<?, ?> DiagnozID;

    @FXML
    private TableColumn<?, ?> DiagnozJaloba;

    @FXML
    private TableColumn<?, ?> DiagnozLechenie;

    @FXML
    private TableColumn<?, ?> DiagnozPatient;

    @FXML
    private TableColumn<?, ?> DiagnozYlychenie;

    @FXML
    private TableColumn<?, ?> DiagnozZabolevanie;

    @FXML
    private Button DobDiagnoz;

    @FXML
    private Button DobPatient;

    @FXML
    private Button DobVrach;

    @FXML
    private BorderPane IstoriaBolezni;

    @FXML
    private BorderPane Menu;

    @FXML
    private Button MenuReturn;

    @FXML
    private Button MenuReturn1;

    @FXML
    private Button MenuReturn2;

    @FXML
    private TextField NumFIO;

    @FXML
    private TextField NumID;

    @FXML
    private TextField NumMedBook;

    @FXML
    private TextField NumPol;

    @FXML
    private TextField NumPolOsn;

    @FXML
    private TextField NumStrash;

    @FXML
    private AnchorPane Osnova;

    @FXML
    private TableColumn<com.example.med.Patient, Date> PatData;

    @FXML
    private TableColumn<com.example.med.Patient, String> PatFIO;

    @FXML
    private TableColumn<com.example.med.Patient, Integer> PatID;

    @FXML
    private TableColumn<com.example.med.Patient, String> PatMesto;

    @FXML
    private TableColumn<com.example.med.Patient, String> PatNomerKnigi;

    @FXML
    private TableColumn<com.example.med.Patient, String> PatNomerPol;

    @FXML
    private Button PatienntDel;

    @FXML
    private Button PatienntDob;

    @FXML
    private TableView<com.example.med.Patient> Patient;

    @FXML
    private TextField PolFIO;

    @FXML
    private TextField PolsData;

    @FXML
    private TextField PolsMesto;

    @FXML
    private Button SilkaBolezn;

    @FXML
    private Button SilkaPatient;

    @FXML
    private Button SilkaVrachi;

    @FXML
    private BorderPane SpisokPatientov;

    @FXML
    private TableColumn<?, ?> Status;

    @FXML
    private ComboBox<?> StatusPoisk;

    @FXML
    private TableView<?> Vrach;

    @FXML
    private Button VrachDob;

    @FXML
    private Button VrachDobav;

    @FXML
    private ComboBox<?> VrachDoljnostCombox;

    @FXML
    private TableColumn<?, ?> VrachFIO;

    @FXML
    private ComboBox<?> VrachFIOCombox;

    @FXML
    private TableColumn<?, ?> VrachID;

    @FXML
    private TextField VrachIDText;

    @FXML
    private TextField VrachPoisk;

    @FXML
    private TableColumn<?, ?> VrachSpec;

    @FXML
    private ComboBox<?> VrachSpecCombox;

    @FXML
    private TableColumn<?, ?> VrachStaj;

    @FXML
    private TextField VrachStajText;

    @FXML
    private BorderPane Vrachi;

    @FXML
    private TextField Zabol;
    ObservableList<Patient> patients;

    @FXML
    void DelDiag(ActionEvent event) {

    }

    @FXML
    void DelPatient(ActionEvent event) {

    }

    @FXML
    void DelVrach(ActionEvent event) {

    }

    @FXML
    void DobDiag(ActionEvent event) {

    }

    @FXML
    void DobPatient(ActionEvent event) {

    }

    @FXML
    void DobVrach(ActionEvent event) {

    }

    @FXML
    void PatientPoiskData(ActionEvent event) {

    }

    @FXML
    void PatientPoiskFIO(ActionEvent event) {

    }

    @FXML
    void PatientPoiskID(ActionEvent event) {

    }

    @FXML
    void PatientPoiskMedBook(ActionEvent event) {

    }

    @FXML
    void PatientPoiskMesto(ActionEvent event) {

    }

    @FXML
    void PatientPoiskStrahPol(ActionEvent event) {

    }

    @FXML
    void PoiskDolgVrach(ActionEvent event) {

    }

    @FXML
    void PoiskFIODiag(ActionEvent event) {

    }

    @FXML
    void PoiskFIOVrach(ActionEvent event) {

    }

    @FXML
    void PoiskIDDiag(ActionEvent event) {

    }

    @FXML
    void PoiskIDVrach(ActionEvent event) {

    }

    @FXML
    void PoiskNumStrahPolDiag(ActionEvent event) {

    }

    @FXML
    void PoiskSpecVrach(ActionEvent event) {

    }

    @FXML
    void PoiskStajVrach(ActionEvent event) {

    }

    @FXML
    void PoiskVrachDiag(ActionEvent event) {

    }

    @FXML
    void PoiskZabDiag(ActionEvent event) {

    }

    @FXML
    void PoskStatus(ActionEvent event) {

    }

    @FXML
    void SpDiag(ActionEvent event) {
        Menu.setVisible(false);
        IstoriaBolezni.setVisible(true);
    }

    @FXML
    void SpPatient(ActionEvent event) {
        Menu.setVisible(false);
        SpisokPatientov.setVisible(true);

        PatID.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("IdPatient"));
        PatNomerPol.setCellValueFactory(new PropertyValueFactory<Patient,String>("InsurancePolicyNumber"));
        PatNomerKnigi.setCellValueFactory(new PropertyValueFactory<Patient,String>("MedicalBookNumber"));
        PatFIO.setCellValueFactory(new PropertyValueFactory<Patient,String>("FIO"));
        PatMesto.setCellValueFactory(new PropertyValueFactory<Patient,String>("PlaceOfResidence"));
        PatData.setCellValueFactory(new PropertyValueFactory<Patient, Date>("DateOfBirth"));

            patients=ZapPat();
        Patient.setItems(patients);
        patients.clear();



    }

    @FXML
    void SpVrach(ActionEvent event) {
        Menu.setVisible(false);
        Vrachi.setVisible(true);
    }

    @FXML
    void returnMenu(ActionEvent event) {
    Menu.setVisible(true);
    Vrachi.setVisible(false);
    IstoriaBolezni.setVisible(false);
    SpisokPatientov.setVisible(false);
    }
    private ObservableList<Patient> ZapPat() {

        try {

            Connection connection  = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/med",
                    "root", "1234");

            ObservableList<Patient> patients1 = FXCollections.observableArrayList();

            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM patient");

            while (results.next()) {
                patients1.add(new Patient(results.getInt("IdPatient"), results.getString("InsurancePolicyNumber"),
                        results.getString("MedicalBookNumber"), results.getString("FIO"),
                        results.getString("PlaceOfResidence"), results.getDate("DateOfBirth")));

            }

            connection.close();
            return patients1;

        } catch (SQLException e) {

            throw new RuntimeException("Error while executing SQL query", e);
        }
    }

}
