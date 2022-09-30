package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemperatura;


public class Principal {

	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				if(ValidarNumero(input)==true) {
					
				
					double valorRecibido = Double.parseDouble(input);
					conversion.ConvertirMonedas(valorRecibido);
				
				
				    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				    if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				    } else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				    }
				}else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
				
			case "Conversor de Temperatura":
			    input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				if(ValidarNumero(input)==true) {
					double valorRecibidoT = Double.parseDouble(input);
					conversionT.ConvertirTemperaturas(valorRecibidoT);
				    int respuestaT=0;
				
				     respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				     if((respuestaT == 0 )&&(ValidarNumero(input)==true)) {
			
				     } else {
					     JOptionPane.showMessageDialog(null, "Programa finalizado");
				     }
				}else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				
				break;
	        }
	
          }
	
	}
	
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x>=0 || x<0)
				;
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
}
