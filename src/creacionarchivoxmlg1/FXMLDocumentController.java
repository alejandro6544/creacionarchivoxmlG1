/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivoxmlg1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Estudiante;

/**
 *
 * @author dacastro
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lnombre;
    @FXML
    private Label ltitulo;
    @FXML
    private Label ltelefono;
    @FXML
    private Label lcorreo;
    @FXML
    private Label lcodigo;
    @FXML
    private Label lcarrera;
    @FXML
    private TextField tnombre;
    @FXML
    private TextField ttelefono;
    @FXML
    private TextField tcorreo;
    @FXML
    private TextField tcodigo;
    @FXML
    private TextField tcarrera;

    LinkedList<Estudiante> listaE;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String nombre = tnombre.getText();
        String telefono = ttelefono.getText();
        String correo = tcorreo.getText();
        String codigo = tcodigo.getText();
        String carrera = tcarrera.getText();

        Estudiante objE = new Estudiante(codigo, carrera, nombre, telefono, correo);
        listaE.add(objE);
    }

    @FXML
    private void guardarXML(ActionEvent event) {
        Estudiante objeV = new Estudiante();
        boolean guardar = objeV.crearArchivoXML(listaE);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaE = new LinkedList<>();
    }

}
