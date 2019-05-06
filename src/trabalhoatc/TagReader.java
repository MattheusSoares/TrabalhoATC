package trabalhoatc;

import java.util.ArrayList;

/**
 *
 * @author mattheus
 *
 * Classe Singleton - TagReader
 */
class TagReader {

    private static TagReader instance = new TagReader();

    private ArrayList<ArrayList<String>> dict = new ArrayList<ArrayList<String>>();

    private TagReader() {
    }

    public static TagReader getInstance() {
        return instance;
    }

    public ArrayList<ArrayList<String>> getDict() {
        return dict;
    }

    public void setDict(ArrayList<ArrayList<String>> dict) {
        this.dict = dict;
    }

    public String getTagValue(String tag) {

        for (int i = 0; i < this.dict.size(); i++) {
            if (this.dict.get(i).get(0).equals(tag)) {
                return this.dict.get(i).get(1);
            }
        }
        return null;
    }

    public String getTagByValue(String value) {
        for (int i = 0; i < this.dict.size(); i++) {
            if (this.dict.get(i).get(1).equals(value)) {
                return this.dict.get(i).get(0);
            }
        }
        return null;
    }
    
    public ArrayList<String> getAllTags() {
        ArrayList<String> aux = new ArrayList<>();
        for (int i = 0; i < this.dict.size(); i++) {
           aux.add(this.dict.get(i).get(0));
        }
        return aux;
    }

    public void setNewTag(String tag, String value) {
        ArrayList<String> aux = new ArrayList<>();
        aux.add(tag);
        aux.add(value);
        this.dict.add(aux);
    }

    public void deleteTag(String tag, String value) {
        for (int i = 0; i < this.dict.size(); i++) {
            if (this.dict.get(i).get(0).equals(tag) && this.dict.get(i).get(1).equals(value)) {
                this.dict.get(i).remove(0);
                this.dict.get(i).remove(1);
                this.dict.remove(i);
            }
        }
    }
    
    public Integer verifyValue(){
        
        
        
        return 0;
    }

}
