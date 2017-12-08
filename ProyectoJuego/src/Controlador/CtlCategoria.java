
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.GenericoDAO;
import Modelo.Categoria;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class CtlCategoria {

    String tabla = "categoria";

    public String convertirGson(Categoria categoria) {
        Gson gson = new Gson();
        String objeto = gson.toJson(categoria);
        return objeto;
    }

    public boolean SolicitudGuardar(String nombre) {
        Categoria categoria = new Categoria(nombre);
        GenericoDAO catDAO = new GenericoDAO();
        String objeto = convertirGson(categoria);
        return catDAO.guardar(objeto, tabla);
    }

    public ArrayList<Categoria> SolicitudBuscar(String nombre) {
        Categoria categoria = new Categoria("");
        GenericoDAO catDAO = new GenericoDAO();
        String objeto = convertirGson(categoria);
        ResultSet atributos = catDAO.buscar(objeto, tabla, nombre);
        ArrayList<Categoria> listaCategorias = new ArrayList<>();
        try {
            while (atributos.next()) {
                categoria.setIdCategoria(Integer.parseInt(atributos.getString("idCategoria")));
                categoria.setNombre(atributos.getString("nombre"));
                listaCategorias.add(categoria);
            }
        } catch (Exception e) {
            return null;
        }
        return listaCategorias;
    }

    public Categoria SolicitudBuscarUno(String nombre) {
        Categoria categoria = new Categoria("");
        GenericoDAO catDAO = new GenericoDAO();
        String objeto = convertirGson(categoria);
        ResultSet atributos = catDAO.buscar(objeto, tabla, nombre);
        boolean comprobar = false;
        try {
            while (atributos.next()) {
                categoria.setIdCategoria(Integer.parseInt(atributos.getString("idCategoria")));
                categoria.setNombre(atributos.getString("nombre"));
                comprobar = true;
            }
        } catch (Exception e) {
            return null;
        }
        if (comprobar) {
            return categoria;
        } else {
            return null;
        }
    }

    public Categoria SolicitudBuscarUnoPorID(int id) {
        Categoria categoria = new Categoria("");
        GenericoDAO catDAO = new GenericoDAO();
        String objeto = convertirGson(categoria);
        ResultSet atributos = catDAO.buscarVarios("idCategoria", tabla, id);
        boolean comprobar = false;
        try {
            while (atributos.next()) {
                categoria.setIdCategoria(Integer.parseInt(atributos.getString("idCategoria")));
                categoria.setNombre(atributos.getString("nombre"));
                comprobar = true;
            }
        } catch (Exception e) {
            return null;
        }
        if (comprobar) {
            return categoria;
        } else {
            return null;
        }
    }

    public boolean SolicitudModificar(int idCategoria, String nombre) {
        Categoria categoria = new Categoria(idCategoria, nombre);
        GenericoDAO catDAO = new GenericoDAO();
        String objeto = convertirGson(categoria);
        return catDAO.modificar(objeto, tabla, "idCategoria", idCategoria);
    }

    public boolean SolicitudEliminar(int idCategoria) {
        Categoria categoria = new Categoria();
        GenericoDAO catDAO = new GenericoDAO();
        String objeto = convertirGson(categoria);
        return catDAO.eliminar(objeto, tabla, idCategoria);
    }

    public DefaultTableModel SolicitudListar() {
        GenericoDAO usuarioDAO = new GenericoDAO();
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"ID", "Nombre"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet atributos = usuarioDAO.listar(tabla);
        try {
            while (atributos.next()) {
                modelTabla.addRow(new Object[]{
                    atributos.getString("idCategoria"),
                    atributos.getString("nombre")
                });
            }
        } catch (Exception e) {

        }
        return modelTabla;
    }

    public Categoria CategoriaSeleccionada(int pos) {
        ArrayList<Categoria> listaCategoria = this.SolicitudBuscar("");

        Categoria categoria = listaCategoria.get(pos);

        return categoria;
    }

    public DefaultTableModel ListarBusqueda(ArrayList<Categoria> listaCategoria) {
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"ID", "Nombre"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        try {
            for (int i = 0; i < listaCategoria.size(); i++) {
                modelTabla.addRow(new Object[]{
                    listaCategoria.get(i).getIdCategoria(),
                    listaCategoria.get(i).getNombre()
                });
            }
        } catch (Exception e) {

        }
        return modelTabla;
    }
}
