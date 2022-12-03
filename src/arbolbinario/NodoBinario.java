/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;


public class NodoBinario {
    	int dato;
	NodoBinario Hizq, Hder;
	//Constructores
	NodoBinario (int Elem){
		dato = Elem;
		NodoBinario Hizq, Hder = null;
	}
 
	//Insercion de un elemento
	public void InsertaBinario (int Elem){
		if(Elem < dato){
			if (Hizq == null)
				Hizq = new NodoBinario(Elem);
			else
				Hizq.InsertaBinario(Elem);
		}
		else{
			if (Elem > dato){
				if (Hder == null)
					Hder = new NodoBinario (Elem);
				else
					Hder.InsertaBinario(Elem);
			}
		}
	}
}
