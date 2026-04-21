package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
//import views.ListarVehiculosView;
import views.MenuInicio;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        MenuInicio view = new MenuInicio();
        //ListarVehiculosView view = new ListarVehiculosView();
        view.setVisible(true);
    }
}
