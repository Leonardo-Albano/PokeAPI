package br.com.pokedex;

import org.json.JSONArray;
// import org.json.JSONException;
import org.json.JSONObject;

import br.com.pokedex.network.HTTPRequest;
import br.com.pokedex.view.Viewer;
import br.com.pokedex.tools.Functions;

public class App {
    public static void main(String[] args) throws Exception {

        Viewer header = new Viewer();
        Functions functions = new Functions();
        
        while(header.imprimeHeader()==1){
            
            JSONObject object = new HTTPRequest().requestGetMethod("https://pokeapi.co/api/v2/pokemon?limit=151");
            JSONArray array = object.getJSONArray("results");
    
            functions.imprimeArrayNomes(array, object);
            int nPokemon = header.escolhePokemon();
            
            JSONObject pokeObject = array.getJSONObject(nPokemon);
            String pokeUrl = pokeObject.getString("url");

            functions.imprimeName(pokeUrl);
            functions.imprimeArrayTypes(pokeUrl);
            functions.imprimeArrayStats(pokeUrl);
            functions.imprimeArrayAbilities(pokeUrl);   
            functions.imprimeArrayMoves(pokeUrl);

            if (functions.verImg()){
                System.out.println(functions.getPokemonImage(nPokemon)); //corrigir issaqui
            }


            System.out.println("\nPress Enter to continue..");
            System.in.read();
        }
        



    }
}
