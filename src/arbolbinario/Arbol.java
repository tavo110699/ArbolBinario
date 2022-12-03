/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author gustavomartinezlicona
 */
public class Arbol {
    Cola Cola = new Cola();
	NodoBinario Padre;
	NodoBinario Raiz;
 
	//Constructor
	public Arbol(){
		Raiz = null;
	}
 
	//Insercion de un elemento en el arbol
	public void InsertaNodo(int Elem){
		if(Raiz == null)
			Raiz = new NodoBinario (Elem);
		else
			Raiz.InsertaBinario (Elem);
	}
 
	//Preorden Recursivo del arbol
	public void Preorden (NodoBinario Nodo){
		if(Nodo == null)
			return;
		else{
			System.out.print (Nodo.dato + " ");
			Preorden (Nodo.Hizq);
			Preorden (Nodo.Hder);
		}
	}
 
	//PostOrden recursivo del arbol
	public void PostOrden (NodoBinario Nodo){
		if(Nodo == null)
			return;
		else{
			PostOrden (Nodo.Hizq);
			PostOrden (Nodo.Hder);
			System.out.print (Nodo.dato + " ");
		}
	}
 
	//Inorden Recursivo del arbol
	public void Inorden (NodoBinario Nodo){
		if(Nodo == null)
			return;
		else{
			Inorden (Nodo.Hizq);
			System.out.print(Nodo.dato + " ");
			Inorden (Nodo.Hder);
		}
	}
 
	//Busca un elemento en el arbol
	public void Busqueda (int Elem, NodoBinario A){
		if((A == null) | (A.dato == Elem)){
			System.out.print(A.dato + " ");
			return;
		}
		else{
			if(Elem>A.dato)
				Busqueda (Elem, A.Hder);
			else
				Busqueda ( Elem, A.Hizq);
		}
	}
 
	//Altura del arbol
	public int Altura (NodoBinario Nodo){
		int Altder = (Nodo.Hder == null? 0:1 + Altura (Nodo.Hder));
		int Altizq = (Nodo.Hizq == null? 0:1 + Altura (Nodo.Hizq));
		return Math.max(Altder,Altizq);
	}
 
	//Recorrido en anchura del arbol
	public void Anchura (NodoBinario Nodo){
		Cola cola= new Cola();
		NodoBinario T = null;
		System.out.print ("El recorrido del arbol es: ");
		if(Nodo != null){
			cola.InsertaFinal (Nodo);
			while(!(cola.VaciaLista ())){
				T = cola.PrimerNodo.datos;
				cola.EliminaInicio();
				System.out.print(T.dato + " ");
				if (T.Hizq != null)
					cola.InsertaFinal (T.Hizq);
				if (T.Hder != null)
					cola.InsertaFinal (T.Hder);
			}
		}
		System.out.println();
	}
        
        	//Calcular el promedio de los nodos
	public void PromedioNodos(NodoBinario Nodo){
		Cola cola= new Cola();
		NodoBinario T = null;
                int count =0;
                float prom = 0;
                int maximo = 0;
		System.out.print ("El promedio de los nodos es: ");
		if(Nodo != null){
			cola.InsertaFinal (Nodo);
			while(!(cola.VaciaLista ())){
				T = cola.PrimerNodo.datos;
				cola.EliminaInicio();
                                count++;
                                prom = prom + T.dato;
                                if (maximo < T.dato)
                                        maximo = T.dato;
				if (T.Hizq != null)
					cola.InsertaFinal (T.Hizq);
				if (T.Hder != null)
					cola.InsertaFinal (T.Hder);
			}
                        prom = prom/count;
                                System.out.print(prom);
		}
                System.out.println();
		System.out.println("El valor mas alto del arbol es: "+maximo);
                
	}
        
         //Contar los nodos
	public void TotalNodos(NodoBinario Nodo){
		Cola cola= new Cola();
		NodoBinario T = null;
                int count =0;
      
		System.out.print ("El total de nodos es: ");
		if(Nodo != null){
			cola.InsertaFinal (Nodo);
			while(!(cola.VaciaLista ())){
				T = cola.PrimerNodo.datos;
				cola.EliminaInicio();
                                count++;
                            
				if (T.Hizq != null)
					cola.InsertaFinal (T.Hizq);
				if (T.Hder != null)
					cola.InsertaFinal (T.Hder);
			}
                 
                                System.out.print(count);
		}
		System.out.println();
	}
}
