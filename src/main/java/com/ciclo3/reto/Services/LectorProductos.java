package com.ciclo3.reto.Services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciclo3.reto.Modelos.ProductoModel;

public class LectorProductos {

	public static final char SEPARATOR = ';';
    public static final char QUOTE = '"';
    private BufferedReader br;
    private String ruta = "productos.csv";
    private ProductoService serv;
    
    public LectorProductos() throws IOException {

        try {
            this.br = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectorProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerArchivo() throws IOException {
        String linea = "";
        int i = 0;
        while ((linea = br.readLine()) != null) {
            procesarCadena(linea);
            i++;
        }
    }

    public void procesarCadena(String linea) {
        String datosDeLinea[] = linea.split(",");
        String[] resultado = new String[datosDeLinea.length];

        for (int j = 0; j < datosDeLinea.length; j++) {
            resultado[j] = datosDeLinea[j].replaceAll("^" + QUOTE, "").replaceAll(QUOTE + "$", "");
        }
        anexarProducto(resultado);

    }

    public void anexarProducto(String[]resultado) {

        Long id   = Long.parseLong(resultado[0]);
        Long codigo = Long.parseLong(resultado[1]);
        String nombre    = resultado[2];
        Long nit   = Long.parseLong(resultado[3]);
        double compra = Double.parseDouble(resultado[4]);
        double iva = Double.parseDouble(resultado[5]);
        double precio = Double.parseDouble(resultado[6]);
        
        ProductoModel Producto = new ProductoModel(id,codigo,nombre,nit,compra,iva,precio);
        serv.GuardarProducto(Producto);
    }
    
    public void imprimirListaClientes() {
       for (ProductoModel prod : serv.ObtenerProductos()) {
             prod.toString();
        }    
    }


}
