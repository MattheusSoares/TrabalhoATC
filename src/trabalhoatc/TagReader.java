package trabalhoatc;

/**
 *
 * @author mattheus
 
 * Classe Singleton - TagReader
 */
class TagReader {
    private static TagReader instance = new TagReader();
    
    private TagReader(){}
    
    public static TagReader getInstance(){
        return instance;
    }
    
    
    
    
    

}
